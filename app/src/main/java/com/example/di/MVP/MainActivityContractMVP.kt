package com.example.di.MVP

abstract class MainActivityContractMVP {

    interface View{
        fun onSuccess(message:String)
        fun onError(message: String)
    }

    interface Presenter{
        fun logIn(email:String, password:String)
    }

}