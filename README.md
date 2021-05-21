Android MVVM Example
A simple project that demonstrates the use of MVVM and Dagger 2 with RxJava2 along with Retrofit.

This code is demonstration of,

MVVM
RxJava
Retrofit
Databinding.
Dagger2


data: It contains all the data accessing and manipulating components.
di: Dependency providing classes using Dagger2 with Retrofit API's.
ui: View classes along with their corresponding ViewModel.
utils: Utility classes.
base:Activity and Fragments



What is MVVM?
Model-View-ViewModel architecture consists of 3 parts.
The View gets userís actions and sends to the ViewModel, or listens live data stream from the ViewModel and provides to the users.
The ViewModel gets userís actions from the View or provides data to View.
The Model abstracts the data source. View and ViewModel uses that on data stream.
Project Configuration
We implement Android Lifecycle, Retrofit, RxJava, ButterKnife and Dagger 2 libraries in addition to Support libraries.

def supportVersion = '27.1.1'
def retrofitVersion = '2.3.0'
def rxJavaVersion = '2.0.1'
def butterKnifeVersion = '8.8.1'
def daggerVersion = '2.13'

dependencies {
    ...

    implementation "android.arch.lifecycle:extensions:1.1.1"

    implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"
    implementation "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    implementation "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"
    implementation "com.squareup.retrofit2:converter-moshi:$retrofitVersion"

    implementation "io.reactivex.rxjava2:rxandroid:$rxJavaVersion"
    implementation "io.reactivex.rxjava2:rxjava:$rxJavaVersion"

    implementation "com.jakewharton:butterknife:$butterKnifeVersion"
    implementation 'com.android.support:support-v4:27.1.1'
    annotationProcessor "com.jakewharton:butterknife-compiler:$butterKnifeVersion"

    implementation "com.google.dagger:dagger:$daggerVersion"
    annotationProcessor "com.google.dagger:dagger-compiler:$daggerVersion"
    implementation "com.google.dagger:dagger-android-support:$daggerVersion"
    annotationProcessor "com.google.dagger:dagger-android-processor:$daggerVersion"

    ...
}