apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'

android {
    ...
}

dependencies {
    compile "org.jetbrains.kotlin:"
}




plugins {
    id("com.android.application") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}