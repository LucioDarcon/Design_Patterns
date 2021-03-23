package com.example.designpatterns.factorymethod

class CreditCard : Payment {

    private var price: Double? = null

    override
    fun setPrice(price: Double) {
        this.price = price
    }

    override
    fun screenPayment() {
        println(this::class.java.toString())
    }




}