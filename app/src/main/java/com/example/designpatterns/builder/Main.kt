package com.example.designpatterns.builder

import com.example.designpatterns.builder.builders.MoneyBuilder
import com.example.designpatterns.builder.builders.SaleBuilder
import com.example.designpatterns.builder.model.Product
import com.example.designpatterns.builder.model.Sale

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