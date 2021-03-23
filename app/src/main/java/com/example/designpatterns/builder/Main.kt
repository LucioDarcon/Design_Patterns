package com.example.designpatterns.builder

fun main() {

    val sale                  = Sale()
    val builder : SaleBuilder = MoneyBuilder()
    builder.buildAddDiscount()
    builder.buildAddProduct()
    builder.getPrice()

}