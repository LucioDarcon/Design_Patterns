package com.example.designpatterns.factorymethod.factory

import com.example.designpatterns.factorymethod.model.BankSlip
import com.example.designpatterns.factorymethod.Payment

class BankSlipFactory {

    fun getPayment(): Payment {
        return BankSlip()
    }


}

