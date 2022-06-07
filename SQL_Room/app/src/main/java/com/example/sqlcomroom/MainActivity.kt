package com.example.sqlcomroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*

        Estrutura Room

        Banco de Dados - Usuario

        DAO - Data Access object - O cara que cuidará das querys

        Querys SQL - Select, Insert, Update, Delete

        Database - Instancia do Banco de Dados

        Repository - Ponte entre o DAO e a instancia do Database

        ViewModel - Processar os dados da requisição

         */

    }
}