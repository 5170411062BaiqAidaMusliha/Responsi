package com.example.resfonsi_062

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val NIM=findViewById<EditText>(R.id.nim)
        val Nama =findViewById<EditText>(R.id.nama)
        val Emaill=findViewById<EditText>(R.id.username)
        val Passs=findViewById<EditText>(R.id.pass)

        btn_input.setOnClickListener(){
            val nim=NIM.text.toString()
            val nama=Nama.text.toString()
            val username=Emaill.text.toString()
            val Pass=Passs.text.toString()

            intent= Intent(this@SecondActivity, doesboard::class.java)
            intent.putExtra("NIM", nim)
            intent.putExtra("Nama",nama)
            intent.putExtra("Emaill", username)
            intent.putExtra("Passs", Pass)
            startActivity(intent)
        }
    }
}
