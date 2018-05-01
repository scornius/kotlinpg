package kstuff

import javastuff.bar.SomeClass
import javastuff.foo.SomeClass as Schnurz

fun main(args: Array<String>) {
    javaTypes()
}

fun javaTypes() {
    val s1 = Schnurz()
    val s2 = SomeClass()
    println(s1)
    println(s2)
}