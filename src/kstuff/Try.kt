package kstuff


fun main(args: Array<String>) {
    tryCatch(0)
}

fun tryCatch(a : Int) {
    try {
        17 / a
    } catch(e: Exception) {
        throw IllegalArgumentException("does not compute: " + e.message)
    }
}