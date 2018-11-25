@file:JvmName("UtilityClass")
package interop

val CopyrightYear = 2018
const val CopyrightYear2 = 2018

fun prefix(prefix: String, value: String): String {
    return "$prefix-$value"
}