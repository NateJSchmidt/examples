package com.natejschmidt.examples.kotlin.advanced.classes

class Log() {

    companion object Factory {
        @JvmStatic fun createFileLog(filename: String): Log = Log(filename)
    }

    // each class can only have 1 companion object...
//    companion object Factory1 {
//        fun createFileLog(filename: String): Log = Log(filename)
//    }

    constructor(filename: String): this() {

    }
}

fun main(args: Array<String>) {

    val log = Log.createFileLog("filename.txt")


}
