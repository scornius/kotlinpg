package kstuff


fun main(args: Array<String>) {
    //callClassMethod()
    //destructuring()
    getterSetterConstructor()
}

class Foo {
    fun someMethod(a : String) {
        println(a)
    }
}

fun callClassMethod() {
    Foo().someMethod("huhu")
}

data class User(val name: String, val age: Int) {
/*
- equals()/hashCode() pair
- toString() of the form "User(name=John, age=42)"
- copy() function
- componentN() functions corresponding to the properties in their order of declaration
 */
}

fun destructuring() {
    val user = User("Sepp", 57)
    val (name, age) = user
    println("$name is $age")
}

fun getterSetterConstructor() {
    val x = GetterSetterConstructor("a", "b")
    println(x.baz)
}

class GetterSetterConstructor(foo: String, bar: String) {
    var baz: String = ""
    set(value) {
        println("setter called")
        if (value != "foo") {field = value}
    }
    get() {
        println("getter called")
        return field
    }

    init {
        println("init called")
        baz = foo
    }
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

