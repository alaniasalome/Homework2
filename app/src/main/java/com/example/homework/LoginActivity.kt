package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var Email: TextView
    lateinit var password: TextView
    lateinit var login: Button
    lateinit var signup: Button


    val user: String = " salome"
    val pass: String = "12345"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Email = findViewById(R.id.Email)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)
        signup = findViewById(R.id.signup)

        login.setOnClickListener{
            if (Email.text.toString()== user && password.text.toString()== pass ) {
                Toast.makeText(this, "monacemebi sworia", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "monacemebi arasworia", Toast.LENGTH_LONG).show()
            }
        }

        signup.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

    }
