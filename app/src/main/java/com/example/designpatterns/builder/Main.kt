package com.example.designpatterns.builder

fun main() {

    var sale = Sale()
    val builder : SaleBuilder = MoneyBuilder()

    sale.addProduct(Product(100F, "Manteiga"))
    sale.addProduct(Product(100F, "Biscoito"))

    builder.sale(sale)
    builder.buildAddDiscount()
    sale = builder.sale()
    println(sale.getPrice())
}