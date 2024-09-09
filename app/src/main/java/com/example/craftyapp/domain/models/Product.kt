package com.example.craftyapp.domain.models

import java.sql.Timestamp

data class Product(
    val sellerId:String = "",
    val title:String = "",
    val desc:String ="",
    val price:Double=0.0,
    val category:String="",
    val productImage:String="",
    val stockQuantity:Int = 0,
    val addedTime:Timestamp ?= null
)
