package com.natejschmidt.examples.kotlin.advanced.functions

infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {

    //should be true
    println("Hello".shouldBeEqualTo("Hello"))

    //should be false...with infix
    println("Hello" shouldBeEqualTo "Hello2")

    //common use case is in unit testing
    val output = "Hello"
    println(output shouldBeEqualTo "Hello")
}
