package com.example.designpatterns.builder.builders

class InstallmentBuilder : SaleBuilder() {

    override fun buildAddDiscount() {
        this.sale.addDiscount(0F)
    }


}