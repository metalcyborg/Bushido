package phibonacci

import java.math.BigInteger

class FibonacciSum {

    private val fibonacci = FibonacciCacheRecursion()

    fun getSum(n: Int): BigInteger {
        if (n < 0) throw IllegalArgumentException()

        var sum = BigInteger.ZERO
        for (i in 0 until n) {
            sum += fibonacci.getValue(i)
        }
        return sum
    }
}