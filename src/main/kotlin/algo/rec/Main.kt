package algo.rec

fun main() {
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
    println(factorial(4))
    println(factorial(8))
    println(factorial(9))
    println(factorial(10))
    println(factorial(11))
    println(factorial(12))
    println(factorial(13))
    println(factorial(14))
    println(factorial(15))
    println(factorial(16))
    println(factorial(100))
}

fun factorial(value: Long): Long {
    if (value == 1L) return 1
    return value * factorial(value - 1)
}