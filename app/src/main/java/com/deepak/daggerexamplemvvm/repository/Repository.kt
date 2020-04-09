package com.deepak.daggerexamplemvvm.repository

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class Repository @Inject constructor() {
    val mutableLiveData = MutableLiveData<String>()
    fun getData(): String {
        return "This is dagger mvvm"
    }

    fun getMutableData() {
        mutableLiveData.value = "This is Live Data"
    }

    fun getMyLiveData(): MutableLiveData<String> {
        return mutableLiveData
    }
}