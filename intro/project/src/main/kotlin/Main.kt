package org.example

fun isOdd(num: Int): Boolean {
    return num % 2 != 0
}

fun main() {
    val name = "Kotlin" // Constant
    var x: Int = 5 // Variable
    x = x + 1 // arithmetic
    println("The value of x is $x") // print
    // list
    val list = mutableListOf<String>("number1", "number2", "number3", "number4", "number5")
    list.add("number6") // list append
    // while loop
    var counter = 0
    while (counter < list.size) {
        println(list[counter])
        counter++
    }
    // if statement
    when(x) {
        in 1..3 -> println("The value of x is less than or equal to 3")
        in 3..5 -> println("The value of x is between 3..5")
        else -> println("The value of x is equal to 5")
    }
    when(isOdd (x)) {
        true -> println("true")

        else -> println("false")
    }

    val car: Car = Car(
        manufacturer = "Toyota", model = "Velfire", wheels = 6
    )

    println(car.getDescription())

}