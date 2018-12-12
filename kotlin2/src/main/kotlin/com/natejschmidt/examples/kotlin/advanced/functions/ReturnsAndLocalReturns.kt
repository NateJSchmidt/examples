package com.natejschmidt.examples.kotlin.advanced.functions

fun containingFunction() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) {
            // this is sort of like a break....but it is returning from the lambda defined by the {}'s of the forEach
            return@forEach
        }
    }
    println("Hello!")
}

fun containingFunction2() {
    val numbers = 1..100
    numbers.forEach myLabel@ {
        if (it % 5 == 0) {
            // this is sort of like a break....but it is returning from the lambda defined by the {}'s of the forEach
            return@myLabel
        }
    }
    println("Hello!")
}

fun containingFunction3() {
    val numbers = 1..100
    numbers.myForEach {
        if (it % 5 == 0) {
            // this return is allowed DUE TO the inline declaration of the myForEach function below
            return
        }
    }
    println("Hello!")
}

inline fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction4() {
    val numbers = 1..100

    //the below shows that an anonymous function does a local return, but a lambda does not do a local return without a label
    //easy way to remember:  it's going to return to the nearest fun (or nearest label)
    numbers.forEach( fun(element) {
        if (element % 5 == 0)
        {
            return
        }
    })
    println("Hello!")
}

fun main(args: Array<String>) {
    containingFunction()
    containingFunction2()
}
