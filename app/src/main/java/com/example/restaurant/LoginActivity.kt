package com.example.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        onClickButtonSubmit()
    }
    fun onClickButtonSubmit(){
        val buttonSubmit:Button = findViewById(R.id.buttonSubmitLogin)
        val emailaPhone:EditText = findViewById(R.id.editTextEmailaPhoneLogin)
        buttonSubmit.setOnClickListener {
            validateEmail(emailaPhone.toString())
            validatePhoneNumber(emailaPhone.toString())
        }
    }
    fun validateEmail(email: String): Boolean {
        val emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
        val pattern = Pattern.compile(emailRegex)
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }

    fun validatePhoneNumber(phoneNumber: String): Boolean {
        val phoneRegex = "^\\+(?:[0-9] ?){6,14}[0-9]$"
        val pattern = Pattern.compile(phoneRegex)
        val matcher = pattern.matcher(phoneNumber)
        return matcher.matches()
    }
}