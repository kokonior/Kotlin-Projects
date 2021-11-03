// toString(), equals(), copy()

data class DataUser (val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("Username", 19)
    val dataUser2 = DataUser("Jono", 19)
   // val dataUser3 = DataUser("Ayam", 323)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(name = "Nunik", age = 90)

    println("apakah dataUser + dataUser2 + dataUser4 = true? " + dataUser.equals(dataUser2) + dataUser.equals(dataUser4))
    println(dataUser4)
    println(dataUser5)
}
