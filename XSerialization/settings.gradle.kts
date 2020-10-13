pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://plugins.gradle.org/m2/")
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android" || requested.id.name == "kotlin-android-extensions") {
                useModule("com.android.tools.build:gradle:3.5.2")
            }
            if (requested.id.name == "kotlinx-serialization") {
                useModule("org.jetbrains.kotlin:kotlin-serialization:1.4.10")
            }
        }
    }
}
rootProject.name = "XSerializations"

