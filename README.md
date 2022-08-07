# MobileNumberValidator
BD Mobile Number Validator Android Library
### Demo
<img src="https://raw.githubusercontent.com/mortuzahossain/MobileNumberValidator/main/demo.gif" width="300" height="500" />

### Install
> Step 1. Add the JitPack repository to your build file 
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
> Step 2. Add the dependency
```gradle
dependencies {
    implementation 'com.github.mortuzahossain:MobileNumberValidator:1.0.0'
}
```

### Use

> 1. Enable phone number masking
```kotlin
findViewById<EditText>(R.id.editTextPhone).insertPhoneMask()
```

> 2. Check valid mobile number
```kotlin
val number = findViewById<EditText>(R.id.editTextPhone).text.toString()
if (number.isValidPhoneNumber()){
    textView.text = "Valid Mobile Number"
} else {
    textView.text = "Invalid Mobile Number"
}
```

> 3. Get the operator name
```kotlin
val number = findViewById<EditText>(R.id.editTextPhone).text.toString()
textView.text = number.getOperatorName().name
```
