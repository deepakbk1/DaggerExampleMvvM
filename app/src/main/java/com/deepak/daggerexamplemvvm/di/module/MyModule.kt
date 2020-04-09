package com.deepak.daggerexamplemvvm.di.module

import androidx.lifecycle.ViewModelProvider
import com.deepak.daggerexamplemvvm.factory.MyViewModelFactory
import dagger.Binds
import dagger.Module


@Module
abstract class MyModule {
    @Binds
    abstract fun bindViewModelFactory(fectory: MyViewModelFactory): ViewModelProvider.Factory
}