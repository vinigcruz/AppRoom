package com.example.rgm31163386.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "itens")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
) {
    fun formatedPrice(): String {
        return "$%.2f".format(price)
    }
}