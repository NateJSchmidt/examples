package classes

class Customer(var id: Int, var name: String) {
    init {
        name = name.toUpperCase()
    }

    /**
     * This is a secondary constructor....it can be called, but immediately calls the primary constructor first
     */
    constructor(email: String): this(0, "") {
        name = email
    }
}

fun main(args: Array<String>) {
    val customer = Customer(10, "Nate")
    println(customer.name)

    val customer2 = Customer("myemail@gmail.com")
    println(customer2.name)
}
