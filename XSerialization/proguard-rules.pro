-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.AnnotationsKt # core serialization annotations

# kotlinx-serialization-json specific. Add this if you have java.lang.NoClassDefFoundError kotlinx.serialization.json.JsonObjectSerializer
-keepclassmembers class kotlinx.serialization.json.** {
    *** Companion;
}
-keepclasseswithmembers class kotlinx.serialization.json.** {
    kotlinx.serialization.KSerializer serializer(...);
}

# Change here com.crosstest.testapp
-keep,includedescriptorclasses class com.crosstest.testapp.**$$serializer { *; } # <-- change package name to your app's
-keepclassmembers class com.crosstest.testapp.** { # <-- change package name to your app's
    *** Companion;
}
-keepclasseswithmembers class com.crosstest.testapp.** { # <-- change package name to your app's
    kotlinx.serialization.KSerializer serializer(...);
}