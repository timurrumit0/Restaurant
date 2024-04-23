package com.example.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        onClickLogin()
        onClickForgotPassword()
    }
    fun onClickLogin(){
        val loginButton:TextView = findViewById(R.id.textViewLoginRegister)
        loginButton.setOnClickListener{
            val loginIntent = Intent(this, LoginActivity::class.java)
            startActivity(loginIntent)
        }
    }
    fun onClickForgotPassword(){
        val forgotPasswordButton: TextView = findViewById(R.id.textViewForgotPasswordRegister)
        forgotPasswordButton.setOnClickListener{
            val forgotPasswordIntent = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(forgotPasswordIntent)
        }
    }
    fun onClickSubmitButton(){
        val submitButton: Button = findViewById(R.id.buttonSubmitRegister)
        submitButton.setOnClickListener {}
    }
}