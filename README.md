# Android-Prefix-Input
Android Library EditText Prefix Input

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
    compile 'com.github.bachors:Android-Prefix-Input:1.0'
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

MIT
-----
