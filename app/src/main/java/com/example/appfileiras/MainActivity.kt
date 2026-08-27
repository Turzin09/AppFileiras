package com.example.appfileiras

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nomes = listOf(
            "Ana", "Bruno", "Carla", "Diego", "Elisa",
            "Fábio", "Gabriela", "Hugo", "Isabela", "João"
        )

        val listView = findViewById<ListView>(R.id.listViewNomes)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nomes)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Selecionado: ${nomes[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}