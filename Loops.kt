package Fundamentals

//for
fun oneToTen(){
    for (i in 1..10){
        println(i)
    }
}
//while
fun tenToOne(){
    var x = 10
    while(x >- 0){
        println(x)
        x--
    }
}
//for step
fun evenToTen(){
    for (i in 2..10 step 2){
        println(i)
    }
}
//When
fun oneOrTwo(x: Int){
    when (x) {
        1, 2 -> println("x == 1 or x == 2")
        else -> println("otherwise")
    }
}

fun range(x: Int){
    when (x) {
        in 5..10 -> println("x is in the range")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}

fun startWithHi(x: Any): Boolean {
    return when (x) {
        is String -> x.startsWith("Hi")
        else -> false;
    }
}


fun main(){
    oneToTen()
    tenToOne()
    evenToTen()
    oneOrTwo(1);
    range(30)
    println(startWithHi("Hi, how are you?"))
    when {
        startWithHi("Hi") -> println("first")
        startWithHi("Hi, I am fine,") -> println("second")
    }

}