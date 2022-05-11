package Fundamentals

class Address {
//  lateinit to declare a variable later
    lateinit var street : String

    fun initStreet(){
        street = "Rio Grande, 25"
    }
}

fun main() {
    val nome : String = "Guilherme"
    var idade : Int = 28

//    Immutable variables
//    nome = "Torres"

//    Mutable variables
    idade = 29

    val someoneAddress = Address()

    someoneAddress.initStreet()
    println(someoneAddress.street)

}