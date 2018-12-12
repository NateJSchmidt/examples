package com.natejschmidt.examples.kotlin.advanced.functions

/**
 * Every time an inline function is called, the entire function is literally copy and pasted to the place where it is called.
 * You can also use "noinline" on the parameters to force the parameter to not be inlined
 */
inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    throw Exception("Exception")
    println("After calling op()")
}

inline fun tryingToInline(op: () -> Unit) {

    // you cannot assign inline parameters, like below; it is not allowed by the compiler
    //val reference = op

    println("Assigned value")
    op()
}

fun anotherFunction() {
    operation { println("This is the actual op function") }
}

fun main(args: Array<String>) {

    operation { println("This is the actual op function") }

}
