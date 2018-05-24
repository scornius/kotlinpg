package kstuff


fun main(args: Array<String>) {
    getStringLength("schnurzelpurzel")
    getStringLength(12)
}

fun getStringLength(obj: Any): Int? {
    println(obj.javaClass)

    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}