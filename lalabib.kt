/* basic control flow with kotlin */

fun main() {
    val listNumber = 1.rangeTo(100)

    for (number in listNumber) {
        // TODO 1
        if (number %2 == 0) continue

        // TODO 2
        if (number > 15) break

        // TODO 3
        val result = number * (number + 10)
        println("range result is $result")
    }
}
