plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.projectmakan"
    compileSdk = 35 // Memastikan compileSdk versi 33

    defaultConfig {
        applicationId = "com.example.projectmakan"
        minSdk = 26  // Sesuaikan minSdkVersion dengan target Anda
        targetSdk =  33// Menetapkan targetSdk ke versi 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation (libs.google.material.v1120)
    implementation (libs.core.ktx)
    implementation(libs.appcompat.v170) // Update ke versi terbaru
    implementation(libs.google.material.v1120) // Update ke versi terbaru
    implementation(libs.constraintlayout.v220)
    implementation(libs.activity) // Update ke versi terbaru
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.v121) // Update versi ke yang lebih baru
    androidTestImplementation(libs.espresso.core.v361) // Update versi ke yang lebih baru

    // For Round Images
    implementation(libs.roundedimageview) // Sudah benar, tidak ada perubahan

    // For Image Slider
    implementation(libs.glide) // Update Glide ke versi terbaru
    annotationProcessor(libs.compiler) // Sesuaikan dengan versi Glide terbaru
}
