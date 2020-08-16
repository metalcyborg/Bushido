package phibonacci

import java.lang.IllegalArgumentException

class FibonacciRecursion {

    fun getValue(n: Int): Long {
        return when {
            n < 0 -> throw IllegalArgumentException()
            n == 0 -> 0
            n == 1 -> 1
            else -> getValue(n - 2) + getValue(n - 1)
        }
    }
}