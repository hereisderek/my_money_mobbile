plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}

dependencies {
    implementation(project(":shared"))
    implementation(Google.android.material)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.constraintLayout)
}

android {
    compileSdk = 30
    defaultConfig {
        applicationId = "top.derekdev.mymoney.android"
        minSdk = 21
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}
