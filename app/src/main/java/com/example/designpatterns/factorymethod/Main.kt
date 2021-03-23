package com.example.designpatterns.factorymethod

import com.example.designpatterns.factorymethod.factory.BankSlipFactory
import com.example.designpatterns.factorymethod.factory.CreditCardFactory
import com.example.designpatterns.factorymethod.factory.DebitFactory

fun main() {


    val bankSlip: Payment   =  BankSlipFactory().getPayment()
    val creditCard: Payment =  CreditCardFactory().getPayment()
    val debit: Payment      =  DebitFactory().getPayment()

    bankSlip.setPrice(10.00)
    bankSlip.screenPayment()

    creditCard.setPrice(10.00)
    creditCard.screenPayment()

    debit.setPrice(10.00)
    debit.screenPayment()
}
