/* basic control flow with kotlin */

fun main() {
    val listNumber = 1.rangeTo(100)

    for (number in listNumber) {
        
        if (number %2 == 0) continue

        
        if (number >= 20) break

        
        val result = number * 10 / 2
        println("range result is $result")
    }
}
