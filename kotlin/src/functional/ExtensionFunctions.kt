package functional

fun String.hello() {
    println("It's me!")
}

//fun String.toTitleCase() : String {
//    return this.split(" ").joinToString(" ") { it.capitalize() }
//}

fun String.toTitleCase(prefix: String) : String {
    return this.split(" ").joinToString(" ") { "$prefix ${it.capitalize()}" }
}

fun main(args: Array<String>) {
    "Hello".hello()

    println("this is a sample string to Title Case it".toTitleCase("Again - "))
    println()

    val customer = Customer()
    customer.makePreferred("new version")
    println()

//    val instance: BaseClass = InheritedClass()
    val instance = InheritedClass()

    instance.extension()
}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

// notice that the member function always takes preference
fun Customer.makePreferred(message: String) {
    println(message)
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}