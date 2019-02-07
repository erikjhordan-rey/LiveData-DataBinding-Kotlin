object Versions {
    const val compile_sdk = 28
    const val min_sdk = 15
    const val target_sdk = 28
    const val version_code = 1
    const val version_name = "1.0"

    const val buildToolsVersion = "28.0.3"

    const val ktlint = "0.9.0"
    const val kotlin_stdlib = "1.3.20"
    const val androidx = "1.0.2"
    const val recycler_view = "1.0.0"
    const val constraint_layout = "1.1.3"
    const val glide = "4.8.0"
    const val lifecycle = "2.0.0"
}

object Libs {
    const val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_stdlib}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.androidx}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recycler_view}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
}