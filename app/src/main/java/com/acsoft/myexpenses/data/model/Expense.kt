package com.acsoft.myexpenses.data.model

import androidx.room.Entity

@Entity
class Expense(val title:String, val amount:Double)