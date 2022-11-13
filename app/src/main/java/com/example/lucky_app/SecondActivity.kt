package com.example.lucky_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    lateinit var welcome_text:TextView
    lateinit var lucky_text:TextView
    lateinit var lucky_number:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        welcome_text=findViewById(R.id.welcome_text)
        lucky_text=findViewById(R.id.lucky_text)
        lucky_number=findViewById(R.id.lucky_number)

         val name=intent.getStringExtra("UserName")
         welcome_text.text="WELCOME!!!"
         lucky_text.text="Hi!!! $name"
        var random_value:Int=0
         for(i in 1..1)
         {
             random_value=random(0,101)
         }
        lucky_number.text="${random_value.toString().toInt()}"
        Toast.makeText(this, "Lucky Number is ${random_value.toString().toInt()}", Toast.LENGTH_LONG).show()
    }

    private fun random(start:Int, end:Int):Int{
        require(start <= end) { "Illegal Argument" }
        return (Math.random() * (end - start + 1)).toInt() + start
    }
}