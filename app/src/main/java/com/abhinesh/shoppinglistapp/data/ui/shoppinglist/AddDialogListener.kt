package com.abhinesh.shoppinglistapp.data.ui.shoppinglist

import com.abhinesh.shoppinglistapp.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}