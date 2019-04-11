# FlowAnimations-Android

[![](https://jitpack.io/v/vamzi/FlowAnimations-Android.svg)](https://jitpack.io/#vamzi/FlowAnimations-Android)

A simple android library to animate views to flow in to parent from outside the parent view.

# Demo
![](https://raw.githubusercontent.com/vamzi/FlowAnimations-Android/master/app/src/main/res/drawable/gif_2.gif)

## How to include in your project!

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

### For Gradle Build

```sh
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency

```sh
dependencies {
	        implementation 'com.github.vamzi:FlowAnimations-Android:0.2.0'
	}
```

## Usage

```sh
FlowAnimations mFlowAnimations = new FlowAnimations(AnimationStyle.SLIDE_IN_BOTTOM);
mFlowAnimations.playOn(mView);
mFLowAnimations.setDuration(duration);
mFlowAnimations.animate();
```
### Animations available in library are

 `SLIDE_IN_UP`
 `SLIDE_IN_RIGHT`
 `SLIDE_IN_LEFT`
 `SLIDE_OUT_BOTTOM`
 `SLIDE_OUT_UP`
 `SLIDE_OUT_RIGHT`
 `SLIDE_OUT_LEFT`

# License
```sh
MIT License

Copyright (c) 2017 KOTHAPALLI VAMSI KRISHNA

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
