package com.acsoft.myexpenses.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Expense(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title:String = "",
    val amount:Double = 0.0)