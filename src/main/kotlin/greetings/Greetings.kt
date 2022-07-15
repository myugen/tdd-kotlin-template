package greetings

data class Greetings(private val to: String? = null) {
    fun sayHello() = "Hello, " + (to ?: "world") + "!"
}
