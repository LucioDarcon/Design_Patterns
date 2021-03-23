package com.example.designpatterns.factorymethod.factory

import com.example.designpatterns.factorymethod.model.Debit
import com.example.designpatterns.factorymethod.Payment

class DebitFactory {

    fun getPayment(): Payment {
        return Debit()
    }

}