plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.moviess"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.moviess"
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

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //glide

    implementation ("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.11.0")


    //recycleview to view the movies
    implementation ("com.android.support:recycleview-v7:28.0.0")

    //cardview to show the movie poster and name

    implementation ("com.android.support:carview-v7:28.0.0")

    //design to create animations

    implementation ("com.android.support:design:v28.0.0")

    //nice spinner to create awesome spinner

    implementation ("com.github.arcadefire:nice-spinner:1.3.4")

    //retorfit to get api results from the movie database

    implementation ("com.squareup.retrofit2:retrofit:2.4.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.4.0")

    //paperdb to store the movies details in offline in app

    implementation ("io.paperdb:paperdb:2.5")

    //diagonallayout to create a diagonal image view

    implementation ("com.github.florent37:diagonallayout:1.0.7")

    //kenburnsview to create animated image view

    implementation ("com.flaviofari:kenburnsview:1.0.7")

    //picasso to place the image in image view

    implementation ("com.squareup.picasso:picasso:2.5.2")
}