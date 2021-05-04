package com.example.designpatterns.proxy

open class DataBase {

    open var sql: String? = null

    open fun select(table: String, fields: String, condition: String): String? {
        return "select"
    }
    open fun update(table: String, fields: String, condition: String): String? {
        return "update"
    }
    open fun insert(table: String, fields:List<String>, values: List<Any>): String? {
        return "insert"
    }
     open fun delete(table: String, id: Int): String? {
        return "delete"
    }

}