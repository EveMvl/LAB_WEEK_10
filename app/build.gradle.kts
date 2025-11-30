plugins {
<<<<<<< HEAD
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
=======
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
>>>>>>> 7f6ce830b8993aa37a2db28dbc661358c3dd9464
}

android {
    namespace = "com.example.lab_week_10"
<<<<<<< HEAD
    compileSdk = 34
=======
    compileSdk = 36
>>>>>>> 7f6ce830b8993aa37a2db28dbc661358c3dd9464

    defaultConfig {
        applicationId = "com.example.lab_week_10"
        minSdk = 24
<<<<<<< HEAD
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    // ViewModel (for Commit 1)
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

}
=======
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.4")
}
>>>>>>> 7f6ce830b8993aa37a2db28dbc661358c3dd9464
