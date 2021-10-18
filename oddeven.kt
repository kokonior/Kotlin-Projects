fun main(){
    var bilangan: Int

    println("Odd Even Validator")
    print("Input Number: ")
    bilangan = readLine()!!.toInt()

    if(bilangan % 2 == 0)
        println("The number is Even")
    else
        println("The number is Odd")
}
