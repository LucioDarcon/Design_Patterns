package com.example.designpatterns.builder

class MoneyBuilder : SaleBuilder() {

    override fun buildAddDiscount() {
        this.sale.addDiscount(20F)
    }

}