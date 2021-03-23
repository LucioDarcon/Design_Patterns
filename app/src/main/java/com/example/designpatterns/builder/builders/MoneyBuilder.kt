package com.example.designpatterns.builder.builders

class MoneyBuilder : SaleBuilder() {

    override fun buildAddDiscount() {
        this.sale.addDiscount(20F)
    }

}