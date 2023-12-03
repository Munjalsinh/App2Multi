package com.munjalparmar.app2multi

interface UpdateAndDelete {

    fun modifyItem(itemUID: String, isDone :Boolean)
    fun onItemDelete(itemUID: String)

}