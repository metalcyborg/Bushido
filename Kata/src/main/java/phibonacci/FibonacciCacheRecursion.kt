package phibonacci

import java.lang.IllegalArgumentException
import java.math.BigInteger

class FibonacciCacheRecursion {

    private val cache = hashMapOf<Int, BigInteger>()

    fun getValue(n: Int): BigInteger {
        return when {
            n < 0 -> throw IllegalArgumentException()
            n == 0 -> BigInteger.ZERO
            n == 1 -> BigInteger.ONE
            else -> {
                val first = cache[n - 2] ?: getValue(n - 2)
                val second = cache[n - 1] ?: getValue(n - 1)
                val result = first + second
                cache[n] = result
                result
            }
        }
    }
}