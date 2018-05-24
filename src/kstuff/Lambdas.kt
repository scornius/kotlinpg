package kstuff

val fruits = arrayListOf("banana", "lemon", "apple", "berry")


fun main(args: Array<String>) {
    println(filterFruits())
}

fun filterFruits(): String {
    return fruits.filter {it.startsWith("b")}
            .first()
            .map {it.toUpperCase()}
            .toString()
}

