package com.example.designpatterns.factorymethod

class BankSlipFactory {

    fun getPayment(): Payment {
        return BankSlip()
    }


}

