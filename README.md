# Tiny App

This application shows the user pictures of various buildings around the Tufts campus. The user has the option to view pictures in either color or black and white.

## Usage Instructions

In order to use this app open the source code in android studio, build the APK, and then run it on your device or emulator. 

## Running Requirements

This application requires Android 6.0 (Marshmallow) or later. Compatibility is not guaranteed for earlier versions. 

## Documentation and Resources Used

This application uses Java libraries provided for Android development. All image assets were taken from google images.

## What I Learned

The main thing I learned from building this app is the framework for how to switch between activities and views. I had trouble getting the back button to work even when I specified a parent activity in the manifest. I was forced to override the back button with custom code in order to get it to work properly. I also learned that adding images to an app requires that they be split into different sized image assets so that Android can display them properly on devices of different sizes. Finally, I gained experience using the onclick callback method for both the button and checkbox widgets.

## License
Tiny App is [Apache 2.0 licensed](./LICENSE)