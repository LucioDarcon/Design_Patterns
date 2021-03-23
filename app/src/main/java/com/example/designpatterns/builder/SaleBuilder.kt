package com.example.designpatterns.builder

abstract class SaleBuilder {

    protected val sale = Sale()

    abstract fun buildAddDiscount()

    abstract fun buildAddProduct()

    abstract fun getPrice()
}