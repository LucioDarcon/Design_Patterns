package com.example.designpatterns.proxy

class DataBaseProxy() : DataBase() {

    override fun select(table: String, fields: String, condition: String): String? {
        println(super.select(table, fields, condition))
        return super.select(table, fields, condition)
    }

    override fun update(table: String, fields: String, condition: String): String? {
        println(super.update(table, fields, condition))
        return super.update(table, fields, condition)
    }

    override fun insert(table: String,  fields:List<String>, values: List<Any>) : String? {
        println(super.insert(table, fields, values))
        return super.insert(table, fields, values)
    }

    override fun delete(table: String, id: Int): String? {
        println(super.delete(table, id))
        return super.delete(table, id)
    }



}