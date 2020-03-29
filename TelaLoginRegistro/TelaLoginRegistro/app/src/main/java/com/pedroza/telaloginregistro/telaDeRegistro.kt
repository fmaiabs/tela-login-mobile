package com.pedroza.telaloginregistro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela_de_registro.*



class telaDeRegistro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_registro)
        setTitle(R.string.tituloRegistro)


        val button = findViewById<Button>(R.id.alterar)

        button.setOnClickListener {
            // Toast.makeText(this, "Registro Realizado Com Sucesso", Toast.LENGTH_SHORT).show()
            if (editText3.length() == 0 || email.length() == 0 || senha.length() == 0 || editText2.length() == 0 || editText7.length() == 0 || editText8.length() == 0)
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            else if (senha.length() < 6) Toast.makeText(
                    this,"A senha deve possuir ao menos 6 dígitos", Toast.LENGTH_SHORT).show()
            else{


            val intent =
                Intent(this, teladelogin::class.java)
           // val params=Bundle()
           //     val email=email.text.toString()
                //   params.putString("endereco", email)
                // intent.putExtras(params)
                startActivity(intent)
            }
        }
      //  var email= "felipe@gmail.com"
      //  var senha = "123456"
    }
}
