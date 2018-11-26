package stdlib

import java.util.*

fun main(args: Array<String>) {
    val numbers = 1..100
    val cities = listOf("Madrid", "London", "Paris")
    val empty = emptyList<String>()
    println(empty.javaClass)
    println(cities.javaClass)
    println()

    val arrayList = Arrays.asList("Madrid", "London")
    println(arrayList.javaClass)
    println()

    // mutable lists allow us to add/remove things from the list
    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("London")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Paris", "France"))

    val booleans = booleanArrayOf(true, false, true)
    val characters = charArrayOf('A', 'B', 'C')
}