package com.example.todoapp

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = ToDoDatabase.TABLE_NAME)
class Todo : Serializable {
    @PrimaryKey(autoGenerate = true)
    var TodoId:Long?=null

    var name:String?=null
}