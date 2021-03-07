object Sdk {
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 30
    const val COMPILE_SDK_VERSION = 30
    const val BUILD_TOOLS_VERSION = "30.0.2"
}

object Versions {
    const val ANDROIDX_TEST_EXT = "1.1.2"
    const val ANDROIDX_TEST = "1.3.0"  //runnerVersion
    const val APPCOMPAT = "1.2.0"  //supportLibVersion
    const val CONSTRAINT_LAYOUT = "2.0.4" //constraintLayoutVersion
    const val CORE_KTX = "1.3.2"  //coreVersion
    const val ESPRESSO_CORE = "3.3.0"  //espressoVersion
    const val JUNIT = "4.13.1"  //junitVersion
    const val KTLINT = "0.40.0"
    const val COROUTINES = "1.4.2" //coroutinesVersion
    const val LIFE_CYCLE = "2.3.0"
    const val MATERIAL = "1.3.0"
}

object BuildPluginsVersion {
    const val AGP = "4.1.2"
    const val DETEKT = "1.15.0"
    const val KOTLIN = "1.4.30"
    const val KTLINT = "9.4.1"
    const val VERSIONS_PLUGIN = "0.36.0"
}


object SupportLibs {
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "com.android.support.constraint:constraint-layout:${Versions.CONSTRAINT_LAYOUT}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val ANDROID_MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val KOTLINX_COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
    const val KOTLINX_COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
}

object ArchitectureComponents {
    // ARCHITECTURE COMPONENTS
    const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFE_CYCLE}"
    const val LIFECYCLE_VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFE_CYCLE}"
    const val LIFECYCLE_LIVEDATA_KTX = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFE_CYCLE}"
}


object TestingLib {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
}

object AndroidTestingLib {
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}
