package sorting.heap

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class HeapTest {

    private lateinit var heap: Heap<Int>

    @Before
    fun setUp() {
        heap = Heap()
    }

    @Test
    fun `get min item for descending sequence`() {
        heap.add(5)
        heap.add(4)
        heap.add(3)
        heap.add(2)
        heap.add(1)

        assertThat(heap.getMin()).isEqualTo(1)
    }

    @Test
    fun `get min item for random sequence`() {
        heap.add(3)
        heap.add(1)
        heap.add(5)
        heap.add(4)
        heap.add(2)

        assertThat(heap.getMin()).isEqualTo(1)
    }

    @Test
    fun `extract min items`() {
        heap.add(3)
        heap.add(1)
        heap.add(5)
        heap.add(4)
        heap.add(2)

        assertThat(heap.extractMin()).isEqualTo(1)
        assertThat(heap.extractMin()).isEqualTo(2)
        assertThat(heap.extractMin()).isEqualTo(3)
        assertThat(heap.extractMin()).isEqualTo(4)
        assertThat(heap.extractMin()).isEqualTo(5)
    }

    @Test
    fun `isEmpty returns true if heap is empty`() {
        assertThat(heap.isEmpty()).isEqualTo(true)
    }

    @Test
    fun `isEmpty returns false if heap is not empty`() {
        heap.add(1)

        assertThat(heap.isEmpty()).isEqualTo(false)
    }

    @Test
    fun `create heap from list`() {
        val list = mutableListOf(3, 1, 5, 4, 2)

        val heap = Heap.makeHeap(list)

        assertThat(heap.extractMin()).isEqualTo(1)
        assertThat(heap.extractMin()).isEqualTo(2)
        assertThat(heap.extractMin()).isEqualTo(3)
        assertThat(heap.extractMin()).isEqualTo(4)
        assertThat(heap.extractMin()).isEqualTo(5)
    }

    @Test
    fun `size is 0 if heap is empty`() {
        assertThat(heap.size).isEqualTo(0)
    }

    @Test
    fun `size is more than 0 if heap is not empty`() {
        heap.add(1)
        heap.add(2)
        heap.add(3)
        heap.add(4)
        heap.add(5)

        assertThat(heap.size).isEqualTo(5)
    }
}