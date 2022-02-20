package com.acsoft.myexpenses.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Expense(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title:String,
    val amount:Double)