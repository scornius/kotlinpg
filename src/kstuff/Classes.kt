package kstuff


fun main(args: Array<String>) {
    //callClassMethod()
    destructuring()
}

class Foo {
    fun someMethod(a : String) {
        println(a)
    }
}

fun callClassMethod() {
    Foo().someMethod("huhu")
}

fun destructuring() {
    val user = User("Sepp", 57)
    val (name, age) = user
    println("$name is $age")
}

class WithConstructor(foo: String) {
    var bar: String

    init {
        bar = foo
    }
}

data class User(val name: String, val age: Int) {
/*
- equals()/hashCode() pair
- toString() of the form "User(name=John, age=42)"
- copy() function
- componentN() functions corresponding to the properties in their order of declaration
 */
}

class Nephews() {
    var index = 0
    operator fun hasNext(): Boolean = index < 3
    operator fun next(): String {
        when (index++) {
            0 -> return "Tick"
            1 -> return "Trick"
            2 -> return "Track"
            else -> return "Argh"
        }
    }
    operator fun iterator() = this
}

object Singleton {
    var foo = "bar"
}

