package com.natejschmidt.examples.kotlin.advanced.functions

fun factorial(number: Int): Int {
    when (number) {
        0, 1 -> return 1
        else -> return number * factorial(number -1)
    }
}

/* not sure why this doesn't compile
tailrec fun factorialTR(number: Int, accumulator: Int - 1): Int {
    when(number) {
        0 -> return accumulator
        else -> return factorial(number - 1, accumulator * number)
    }
}
*/

fun main(args: Array<String>) {
    println(factorial(5))
}
