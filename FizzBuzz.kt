package Fundamentals

fun fizzBuzz(lastNumber: Int){
    for (count in 1..lastNumber) {
        if (count % 3 == 0 && count % 5 == 0) {
            println("FizzBuzz")
        } else if(count % 3 == 0){
            println("Fizz")
        } else if(count % 5 == 0){
            println("Buzz")
        } else{
            println(count)
        }
    }
}

fun main() {
    print("Enter a number: ")
    val userInput = readLine()!!.toInt()
    fizzBuzz(userInput)
}

