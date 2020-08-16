package phibonacci

import java.lang.IllegalArgumentException
import java.math.BigInteger

class FibonacciIteration {

    fun getValue(n: Int): BigInteger {
        if (n < 0) throw IllegalArgumentException()

        var first = BigInteger.ZERO
        var second = BigInteger.ONE
        for (i in 1..n) {
            val result = first + second
            first = second
            second = result
        }

        return first
    }
}