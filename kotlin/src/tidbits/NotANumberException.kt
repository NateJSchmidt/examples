package tidbits

import java.io.BufferedReader
import java.io.FileReader
import java.lang.IndexOutOfBoundsException

class NotANumberException(message: String) : Throwable(message) {

}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number")
    }
}

fun main(args: Array<String>) {
//    throw NotANumberException()

    try {
        checkIsNumber("A")
    } catch (e: IllegalArgumentException) {
        println("Do nothing!")
    } catch (e: NotANumberException) {
        println("${e.message}")
    }
    println()

    val buffer = BufferedReader(FileReader("input.txt"))
    // the return value of the try/catch comes from the try or catch...not the finally
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch(e: IndexOutOfBoundsException) {
        println("Exception handled")
        -1
    }
    finally {
        println("Closing")
        buffer.close()
        -2
    }
    println(result)
}