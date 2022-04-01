package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addtodo:FloatingActionButton=findViewById(R.id.floatingActionButton)

        addtodo.setOnClickListener{
            val intent=Intent(this,createTodoactivity::class.java)
            startActivity(intent)

        }
    }
}