package com.example.designpatterns.factorymethod.factory

import com.example.designpatterns.factorymethod.model.CreditCard
import com.example.designpatterns.factorymethod.Payment

class CreditCardFactory {

    fun getPayment(): Payment {
        return CreditCard()
    }

}