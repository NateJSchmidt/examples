package com.natejschmidt.examples.kotlin.advanced.classes

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController() {
    lateinit var repository: Repository

    fun index(): String {
        return repository.getAll().toString()
    }
}

fun main(args: Array<String>) {

    // this example shows that instead of a generic NPE, we can get a more specific "late init" exception
    val customerController = CustomerController()
    customerController.index()
}
