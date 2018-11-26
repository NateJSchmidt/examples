package classes

import java.util.*

class Customer2(var id: Int, var name: String, val yearOfBirth: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN"))
                throw IllegalArgumentException("Social security should start with SN")

            // field is a special keyword in kotlin that references the backing field for the variable in getter/setter
            field = value
        }

    fun customerAsString(): String {
        //println("Id: $id - Name: $name")
        return "Id: $id - Name: $name"
    }
}

fun main(args: Array<String>) {
    val customer = Customer2(10, "Nate", 1973)

    customer.socialSecurityNumber = "SN1234"

    //customer.customerAsString()
    println(customer.customerAsString())

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)
}