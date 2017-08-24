# Android-Prefix-Input
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-PrefixInput-red.svg?style=flat)](https://android-arsenal.com/details/1/6069)
[![Release](https://jitpack.io/v/bachors/Android-Prefix-Input.svg)](https://jitpack.io/#bachors/Android-Prefix-Input)

Android library adding a prefix to an EditText.

![gif](http://i.giphy.com/l4CD0bVB0KWl5PXLq.gif)

Gradle
------
```
allprojects {
   repositories {
      ...
      maven { url 'https://jitpack.io' }
   }
}
```
```
dependencies {
    ...
    compile 'com.github.bachors:Android-Prefix-Input:1.1'
}
```

Usage
-----
```xml
<com.bachors.prefixinput.EditText
	android:id="@+id/foo"
	android:text="http://"
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	android:inputType="text" />

<com.bachors.prefixinput.EditText
	android:id="@+id/bar"
	android:text="+62"
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	android:inputType="number" />
```

Option
------
set text programmatically (dynamic)
```xml
<com.bachors.prefixinput.EditText
	android:id="@+id/username"
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	android:inputType="text" />
```
```java
...
import com.bachors.input.EditText
...
EditText username = (EditText) findViewById(R.id.username);

username.setPrefix("123_");
```

MIT
-----
