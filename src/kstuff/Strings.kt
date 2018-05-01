package kstuff

val hereDoc = """laber
        laber
        rhabarber"""

fun main(args: Array<String>) {
    //println(hereDoc)
    variableExpansion(4)
}

fun variableExpansion(a : Int) {
    println("variable expansion: $a ${a} ${a + 1} escape: ${'$'}")
}

