package com.example.designpatterns.factorymethod

fun main() {

    val bankSlip: Payment =  BankSlip()
    bankSlip.setPrice(10.00)
    bankSlip.screenPayment()

    val creditCard: Payment =  CreditCard()
    creditCard.setPrice(10.00)
    creditCard.screenPayment()

    val debit: Payment =  Debit()
    debit.setPrice(10.00)
    debit.screenPayment()

//    if(pagamento == 'boleto') {
//        Boleto boleto = new Boleto();
//        boleto.setPreco(10.00); //repetido
//        boleto.telaPagamento(); //repetido
//    } else if (pagamento == 'cartao') {
//        CartaoCredito cartao = new CartaoCredito();
//        cartao.setPreco(10.00); //repetido
//        cartao.telaPagamento(); //repetido
//    } else {
//        Debito debito = new Debito();
//        debito.setPreco(10.00); //repetido
//        debito.telaPagamento(); //repetido
//    }


//    createPayment(CreditCard())
//    createPayment(BankSlip())
//    createPayment(Debit())
}
