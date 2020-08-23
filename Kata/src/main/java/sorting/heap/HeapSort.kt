package sorting.heap

class HeapSort {

    fun <T : Comparable<T>> sort(items: List<T>): List<T> {
        val heap = Heap.makeHeap(items)
        val result = mutableListOf<T>()
        for (i in items.indices) {
            val min = heap.extractMin()
            min?.let { result.add(min) }
        }
        return result
    }
}