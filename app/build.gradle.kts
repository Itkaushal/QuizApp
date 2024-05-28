plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.kaushlendraprajapati.loginsignupuiintenrshala"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kaushlendraprajapati.loginsignupuiintenrshala"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {

    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.19")
    // Room
    implementation ("androidx.room:room-runtime:2.6.1")
    annotationProcessor ("androidx.room:room-compiler:2.6.1")

// Gson
    implementation ("com.google.code.gson:gson:2.8.6")

// View Pager Dots Indicator
// https://github.com/tommybuonomo/dotsindicator
    implementation ("com.tbuonomo:dotsindicator:4.2")

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}