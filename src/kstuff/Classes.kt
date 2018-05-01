package kstuff


fun main(args: Array<String>) {
    callClassMethod()
}

class Foo {
    fun someMethod(a : String) {
        println(a)
    }
}

fun callClassMethod() {
    Foo().someMethod("huhu")
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