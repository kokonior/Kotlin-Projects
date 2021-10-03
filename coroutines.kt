
// kotlin coroutines
import kotlinx.coroutines.*

suspend fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
            delay(3000L)
    return valueA + valueB * valueC
}

suspend fun multiple(valueA: Int, valueB: Int, valueC: Int): Int {
            delay(2000L)
    return valueA * valueB - valueC 
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(30, 20, 20) }
    val resultMultiple = async { multiple(40, 20, 40) }

    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")

}
