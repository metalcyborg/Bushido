package sorting.heap

class Heap<T : Comparable<T>> {

    val size: Int
    get() = items.size

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
        bubbleUp(items.lastIndex)
    }

    private fun bubbleUp(index: Int) {
        val item = items[index]
        val parentIndex = getParentIndex(index)
        if (parentIndex != -1) {
            val parent = items[parentIndex]
            if (parent > item) {
                swapItems(index, parentIndex)
                bubbleUp(parentIndex)
            }
        }
    }

    private fun swapItems(firstIndex: Int, secondIndex: Int) {
        val temp = items[firstIndex]
        items[firstIndex] = items[secondIndex]
        items[secondIndex] = temp
    }

    private fun getParentIndex(childIndex: Int): Int {
        return if (childIndex <= 0) -1 else (childIndex - 1) / 2
    }

    private fun getLeftChildIndex(parentIndex: Int): Int {
        return if (parentIndex < 0) {
            -1
        } else {
            parentIndex * 2 + 1
        }
    }

    private fun getRightChildIndex(parentIndex: Int): Int {
        return if (parentIndex < 0) {
            -1
        } else {
            parentIndex * 2 + 2
        }
    }

    fun getMin(): T? {
        return items[0]
    }

    fun extractMin(): T? {
        if (isEmpty()) return null

        val min = items[0]
        items[0] = items.last()
        items.removeAt(items.lastIndex)
        bubbleDown(0)

        return min
    }

    private fun bubbleDown(index: Int) {
        if (index !in 0..items.lastIndex) return

        val leftIndex = getLeftChildIndex(index)
        val rightIndex = getRightChildIndex(index)
        var minIndex = index
        if (leftIndex <= items.lastIndex && items[leftIndex] < items[minIndex]) {
            minIndex = leftIndex
        }
        if (rightIndex <= items.lastIndex && items[rightIndex] < items[minIndex]) {
            minIndex = rightIndex
        }
        if (minIndex != index) {
            swapItems(index, minIndex)
            bubbleDown(minIndex)
        }
    }

    fun isEmpty() = items.isEmpty()

    companion object {
        fun <T : Comparable<T>> makeHeap(items: List<T>) = Heap<T>()
                .apply {
                    items.forEach { item ->
                        add(item)
                    }
                }
    }
}