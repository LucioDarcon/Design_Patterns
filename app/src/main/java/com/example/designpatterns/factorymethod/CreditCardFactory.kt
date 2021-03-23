package com.example.designpatterns.factorymethod

class CreditCardFactory {

    fun getPayment(): Payment {
        return CreditCard()
    }

}