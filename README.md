# TastyToasterExample

[![platform](https://img.shields.io/badge/platform-Android-1abc9c.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-16%2B-red.svg)](https://android-arsenal.com/api?level=15)
[![](https://jitpack.io/v/PrinciChristi7880/TastyToasterExample.svg)](https://jitpack.io/#PrinciChristi7880/TastyToasterExample)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.PrinciChristi7880:TastyToasterExample:1.0.0'
}
```

## Usage


To display an default Toast:

``` java
TastyToaster.TastyMessage(this,"Tasty Toaster");
```

## Donation
If this project help you reduce time to develop, you can give me a cup of coffee :) 

<a href="https://www.buymeacoffee.com/mXUuDW7" target="_blank"><img src="https://bmc-cdn.nyc3.digitaloceanspaces.com/BMC-button-images/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>

