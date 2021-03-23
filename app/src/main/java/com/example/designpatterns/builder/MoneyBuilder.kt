package com.example.designpatterns.builder

class MoneyBuilder : SaleBuilder() {

    override fun buildAddDiscount() {
        this.sale.addDiscount(20F)
    }

    override fun buildAddProduct() {
        this.sale.addProduct(Product(10.0F, "arroz"))
        this.sale.addProduct(Product(30.0F, "feijão"))
    }

    override fun getPrice() {
        println(this.sale.getPrice())
    }

}