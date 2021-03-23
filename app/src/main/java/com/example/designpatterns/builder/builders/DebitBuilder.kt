package com.example.designpatterns.builder.builders

class DebitBuilder : SaleBuilder() {

    override fun buildAddDiscount() {
        this.sale.addDiscount(15F)
    }


}