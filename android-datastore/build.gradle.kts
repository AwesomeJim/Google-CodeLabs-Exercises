
plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(Sdk.COMPILE_SDK_VERSION)
    buildToolsVersion(Sdk.BUILD_TOOLS_VERSION)
    defaultConfig {
        minSdkVersion(Sdk.MIN_SDK_VERSION)
        targetSdkVersion(Sdk.TARGET_SDK_VERSION)
        applicationId = "com.codelab.android.datastore"
        versionCode =  1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
    }

    kotlinOptions {
        jvmTarget = "1.8"

    }

    android.buildFeatures.viewBinding = true
}

dependencies {
     implementation(kotlin("stdlib-jdk7"))
    implementation(SupportLibs.ANDROIDX_APPCOMPAT)
    implementation(SupportLibs.ANDROIDX_CONSTRAINT_LAYOUT)
    implementation(SupportLibs.ANDROIDX_CORE_KTX)
    implementation(SupportLibs.ANDROID_MATERIAL)
    implementation(SupportLibs.KOTLINX_COROUTINES_ANDROID)
    implementation(SupportLibs.KOTLINX_COROUTINES_CORE)

    implementation(ArchitectureComponents.LIFECYCLE_RUNTIME_KTX)
    implementation(ArchitectureComponents.LIFECYCLE_VIEWMODEL_KTX)
    implementation(ArchitectureComponents.LIFECYCLE_LIVEDATA_KTX)


    // testing
    testImplementation(TestingLib.JUNIT)

    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_EXT_JUNIT)
    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_RULES)
    androidTestImplementation(AndroidTestingLib.ESPRESSO_CORE)
}