object Versions {
    const val minSdkVersion = 16
    const val targetSdkVersion = 26
    const val compileSdkVersion = 26
    const val kotlin = "1.2.51"
    const val androidPlugin = "3.1.0"

}

object Libs {
    const val playServicesVersion = "11.8.0"
    const val supportLibVersion = "27.1.1"

    const val support_v4 = "com.android.support:support-v4:$supportLibVersion"
    const val appcompat_v7 = "com.android.support:appcompat-v7:$supportLibVersion"
    const val design = "com.android.support:design:$supportLibVersion"
    const val recyclerview_v7 = "com.android.support:recyclerview-v7:$supportLibVersion"
    const val cardview_v7 = "com.android.support:cardview-v7:$supportLibVersion"
    const val play_auth = "com.google.android.gms:play-services-auth:15.0.1"
    const val play_firebase_core = "com.google.firebase:firebase-core:15.0.2"
    const val play_firebase_messaging = "com.google.firebase:firebase-messaging:15.0.2"

    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:2.9.2"
    const val gson = "com.google.code.gson:gson:2.8.5"
    const val moshi = "com.squareup.moshi:moshi:1.6.0"
    const val moshi_kotlin = "com.squareup.moshi:moshi-kotlin:1.6.0"
    const val moshi_codegen = "com.squareup.moshi:moshi-kotlin-codegen:1.6.0"
    const val timber = "com.jakewharton.timber:timber:4.7.0"
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val rxjava2 = "io.reactivex.rxjava2:rxjava:2.1.14"
    const val rxkotlin = "io.reactivex:rxkotlin:1.0.0"
    const val junit = "junit:junit:4.12"
    const val espresso = "com.android.support.test.espresso:espresso-core:3.0.2"
    const val test_runner = "com.android.support.test:runner:1.0.2"
    const val test_rules = "com.android.support.test:rules:1.0.2"
    const val ktx = "androidx.core:core-ktx:0.3"
    const val constraintLayout = "com.android.support.constraint:constraint-layout:1.1.0"
    const val paperDb = "io.paperdb:paperdb:2.6"
    const val annimonStream = "com.annimon:stream:1.2.0"
    const val dataBindingCompiler = "com.android.databinding:compiler:${Versions.androidPlugin}"
    const val rxAndroid = "io.reactivex:rxandroid:1.2.1"
    const val rxAndroid2 = "io.reactivex.rxjava2:rxandroid:2.0.2"
    const val rxKotlin = "io.reactivex:rxkotlin:1.0.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:2.4.0"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:2.4.0"
    const val retrofitRx = "com.squareup.retrofit2:adapter-rxjava:2.4.0"
    const val retrofitRx2 = "com.squareup.retrofit2:adapter-rxjava2:2.4.0"
    const val pngj = "ar.com.hjg:pngj:2.1.0"
    const val kotlinPoet = "com.squareup:kotlinpoet:0.5.0"
    const val okhttp = "com.squareup.okhttp3:okhttp:3.10.0"

    const val multidex = "com.android.support:multidex:1.0.3"
    const val picassoDownloader = "com.jakewharton.picasso:picasso2-okhttp3-downloader:1.1.0"
    const val picasso = "com.squareup.picasso:picasso:2.5.2"
    const val room = "android.arch.persistence.room:runtime:1.1.1-rc1"
    const val rxRoom = "android.arch.persistence.room:rxjava2:1.1.1-rc1"
    const val roomProcessor = "android.arch.persistence.room:compiler:1.1.1-rc1"
    const val stetho =  "com.facebook.stetho:stetho:1.5.0"
    const val stethoOkhttp = "com.facebook.stetho:stetho-okhttp3:1.5.0"

}