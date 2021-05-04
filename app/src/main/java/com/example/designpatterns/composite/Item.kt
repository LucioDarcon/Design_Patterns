package com.example.designpatterns.composite

abstract class Item {

    var mListItem : ArrayList<Item> = arrayListOf()

    fun showComponent() {
        println(this.javaClass.toString())
    }

}