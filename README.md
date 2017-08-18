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
	        compile 'com.github.vamzi:FlowAnimations-Android:0.2.0'
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

