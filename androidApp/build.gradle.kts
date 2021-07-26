
plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-parcelize")
}

dependencies {
    implementation(project(":shared"))
    implementation(Google.android.material)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.constraintLayout)

    /* compose */
    implementation(AndroidX.activity.compose)
    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.ui.tooling)
    implementation(AndroidX.compose.foundation)
    implementation(AndroidX.compose.material)
    implementation(AndroidX.compose.material.icons.core)
    implementation(AndroidX.compose.material.icons.extended)
    implementation(AndroidX.compose.runtime.liveData)
    implementation(AndroidX.navigation.compose)
    implementation(Google.accompanist.insets)


    implementation(AndroidX.lifecycle.runtime)
    implementation(AndroidX.lifecycle.common)
    implementation(AndroidX.lifecycle.runtimeKtx)
    // kapt("androidx.lifecycle:lifecycle-compiler:2.4.0-alpha02")
    implementation(AndroidX.lifecycle.commonJava8)
    implementation(AndroidX.lifecycle.viewModelKtx)
    implementation(AndroidX.lifecycle.liveDataKtx)
    implementation(AndroidX.lifecycle.viewModelSavedState)
    implementation(AndroidX.lifecycle.service)
    implementation(AndroidX.lifecycle.process)

    // UI Tests
    androidTestImplementation(AndroidX.compose.ui.testJunit4)
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
        getByName("debug") {
            isMinifyEnabled = false
        }
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
        freeCompilerArgs = listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:suppressKotlinVersionCompatibilityCheck=true"
        )
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        // kotlinCompilerVersion = "1.5.10"
        kotlinCompilerExtensionVersion = "1.0.0-rc02"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    packagingOptions {
        resources.excludes.add("META-INF/licenses/**")
        resources.excludes.add("META-INF/AL2.0")
        resources.excludes.add("META-INF/LGPL2.1")
    }
}
