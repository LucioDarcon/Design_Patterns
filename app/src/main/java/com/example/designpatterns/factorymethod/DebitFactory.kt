package com.example.designpatterns.factorymethod

class DebitFactory {

    fun getPayment(): Payment {
        return Debit()
    }

}