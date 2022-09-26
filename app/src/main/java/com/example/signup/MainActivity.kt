package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name : EditText = findViewById(R.id.name)
        val email : EditText = findViewById(R.id.email)
        val number : EditText = findViewById(R.id.phone)
        val facebook : EditText = findViewById(R.id.facebook)
        val github : EditText = findViewById(R.id.github)
        val address : EditText = findViewById(R.id.address)
        val button : Button = findViewById(R.id.button)
         button.setOnClickListener {

             if(name.text.toString().isEmpty() || email.text.toString().isEmpty() ||number.text.toString().isEmpty()
                 ||facebook.text.toString().isEmpty()||github.text.toString().isEmpty()||address.text.toString().isEmpty()){
                 Toast.makeText(this, "Please Provide All the Fields Correct", Toast.LENGTH_LONG).show()
             }
             else
             {
                 val intent  = Intent(this, SecondActivity::class.java)
                 intent.putExtra("name", name.text.toString())
                 intent.putExtra("email", email.text.toString())
                 intent.putExtra("number", number.text.toString())
                 intent.putExtra("facebook", facebook.text.toString())
                 intent.putExtra("github", github.text.toString())
                 intent.putExtra("address", address.text.toString())
                 startActivity(intent)
                 finish()
             }
         }

    }
}