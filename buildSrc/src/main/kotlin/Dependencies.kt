const val kotlinVersion = "1.3.72"

object BuildPlugins {
    object Version {
        const val androidBuildToolsVersion = "4.1.0-alpha10"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Version.androidBuildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    const val detekt = "io.gitlab.arturbosch.detekt"
    const val ktlint = "org.jlleitschuh.gradle.ktlint"
    const val versions = "com.github.ben-manes.versions"
}

object AndroidSdk {
    const val min = 21
    const val compile = 28
    const val target = compile
}


object Libraries {
    private object Versions {
        const val appCompat = "1.3.0-alpha01"
        const val ktx = "1.4.0-alpha01"
        const val constraintLayout = "2.0.0-beta6"
        const val material = "1.3.0-alpha01"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val material = "com.google.android.material:material:${Versions.material}"
}

object AndroidTestLibraries {
    private object Versions {
        const val espresso = "3.1.0"
        const val androidxTest = "1.1.1"
    }
    const val expressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.androidxTest}"
    const val androidxRules = "androidx.test:rules:${Versions.androidxTest}"
}
