package classes

enum class Priority(val value: Int) {
    MINOR (-1) {
        override fun text(): String {
            return "[MINOR PRIORITY]"
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL (0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR (1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL (10) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text(): String
}

fun otherTests() {
    println("***OTHER TESTS OUTPUT***")
    for(priorityInList in Priority.values()) {
        println(priorityInList)
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)
    println()

    val priority = Priority.NORMAL
    println(priority)
    println(priority.value)
    println(priority.toString())
    println(priority.ordinal)
    println("***OTHER TESTS OUTPUT***")
    println()
}

fun main(args: Array<String>) {
//    otherTests()

    val priority = Priority.MINOR

    println(priority)
    println(priority.text())

}