package com.hanuman.testapp.ui.main;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.hanuman.testapp.ui.detail.DetailsFragment;
import com.hanuman.testapp.ui.list.ListFragment;

@Module
public abstract class MainFragmentBindingModule {

    @ContributesAndroidInjector
    abstract ListFragment provideListFragment();

    @ContributesAndroidInjector
    abstract DetailsFragment provideDetailsFragment();
}
