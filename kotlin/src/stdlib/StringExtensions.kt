package stdlib

import java.io.File

fun main(args: Array<String>) {
    // lots of options here...
    //"A Message".

    val file = File("filename.txt")
    file.name
    file.absolutePath
    with(file) {
        name
        absolutePath
    }

    val string: String? = "Some value"
    string?.let {
        it.length
    }
}