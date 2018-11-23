package classes

/**
 * This is in effect a singleton.  Read only (i.e. val properties) are fine, read/write (i.e. var properties) are
 * very, very dangerous
 */
object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {

    var localObject = object {
        val PI = 3.14
    }

    println(Global.PI)
    println(localObject.PI)
}