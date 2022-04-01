package com.example.todoapp

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface ToDoappDao {

    @Insert
    fun insertTodo(todo :Todo):Long


}