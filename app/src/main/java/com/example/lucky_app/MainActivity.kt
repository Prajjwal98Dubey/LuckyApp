package com.example.lucky_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var etName:EditText
    lateinit var send:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName=findViewById(R.id.etName)
        send=findViewById(R.id.send_button)

        send.setOnClickListener{
            val username=etName.text.toString()
            val intent= Intent(this@MainActivity,SecondActivity::class.java)
            intent.putExtra("UserName",username)
            startActivity(intent)
        }

    }
}