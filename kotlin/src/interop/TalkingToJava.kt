package interop

import classes.CustomerJava

fun main(args: Array<String>) {
    val customer = CustomerJava()

    customer.email = "mail@natron.com"

    customer.prettyPrint()

    customer.neverNull()

    val runnable = Runnable { println("Invoking runnable") }

    val kr = KotlinCustomerRepo()

    val customerJava = kr.getById(10)
    customerJava.id
}

class PersonKotlin: PersonJava() {

}

class KotlinCustomerRepo: CustomerRepository {
    override fun getById(id: Int): CustomerJava {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}