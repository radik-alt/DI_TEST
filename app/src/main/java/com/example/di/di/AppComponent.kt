package com.example.di.di

import com.example.di.MainActivityPresenter
import dagger.Component

//@Component(modules = [NetworkModel::class, StorageModel::class, MainModel::class])
interface AppComponent {

    fun getMainActivityPresenter():MainActivityPresenter

}