package com.example.resfonsi_062

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_doesboard.*
import kotlinx.android.synthetic.main.activity_doesboard.btn_login2

class doesboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doesboard)

        var intent = intent
        val Emaill=intent.getStringExtra("Email")
        val Pass=intent.getStringExtra("pass")
        val nama=intent.getStringExtra("Nama")
        val nim=intent.getStringExtra("NIM")

        val hasil=findViewById<TextView>(R.id.textView)
        intent= Intent()
        hasil.text ="Nama : "+nama+"\nNIM : "+nim+"\nEmail : " + Emaill + "\nPassword : " + Pass


        btn_ubah.setOnClickListener(){
            intent= Intent(this,Registrasi::class.java)
            startActivity(intent)
        }

        btn_login2.setOnClickListener(){
            intent= Intent(this, MainActivity::class.java)
            intent.putExtra("Email",Emaill)
            intent.putExtra("Pass",Pass)
            intent.putExtra("Nama",nama)
            intent.putExtra("NIM",nim)
            startActivity(intent)
        }
    }
}
