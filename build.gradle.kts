buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    val kotlinVersion = "1.5.10"
    // val kotlinVersion = "1.5.20"

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
        // the latest version (7.1.0-alpha04) at the time of writing has a bug that crashes the app on launch
        classpath("com.android.tools.build:gradle:7.0.0")
        // classpath("com.android.tools.build:gradle:7.1.0-alpha05")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
