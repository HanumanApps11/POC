package com.hanuman.testapp.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.hanuman.testapp.ui.main.MainActivity;
import com.hanuman.testapp.ui.main.MainFragmentBindingModule;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = {MainFragmentBindingModule.class})
    abstract MainActivity bindMainActivity();
}
