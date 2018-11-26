package classes

import java.io.IOException

/**
 * The data modifier automatically gives you a nice "toString" method, an "equals" method (which does
 * a 1 by 1 comparison of all of the properties in the class, and a hashcode function.
 */
data class CustomerKotlin(var id: Int, var name: String, var email: String) {
    @JvmField
    val someField = "Value"

    /**
     * You can also simply override the toString, equals, or hashcode functions if you need to when using the data
     * keyword
     */
    override fun toString(): String {
        //language=JSON
        return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }

    @JvmOverloads
    fun changeStatus(status: Status = Status.Current) {

    }

    @JvmName("preferential")
    fun makePreferred() {

    }

    @Throws(IOException::class)
    fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("filename cannot be blank")
        }
    }
}

fun CustomerKotlin.extension() {

}

enum class Status {
    Current,
    Past
}

fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(1, "Nate", "mail@nate.com")
    val customer2 = CustomerKotlin(1, "Nate", "mail@nate.com")

    val customer3 = customer1

    println(customer1)

    if (customer1 == customer2) {
        println("They are the same")
    }

    println(customer3.id)
    val customer4 = customer1.copy(id = 5)
    println(customer4.id)
    println(customer4.name)
}