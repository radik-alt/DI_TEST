package com.example.di.di

import com.example.di.MainActivityPresenter
import com.example.di.NetworkUtils
import dagger.Module

//@Module
class MainModel {

    fun provideMainActivityPresenter(dataBaseHelper: DataBaseHelper, networkUtils: NetworkUtils) :MainActivityPresenter{
        return MainActivityPresenter(dataBaseHelper, networkUtils)
    }

}