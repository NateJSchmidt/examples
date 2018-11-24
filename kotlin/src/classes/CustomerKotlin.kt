package classes

data class CustomerKotlin(var id: Int, var name: String, var email: String) {
    override fun toString(): String {
        //language=JSON
        return "{\"id\": \"$id\", \"name\": \"$name\"}"

    }
}