package kstuff


fun main(args: Array<String>) {
    //useNullableWithAutoCast()
    getStringLength("schnurzelpurzel")
    getStringLength(12)
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


fun getStringLength(obj: Any): Int? {
    println(obj.javaClass)

    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}