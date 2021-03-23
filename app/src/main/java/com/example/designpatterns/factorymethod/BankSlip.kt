package com.example.designpatterns.factorymethod

class BankSlip : Payment {

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