package kstuff


fun main(args: Array<String>) {
    useWith()
}

class Car {
    fun steerLeft() = println("left")
    fun steerRight() = println("right")
    fun accelerate() = println("accelerate")
    fun decelerate() = println("decelerate")
}

fun useWith() {
    val car = Car()
    with(car) {
        steerLeft()
        accelerate()
        steerRight()
        decelerate()
    }
}