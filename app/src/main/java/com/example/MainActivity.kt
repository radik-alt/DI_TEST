package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.di.MVP.MainActivityContractMVP
import com.example.di.MVP.MainActivityPresenterMVP
import com.example.di.di.DataBaseHelper
import com.example.di.NetworkUtils
import com.example.di.R
import com.example.di.di.App
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContractMVP.View {

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var presenterMVP: MainActivityPresenterMVP

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.email)
        password = findViewById(R.id.pass)

        presenterMVP = MainActivityPresenterMVP(this)

        val clcik : Button = findViewById(R.id.logIN)
        clcik.setOnClickListener {
            val emailS = email.text.toString()
            val passS = password.text.toString()
            if (TextUtils.isEmpty(emailS) || TextUtils.isEmpty(passS)){
               onError("Пусто! Введите значения в поля!")
            } else{
               presenterMVP.logIn(emailS, passS)
                presenterMVP.logIn(emailS, passS)

            }
        }
    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}