package functions

fun printStrings(vararg strings: String) {
    reallyPrintingStrings(*strings)
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2" , "3")
    printStrings("1", "2", "3", "4")
}
