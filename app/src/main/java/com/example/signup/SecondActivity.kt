package com.example.signup

import android.os.Bundle
import android.text.util.Linkify
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name : TextView = findViewById(R.id.yourName)
        val email :TextView= findViewById(R.id.yourMail)
        val number : TextView = findViewById(R.id.yourPhoneNumber)
        val facebook : TextView = findViewById(R.id.yourFacebook)
        val github : TextView = findViewById(R.id.yourGithub)
        val address : TextView = findViewById(R.id.yourPostal)
        val intent  = intent
        name.text  = intent.getStringExtra("name")
        email.text  = intent.getStringExtra("email")
        number.text  = intent.getStringExtra("number")
        facebook.text  = intent.getStringExtra("facebook")
        github.text  = intent.getStringExtra("github")
        address.text  = intent.getStringExtra("address")
        Linkify.addLinks(email, Linkify.EMAIL_ADDRESSES)
        Linkify.addLinks(number, Linkify.PHONE_NUMBERS)
        Linkify.addLinks(facebook, Linkify.WEB_URLS)
        Linkify.addLinks(github, Linkify.WEB_URLS)
        Linkify.addLinks(address, Linkify.MAP_ADDRESSES)
    }
}