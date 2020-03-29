package com.pedroza.telaloginregistro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela_de_registro.*
import kotlinx.android.synthetic.main.activity_tela_de_registro.view.*
import kotlinx.android.synthetic.main.activity_tela_pos_login.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.Log_in)


        //   val senha = '123456'
        //   val email = "felipe@exemplo.com.br"

        val button = findViewById<Button>(R.id.teladelogin)
        button.setOnClickListener {
            if (senhaLogin.length() < 6) Toast.makeText(
                this, "A senha deve possuir ao menos 6 dígitos", Toast.LENGTH_SHORT
            ).show()
            //      else if (emailLogin != email || senhaLogin != senha)
            //      Toast.makeText(this, "Sem Cadastro. Registre-se", Toast.LENGTH_SHORT).show()
            else {
                //   val email = intent.getStringExtra("endereco")
                // if (emailLogin == email){
                // textView.text=enderecoEmail
                //             if (emailLogin == email) {

                val intent = Intent(this, telaPosLogin::class.java)
                startActivity(intent)
                //    NÃO ENTRAR SEM TER REGISTRO       } else
                //             Toast.makeText(this, "Sem Cadastro. Registre-se", Toast.LENGTH_SHORT).show()
                //     }
                // val button2= findViewById<Button>(R.id.teladeregistro)
                teladeregistro.setOnClickListener {

                    val intent = Intent(this, telaDeRegistro::class.java)
                    startActivity(intent)
                }


            }
        }

    }
}

