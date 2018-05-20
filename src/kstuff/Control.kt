package kstuff

fun main(args: Array<String>) {
    //println(isEven(3))
    //println(isOdd(3))
    //translate(1)
    //isString("huhn")
    //iterateRange()
    //iterateArray()
    //iterateArrayWithIndex()
    iterateMap()
    //allNephews()
    //whileLoop()
}

fun isEven(a: Int): Boolean {
    if (a % 2 == 0) {
        return true
    } else {
        return false
    }
}

fun isOdd(a: Int): Boolean {
    return if (a % 2 != 0) true else false
}

fun translate(a : Int) {
    when (a) {
        1 -> println("one")
        1 -> println("still one")
        2,3 -> println("two or three")
        1+3 -> println("four")
        in 5..10 -> println("5 to 10")
        else -> println("unknown")
    }
}

fun isString(x : Any) {
    when (x) {
        is String -> println("yep")
        else -> println("nope")
    }
}

fun iterateRange() {
    for (x in 1..7) {
        println(x)
    }
}

fun iterateArray() {
    val array = arrayOf("a", "b", "c")
    for (a in array) {
        println(a)
    }
}

fun iterateArrayWithIndex() {
    val array = arrayOf("a", "b", "c")
    for (i in array.indices) {
        println("$i = ${array[i]}")
    }
}

fun iterateMap() {
    val map = mapOf("a" to 1, "b" to 2)
    for ((key, value) in map) {
        println("$key = $value")
    }

    println(map["a"])
}

fun allNephews() {
    for (n in Nephews()) {
        println(n)
    }
}

fun whileLoop() {
    var i = 0
    while(i<3) {
        println(i++)
    }
}