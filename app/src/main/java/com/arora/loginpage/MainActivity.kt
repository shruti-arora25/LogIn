package com.arora.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arora.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        bind=ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btn.setOnClickListener{
            val toast=Toast.makeText(this,"Welcome to LogIn PAge..",Toast.LENGTH_LONG)
            toast.show()
            val i=Intent(this,Login::class.java)
            startActivity(i)
        }




    }
}