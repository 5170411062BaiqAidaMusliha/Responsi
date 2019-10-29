package com.example.resfonsi_062

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_registrasi.*

class Registrasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)
        var intent = intent
        val Emaill=intent.getStringExtra("email")
        val passs=intent.getStringExtra("Pass")
        val nama=intent.getStringExtra("Nama")
        val nim=intent.getStringExtra("NIM")

        val hasil=findViewById<TextView>(R.id.textView)
        intent= Intent()
        hasil.text ="NIM : "+nim+"\nNama : "+nama+"\nEmaill : " + Emaill + "\nPassword : " + passs


        btn_ubah2.setOnClickListener(){
            intent= Intent(this,Registrasi::class.java)
            startActivity(intent)
        }

        btn_login3.setOnClickListener(){
            intent= Intent(this, MainActivity::class.java)
            intent.putExtra("NIM",nim)
            intent.putExtra("Nama",nama)
            intent.putExtra("Emaill",Emaill)
            intent.putExtra("Passs",passs)
            startActivity(intent)
        }
    }
}
