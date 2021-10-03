// oop with kotlin
class Lion(private val name: String) {
    
    var sleep: Boolean = false

        get() {
            println("Fungsi getter dipanggil")
            return field
        }
        set(value) {
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() {
        if (sleep) {
            println("$name, sleep!")
        } else {
            println("$name, let's play!")
        }
    }
}

fun main() {

    val simba = Lion("Simba")

    simba.toSleep()
    simba.sleep = true
    simba.toSleep()
}
