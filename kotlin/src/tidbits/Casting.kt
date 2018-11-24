package tidbits

open class Person {

}

class Employee: Person() {
    fun vacationDays(days: Int) {
        if(days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor: Person() {

}

var input: Any = 10

fun main(args: Array<String>) {
    //note that smart casting is done within if checks that are made with the "is" keyword

    val str = input as? String
    println(str?.length)
}