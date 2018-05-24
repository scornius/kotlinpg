package kstuff

val hereDoc = """laber
        laber
        rhabarber"""

val hereDoc2 = """laber
        |laber
        |rhabarber""".trimMargin()

fun main(args: Array<String>) {
    println(hereDoc)
    println(hereDoc2)
    //variableExpansion(4)
}

fun variableExpansion(a : Int) {
    println("variable expansion: $a ${a} ${a + 1} escape: ${'$'}")
}

