package sorting.heap

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class HeapSortTest {

    private lateinit var sort: HeapSort

    @Before
    fun setUp() {
        sort = HeapSort()
    }

    @Test
    fun `sort reverse sequence`() {
        val list = listOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)

        val actual = sort.sort(list)

        assertThat(actual).isEqualTo(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    }

    @Test
    fun `sort already sorted data`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        val actual = sort.sort(list)

        assertThat(actual).isEqualTo(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    }

    @Test
    fun `sort random sorted data`() {
        val list = listOf(4, 2, 6, 8, 3, 5, 9, 7, 10, 1)

        val actual = sort.sort(list)

        assertThat(actual).isEqualTo(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    }
}