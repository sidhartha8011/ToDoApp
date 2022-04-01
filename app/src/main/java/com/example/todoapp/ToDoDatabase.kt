package com.example.todoapp

import androidx.room.Database

@Database(entities = [Todo::class], version = 1)
abstract class ToDoDatabase {
    abstract fun todoDaoApp(): ToDoappDao

    companion object{
        const val DB_NAME = "to_do_db"
        const val TABLE_NAME="todo"
    }
}