# Android-Prefix-Input
<<<<<<< HEAD
Android library adding a prefix to an EditText.
=======
Android Library EditText Prefix Input
>>>>>>> ce043093f87675defcae76176b9a893f01faad45

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
<<<<<<< HEAD
    compile 'com.github.bachors:Android-Prefix-Input:1.1'
=======
    compile 'com.github.bachors:Android-Prefix-Input:1.0'
>>>>>>> ce043093f87675defcae76176b9a893f01faad45
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
<<<<<<< HEAD
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
=======
>>>>>>> ce043093f87675defcae76176b9a893f01faad45

MIT
-----
