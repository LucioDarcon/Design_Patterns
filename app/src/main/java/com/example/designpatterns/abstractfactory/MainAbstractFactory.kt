package com.example.designpatterns.abstractfactory


fun createPayment(payment: Payment) {
    payment.setPrice(10.00)
    payment.screenPayment()
}


fun main() {
    createPayment(CreditCard())
    createPayment(BankSlip())
    createPayment(Debit())
}
