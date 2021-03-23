package com.example.designpatterns.builder.model

class Sale {

    private var discount : Float = 0F
    var product = arrayListOf<Product>()

    fun addDiscount(percent: Float) {
        this.discount = 1 - (percent/100)
        discount      = if (discount < 0) { 0F } else { this.discount }
    }

    fun addProduct(product: Product) {
        this.product.add(product);
    }

    fun getPrice() : Float {
        var total = 0f
        for(p in this.product)
            total += p.price
        return total * this.discount;
    }


}