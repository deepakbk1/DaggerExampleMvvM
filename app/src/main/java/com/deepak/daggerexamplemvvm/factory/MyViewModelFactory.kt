package com.deepak.daggerexamplemvvm.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.deepak.daggerexamplemvvm.viewmodel.MyViewModel
import javax.inject.Inject
import javax.inject.Provider

class MyViewModelFactory @Inject constructor(private val myViewModelProvider: Provider<MyViewModel>) :
    ViewModelProvider.Factory {
    @Suppress("Unchecked cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return myViewModelProvider.get() as T
    }
}