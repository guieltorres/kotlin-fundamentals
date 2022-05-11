package Fundamentals

fun evenOdd(number: Int): String{
    return if (number % 2 == 0) "even" else "odd"
}

fun main(){
    println(evenOdd(5))
    println(evenOdd(8))
}