package com.example.designpatterns.builder

class DebitBuilder : SaleBuilder() {

    override fun buildAddDiscount() {
        this.sale.addDiscount(15F)
    }


}