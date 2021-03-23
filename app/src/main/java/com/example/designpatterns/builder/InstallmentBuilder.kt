package com.example.designpatterns.builder

class InstallmentBuilder : SaleBuilder() {

    override fun buildAddDiscount() {
        this.sale.addDiscount(0F)
    }


}