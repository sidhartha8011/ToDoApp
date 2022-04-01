package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class createTodoactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_todoactivity)

        val e1:EditText=findViewById(R.id.todotextedit)
        val b1:Button=findViewById(R.id.savebuuton)

        b1.setOnClickListener{
            val et=e1.text.toString()
            val todo=Todo()
            todo.name=et
            insertRow(todo)
        }
    }

    fun insertRow(todo: Todo) {

        doAsync{

        }

    }
}