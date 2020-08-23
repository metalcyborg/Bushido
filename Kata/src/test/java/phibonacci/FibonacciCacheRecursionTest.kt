package phibonacci

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import java.math.BigInteger

class FibonacciCacheRecursionTest {
    lateinit var fibonacci: FibonacciCacheRecursion

    @Before
    fun setUp() {
        fibonacci = FibonacciCacheRecursion()
    }

    @Test(expected = IllegalArgumentException::class)
    fun `throw exception if n is negative number`() {
        fibonacci.getValue(-1)
    }

    @Test
    fun `get first item`() {
        assertThat(fibonacci.getValue(0)).isEqualTo(BigInteger.ZERO)
    }

    @Test
    fun `get second item`() {
        assertThat(fibonacci.getValue(1)).isEqualTo(BigInteger.ONE)
    }

    @Test
    fun `get third item`() {
        assertThat(fibonacci.getValue(2)).isEqualTo(BigInteger.ONE)
    }

    @Test
    fun `get 4th item`() {
        assertThat(fibonacci.getValue(3)).isEqualTo(BigInteger.TWO)
    }

    @Test
    fun `get 5th item`() {
        assertThat(fibonacci.getValue(4)).isEqualTo(BigInteger.valueOf(3))
    }

    @Test
    fun `get 10th item`() {
        assertThat(fibonacci.getValue(9)).isEqualTo(BigInteger.valueOf(34))
    }

    @Test
    fun `get 50th item`() {
        assertThat(fibonacci.getValue(50)).isEqualTo(BigInteger("12586269025"))
    }
}