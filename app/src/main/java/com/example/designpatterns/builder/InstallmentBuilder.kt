package com.example.designpatterns.builder

class InstallmentBuilder : SaleBuilder() {

    override fun buildAddDiscount() {
        this.sale.addDiscount(0F)
    }

    override fun buildAddProduct() {
        this.sale.addProduct(Product(10.0F, "arroz"))
        this.sale.addProduct(Product(20.0F, "feijão"))
    }

    override fun getPrice() {
        println(this.sale.getPrice())
    }


}