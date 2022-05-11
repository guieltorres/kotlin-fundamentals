package Fundamentals

class Person(var name: String, var height: Double, var age: Int){
    val children: MutableList<Person> = mutableListOf()
    constructor(name: String, height: Double, age: Int, parent: Person) : this(name, height, age) {
        parent.children.add(this)
    }

    //  method
    fun talk(whatToSay:String): String{
        return whatToSay
    }

    override fun toString(): String {
        return "name: ${name}, height: ${height}, age: ${age}"
    }
}


class Car (private var model: String, private var numberOfDoors: Int){

}


fun main(){
    val jenny = Person("Jenny",1.70,28)
    val james = Person("James",1.42,5, jenny)
    val angela = Person("Angela",1.52,8, jenny)
    println(jenny)
    println(jenny.children[0])
    println(jenny.children[1])
    println(james)
    println(angela.talk("Why is the sky blue?"))

    val onix = Car("Onix 1.0",5)

}