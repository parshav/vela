# pvBase

Tired of looking at other projects when starting a new personal one,
I created this as a base for reference to a new Android project.

### Features

The project has 2 modules. `base` and `app`. `app` does not contain
 any useful code in this repo.

 `base ` contains --> 

##### BaseActivity

Abstract base Activity class that can be extended.
See [MainActivity](./app/src/main/java/com/pv/pvbase/MainActivity.kt) for example Activity usage.

##### BaseScreen

Abstract base Fragment class that cn be extended.
See [DemoScreen](./app/src/main/java/com/pv/pvbase/DemoScreen.kt) for example Screen usage.

##### Navigator

Simple navigator implementation, exposed via `NavigatorTemplate`.

##### ResourceHelper

Resource retriever class, only implementing strings for now.

### TODO

* ~~Screen implementation example.~~
* ~~Activity implementation example.~~
* Method to pull this repo and modify module name.
