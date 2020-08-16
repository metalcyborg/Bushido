package phibonacci

import com.google.common.truth.Truth.assertThat
import org.junit.Before

import org.junit.Test

class FibonacciRecursionTest {

    lateinit var fibonacci: FibonacciRecursion

    @Before
    fun setUp() {
        fibonacci = FibonacciRecursion()
    }

    @Test(expected = IllegalArgumentException::class)
    fun `throw exception if n is negative number`() {
        fibonacci.getValue(-1)
    }

    @Test
    fun `get first item`() {
        assertThat(fibonacci.getValue(0)).isEqualTo(0)
    }

    @Test
    fun `get second item`() {
        assertThat(fibonacci.getValue(1)).isEqualTo(1)
    }

    @Test
    fun `get third item`() {
        assertThat(fibonacci.getValue(2)).isEqualTo(1)
    }

    @Test
    fun `get 4th item`() {
        assertThat(fibonacci.getValue(3)).isEqualTo(2)
    }

    @Test
    fun `get 5th item`() {
        assertThat(fibonacci.getValue(4)).isEqualTo(3)
    }

    @Test
    fun `get 10th item`() {
        assertThat(fibonacci.getValue(9)).isEqualTo(34)
    }

    @Test
    fun `get 50th item`() {
        assertThat(fibonacci.getValue(50)).isEqualTo(12_586_269_025L)
    }
}