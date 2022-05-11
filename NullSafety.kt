package Fundamentals

fun main(){


    var a: String = "abc" // Regular initialization means non-null by default
//    a = null // compilation error (toggle)

//  allowing nullable string
    var b: String? = "abc" // can be set to null
//    b = null // ok (toggle)
    println(b)

//  checking for null conditions
    var l = if (b != null) b.length else -1

    println(l)

    var c: String? = "Kotlin"
//    c = null // (toggle)
    if (c != null && c.length > 0) {
        println("String of length ${c.length}")
    } else {
        println("Empty string")
    }

//  safe calls
    val d = "Kotlin"
    val e: String? = null
    println(d?.length) // Unnecessary safe call
    println(e?.length)


    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }

    val listAsNull : List<Int>? = null
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()

    println(intList)

//    Elvis operator

    l = b?.length ?: -1
    println(l)  //same validation in line 15

//  The !! operator
//    The not-null assertion operator (!!) converts any value to
//    a non-null type and throws an exception if the value is null
    var f: String? = "abc"
//    f = null (toggle)
    l = f!!.length // if is null throws an exception


//    Safe Casts
//    Regular casts may result in a ClassCastException if the object is not of the target type.
//    Another option is to use safe casts that return null if the attempt was not successful:
    var g = 1
    g = 2
//    g = "3" // (toggle)
    val gInt: Int? = g as? Int
    print(gInt)
}
