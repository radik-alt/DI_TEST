package com.example.di.di

import com.example.di.NetworkManager
import com.example.di.NetworkUtils
import dagger.Module
import dagger.Provides

//@Module
class NetworkModel {

//    @Provides
    fun provideConnectionManager(): NetworkManager {
        return NetworkManager()
    }

//    @Provides
    fun provideNetworkUtils(networkManager: NetworkManager):NetworkUtils{
        return NetworkUtils(networkManager)
    }

}