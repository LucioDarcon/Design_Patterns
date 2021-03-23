package com.example.designpatterns.builder

abstract class SaleBuilder {

    protected var sale = Sale()

    fun sale(): Sale {
        return this.sale
    }

    fun sale(sale: Sale) {
        this.sale = sale
    }

    abstract fun buildAddDiscount()

}