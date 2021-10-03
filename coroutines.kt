// kotlin coroutines
import kotlinx.coroutines.*

suspend fun sum(valueA: Int, valueB: Int): Int {
            delay(1000L)
    return valueA + valueB
}

suspend fun multiple(valueA: Int, valueB: Int): Int {
            delay(2000L)
    return valueA * valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(20, 30) }
    val resultMultiple = async { multiple(20, 40) }

    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")

}
