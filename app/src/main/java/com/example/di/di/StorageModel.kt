package com.example.di.di

import dagger.Module
import dagger.Provides

//@Module
class StorageModel {

//    @Provides
    fun provideRepository(): Repository {
        return Repository()
    }

//    @Provides
    fun provideDataBaseHelper(repository: Repository): DataBaseHelper {
        return DataBaseHelper(repository)
    }

}