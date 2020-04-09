package com.deepak.daggerexamplemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.deepak.daggerexamplemvvm.di.component.DaggerMyComponent
import com.deepak.daggerexamplemvvm.factory.MyViewModelFactory
import com.deepak.daggerexamplemvvm.viewmodel.MyViewModel
import dagger.Binds
import dagger.Component
import dagger.Module
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: ViewModelProvider.Factory
    lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMyComponent.create().inject(this)
        myViewModel = ViewModelProvider(this, factory).get(MyViewModel::class.java)
        myViewModel.callLiveData()
        myViewModel.getMyLiveData().observe(this, Observer {
            myTextView.text = it
        })
    }
}


