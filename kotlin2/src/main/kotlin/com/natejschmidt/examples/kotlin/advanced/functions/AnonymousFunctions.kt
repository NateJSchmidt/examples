package com.natejschmidt.examples.kotlin.advanced.functions


fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    println(op(3, {it * it}))

    //can't specify the return type
    println(op(3, {x -> x*x}))

    // the below is an anonymous functions
    println(op(2, fun(x): Int { return x * x }))

    // in the anonymous function we also have the return keyword
    println(op(2, fun(x): Int {
        if (x > 10) {
            return 0
        }
        else {
            return x * x
        }
    }))
}
