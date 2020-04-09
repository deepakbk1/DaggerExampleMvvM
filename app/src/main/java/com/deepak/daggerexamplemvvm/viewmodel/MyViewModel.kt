package com.deepak.daggerexamplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.deepak.daggerexamplemvvm.repository.Repository
import javax.inject.Inject

class MyViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    var resultData = MutableLiveData<String>()
    fun getDataViewModel(): String {
        val mydagger = repository.getData()
        return mydagger
    }

    fun callLiveData() {
        repository.getMutableData()
    }

    fun getMyLiveData(): MutableLiveData<String> {
        resultData = repository.getMyLiveData()
        return resultData
    }
}
