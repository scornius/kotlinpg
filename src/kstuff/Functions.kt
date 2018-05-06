package kstuff


// next: Using nullable values and checking for null

fun main(args: Array<String>) {
    //simpleFunction(1)
    //simpleFunctionWithResult(2)
    //println(sum(1 ,2))
    //defaultArguments(1)
    //defaultArguments()
    //defaultArguments2(b = 3)
    //varargFun("a", "b")
    //varargFun(str = *arrayOf("a", "b"))
    //println(2 power 2)
    localFun()
}

fun simpleFunction(param1: Int) {
    println(param1)
}

fun simpleFunctionWithResult(param1 : Int): Int {
    return param1
}

fun sum(a : Int, b : Int) = a + b

fun defaultArguments(a : Int = 17) {
    println(a)
}

fun defaultArguments2(a : Int = 17, b: Int) {
    println("$a $b")
}

fun varargFun(vararg str: String) {
    println(str)
}

infix fun Int.power(x : Int): Int{
    return x * x
}

fun localFun() {
    val localVar = 2
    fun localFun(): Int {
        return localVar + 1
    }
    println(localFun())
}




