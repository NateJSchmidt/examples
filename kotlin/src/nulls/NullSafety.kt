package nulls

class CustomerJava(val name: String = "N/A")

class Service {
    fun evaluate() {

    }
}

class ServiceProvider {
    fun createService(): Service? {
        return null
    }
}

fun main(args: Array<String>) {
    val message: String = "Message"

    val nullMessage: String? = null
    val inferredNull = null

    println(nullMessage?.length)

    //the below would throw a NPE
//    println(nullMessage!!.length)


    val sp = createServiceProvider()
    sp?.createService()?.evaluate()

}

private fun createServiceProvider(): ServiceProvider? = ServiceProvider()