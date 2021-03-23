package com.example.designpatterns.builder.builders

import com.example.designpatterns.builder.model.Sale

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