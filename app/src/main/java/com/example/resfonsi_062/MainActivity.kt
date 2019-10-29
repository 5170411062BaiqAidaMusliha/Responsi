package com.example.resfonsi_062

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email=findViewById<EditText>(R.id.editUser)
        val pass=findViewById<EditText>(R.id.editUser)

        btn_login2.setOnClickListener() {
            val Emaill = email.text.toString()
            val Pass = pass.text.toString()

            //dari registrasi
            val nama=intent.getStringExtra("Nama")
            val nim=intent.getStringExtra("NIM")
            val email = intent.getStringExtra("EmaiL")
            val pass=intent.getStringExtra("Pass")

            if (email.isEmpty() ||pass.isEmpty()){
                Toast.makeText(this,"Tolong Masukan Email Dan Passwor Anda ",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            intent= Intent(this,doesboard::class.java)
            intent.putExtra("Emaill",email)
            intent.putExtra("Pass",pass)
            intent.putExtra("Nama",nama)
            intent.putExtra("NIM",nim)


            intent.putExtra("Email",email)
            intent.putExtra("Pass",pass)
            startActivity(intent)


        }
        btn_reg.setOnClickListener(){
            val intent1=Intent(this@MainActivity,Registrasi::class.java)
            toast("Menuju halaman Registrai",Toast.LENGTH_LONG)
            startActivity(intent1)
        }
    }

    fun toast(message: String,length: Int=Toast.LENGTH_LONG){
        Toast.makeText(this, message, length).show()
    }
}

