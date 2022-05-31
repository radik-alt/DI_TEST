package com.example.di.MVP

class MainActivityPresenterMVP: MainActivityContractMVP.Presenter {

    var presenter : MainActivityContractMVP.View

    constructor(presenter: MainActivityContractMVP.View) {
        this.presenter = presenter
    }

    override fun logIn(email: String, password: String) {

        if (email.equals("Radik.app@yandex.ru") || password.equals("joker")){
            presenter.onSuccess("Успех")
        } else {
            presenter.onError("Неправильный пароль или логин!")
        }
    }
}