package org.example

class Car (

    var manufacturer: String,
    var model: String,
    var wheels: Int = 4,

){

    fun getDescription(): String {
        return "$manufacturer $model $wheels"
    }
}