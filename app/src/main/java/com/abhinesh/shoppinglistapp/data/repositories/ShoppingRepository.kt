package com.abhinesh.shoppinglistapp.data.repositories

import com.abhinesh.shoppinglistapp.data.db.entities.ShoppingItem
import com.abhinesh.shoppinglistapp.data.db.ShoppingDatabase

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}