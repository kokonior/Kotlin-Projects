fun main() {
    val cat = Cat()
    cat.eat()
}
 
open class Animal{
   fun walk(){
     println("${javaClass.simpleName} walk!")
   }
}
 
open class Carnivore: Animal(){
   fun eat(){
     println("${javaClass.simpleName} eat!")
   }
}
 
class Cat: Carnivore()