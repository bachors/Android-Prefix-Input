package com.bachors.prefixinput;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;

/**
 * @author Ican Bachors
 * @version 1.1
 * Issues: https://github.com/bachors/Android-Prefix-Input/issues
 */

public class EditText extends android.support.v7.widget.AppCompatEditText {
    private String prefix, fix;

    public EditText(Context context) {
        super(context);
        this.prefix = this.getText().toString().trim();
        init();
    }

    public EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.prefix = this.getText().toString().trim();
        init();
    }

    public EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.prefix = this.getText().toString().trim();
        init();
    }

    public void setPrefix(String s) {
        this.prefix = s.trim();
        setText(s);
    }

    private void init() {
        addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                fix = s.toString().replace(prefix, "");
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String string = s.toString();
                int fl = prefix.length();
                int sl = string.length();
                if(sl < fl){
                    String in = prefix;
                    setText(in);
                    setSelection(in.length());
                }else {
                    String cek = string.substring(0,fl);
                    if(!cek.equals(prefix)) {
                        if(string.matches(rubah(prefix))) {
                            String in = prefix + string.replace(prefix, "");
                            setText(in);
                            setSelection(in.length());
                        }else{
                            String in = prefix + fix;
                            setText(in);
                            setSelection(in.length());
                        }
                    }
                }
            }
        });
    }

    private String rubah(String s) {
        s = s.replace("+", "\\+").replace("$", "\\$").replace("^", "\\^").replace("*", "\\*").replace("?", "\\?");
        return s;
    }
}
