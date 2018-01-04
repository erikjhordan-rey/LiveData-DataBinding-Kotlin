# LiveData-DataBinding-Kotlin

As you may know, in the newest version of Android Studio [Android Studio 3.1 Canary 6](https://androidstudio.googleblog.com/2017/12/android-studio-31-canary-6-is-now.html), Google introduced support for LiveData with Data Binding.


## Project Goal

Learn to use LiveData + Databinding 

## Setup Android Studio 3.1 Canary 6


``` 

buildscript {
    dependencies {
        classpath 'com.android.tools.build:gradle:3.1.0-alpha06'
    }
}

```

## LiveData + Data Binding


![](./art/dc_data-live.png)


" You can now use a LiveData object as an observable field in data binding expressions. The ViewDataBinding class now includes a new setLifecycle method that you need to use to use to observe LiveData objects "


## Demo

<img src="https://user-images.githubusercontent.com/5893477/34550143-0f06846c-f0d4-11e7-97ae-91b02f3c11e5.gif" width="220">


Do you want to contribute?
--------------------------
Feel free to report or add any useful feature, I will be glad to improve it with your help, before submitting your code please check the [codestyle](https://github.com/square/java-code-styles).


Code style
--------------------------

This project is written on [Kotlin](https://kotlinlang.org/) and uses [ktlint](https://github.com/shyiko/ktlint).
If you find that one of your pull reviews does not pass the CI server check due to a code style conflict, you can
easily fix it by running: `./gradlew ktlintFormat`, or running IntelliJ/Android Studio's code formatter.


Developed By
------------

* Erik Jhordan Rey  - <erikjhordan.rey@gmail.com> o <erik.gonzalez@schibsted.com>

License
-------

    Copyright 2017 Erik Jhordan Rey

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
