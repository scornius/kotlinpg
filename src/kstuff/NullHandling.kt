package kstuff

fun main(args: Array<String>) {
    //useNullableWithAutoCast()
    //checkNotNull()
    //checkNotNullElse()
    forceIt()
}

fun mayReturnNull(): Int? {
    return null
}

fun useNullableWithAutoCast() {
    val x = mayReturnNull()
    if (x != null) {
        println(x * 17)
    }
}

fun checkNotNull() {
    var foo : Int? = null
    println(foo?.plus(1))
    foo = 2
    println(foo?.plus(1))
}

fun checkNotNullElse() {
    val foo : Int? = null
    println(foo?.plus(1) ?: "nullinger")
}

fun forceIt() {
    val foo : Int? = null
    println(foo!!.plus(1))
}