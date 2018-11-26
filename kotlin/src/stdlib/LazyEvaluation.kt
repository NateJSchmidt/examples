package stdlib

fun main(args: Array<String>) {

    val elements = 1..1000000000

//    val output = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) }
//    output.forEach { println(it) }

    val output = elements.asSequence().take(30).sum()
    println(output)

    val numbers = generateSequence(1) { x -> x + 10 }
    println(numbers.take(30).sum())
}