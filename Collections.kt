package Fundamentals

fun main(){

//  iterators
    var listOfNumbers = listOf<Int>(1, 2, 3, 4)
    listOfNumbers.forEach {
        println(it)
    }

    for (number in listOfNumbers){
        println(number)
    }

//  immutable List of numbers
    var even = listOfNumbers.filter {it % 2 == 0}
    var firstEven = listOfNumbers.filter {it % 2 == 0}.first()

    println(even)
    println(firstEven)
    println(listOfNumbers[0])
    println(listOfNumbers.get(0))
    println(listOfNumbers.size)
    println(listOfNumbers.indexOf(3))

//  mutable List of strings
    var listOfString = mutableListOf<String>("Kotlin", "is", "awesome")
    listOfString.add("Do you agree?")
    println(listOfString)
    listOfString[0] = "JS"
    println(listOfString)

    listOfString.removeAt(0)
    listOfString.remove("Do you agree?")
    println(listOfString)

//  Manipulating lists
    var listOfInt = mutableListOf<Int>(5, 2, 3, 6, 4, 7, 1, 0)
    listOfInt.sort()
    println(listOfInt)
    listOfInt.shuffle()
    println(listOfInt)
    println(listOfInt.contains(2))
    println(listOfInt.contains(9))

//  Set
    var uniqueNumber = setOf(1, 2 , 3, 4, 4, 3)
    println(uniqueNumber)

//    Map
    var person = mutableMapOf("Jangela" to 28, "Jessy" to 13, "James" to 5)
    println(person)
    println(person.keys)

    person["Julia"] = 33
    person.put("Jordan", 2)
    println(person)
    println(person["Jessy"])

//  Can only have one key
    person["Jessy"] = 20

//  removing with key
    person.remove("Jangela")
    println(person)
}