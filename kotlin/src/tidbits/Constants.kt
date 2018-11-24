package tidbits

// top level property, not recommended
val CopyrightAuthor = "Nate Schmidt"

// a better approach for creating properties because it uses grouping
object Copyright {
    val author = "Nate Schmidt"
}

fun main(args: Array<String>) {

}