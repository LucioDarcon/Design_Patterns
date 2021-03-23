package com.example.designpatterns.builder

class DebitBuilder : SaleBuilder() {

    override fun buildAddDiscount() {
        this.sale.addDiscount(15F)
    }

    override fun buildAddProduct() {
        this.sale.addProduct(Product(15.0F, "arroz"))
        this.sale.addProduct(Product(25.0F, "feijão"))
    }

    override fun getPrice() {
        println(this.sale.getPrice())
    }

}