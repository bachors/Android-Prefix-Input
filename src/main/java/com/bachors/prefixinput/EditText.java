package com.bachors.prefixinput;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;

/**
 * @author Ican Bachors
 * @version 1.0
 * Issues: https://github.com/bachors/Android-Prefix-Input/issues
 */

public class EditText extends android.support.v7.widget.AppCompatEditText {
    private String prefix, fix;

    public EditText(Context context) {
        super(context);
        this.prefix = rubah(this.getText().toString().trim(), true);
        init();
    }

    public EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.prefix = rubah(this.getText().toString().trim(), true);
        init();
    }

    public EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.prefix = rubah(this.getText().toString().trim(), true);
        init();
    }

    private void init() {
        addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                fix = rubah(s.toString(), true).replaceAll(prefix, "");
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String string = rubah(s.toString(), true);
                int fl = prefix.length();
                int sl = string.length();
                if(sl < fl){
                    String in = rubah(prefix, false);
                    setText(in);
                    setSelection(in.length());
                }else {
                    String cek = string.substring(0,fl);
                    if(!cek.equals(prefix)) {
                        if(string.matches(prefix)) {
                            String in = rubah(prefix + string.replaceAll(prefix, ""), false);
                            setText(in);
                            setSelection(in.length());
                        }else{
                            String in = rubah(prefix + fix, false);
                            setText(in);
                            setSelection(in.length());
                        }
                    }
                }
            }
        });
    }

    private String rubah(String s, boolean b) {
        if(b) {
            s = s.replace("+", "BACHORStambah").replace("$", "BACHORSdollar").replace("^", "BACHORShalis").replace("*", "BACHORSbintang").replace("?", "BACHORStanya");
        } else {
            s = s.replace("BACHORStambah", "+").replace("BACHORSdollar", "$").replace("BACHORShalis", "^").replace("BACHORSbintang", "*").replace("BACHORStanya", "?");
        }
        return s;
    }
}
