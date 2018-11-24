package tidbits

import classes.CustomerKotlin

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 2300000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 2300000)
}

fun main(args: Array<String>) {
    val result = capitalAndPopulation("Madrid")
    println(result.first)
    println(result.second)
    println()

    val countryInfo = countryInformation("Madrid")
    countryInfo.third

    val (capital, continent, population) = countryInformation("Madrid")
    println(capital)
    println(continent)
    println(population)
    println()

    val (id, name, email) = CustomerKotlin(1, "Nate", "email@email.com")
    println(email)
    println()

    val listCapitalAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for((capital2, country) in listCapitalAndCountries) {
        println("$capital2 - $country")
    }
}