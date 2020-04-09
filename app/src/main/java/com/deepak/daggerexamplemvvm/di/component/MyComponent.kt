package com.deepak.daggerexamplemvvm.di.component

import com.deepak.daggerexamplemvvm.MainActivity
import com.deepak.daggerexamplemvvm.di.module.MyModule
import dagger.Component

@Component(modules = [MyModule::class])
interface MyComponent {
    fun inject(activity: MainActivity)
}