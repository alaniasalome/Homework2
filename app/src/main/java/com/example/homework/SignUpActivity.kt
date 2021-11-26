package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    lateinit var Email: TextView
    lateinit var password: TextView
    lateinit var firstname: TextView
    lateinit var lastname:  TextView
    lateinit var username: TextView
    lateinit var register: Button
    lateinit var taken: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        taken = findViewById(R.id.taken)
        taken.setOnClickListener {
        val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
    }

 }
}