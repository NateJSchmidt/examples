package com.natejschmidt.examples.kotlin.advanced.classes

class DirectoryExplorer(val user: String) {

    inner class PermissionCheck() {
        fun validatePermission() {
            // throw exception if invalid
            if(user != "Nate") {

            }
        }

    }
    fun listFolder(folder: String, user: String) {

        val permissionsCheck = PermissionCheck()
        permissionsCheck.validatePermission()
    }

}

fun main(args: Array<String>) {
    val de = DirectoryExplorer("Nate")

    // you can access nested class, unless the class is declared as "private"
    //val pc = DirectoryExplorer.PermissionCheck()
    val pc = DirectoryExplorer("Natron").PermissionCheck()
}
