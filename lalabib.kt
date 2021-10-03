/* basic control flow with kotlin */

fun main() {
    val listNumber = 1.rangeTo(100)

    for (number in listNumber) {
        
        if (number %2 == 0) continue

        
        if (number > 15) break

        
        val result = number * (number + 10)
        println("range result is $result")
    }
}
