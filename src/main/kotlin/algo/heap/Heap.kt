package algo.heap

import java.time.temporal.ValueRange

class Heap(private val heap: ArrayList<Int> = ArrayList()) {

    fun getHeap(): List<Int> {
        return heap.toList()
    }

    private fun leftChild(index: Int): Int {
        return index * 2 + 1
    }

    private fun rightChild(index: Int): Int {
        return index * 2 + 2
    }

    private fun parent(index: Int): Int {
        return (index - 1) / 2
    }

    private fun swap(index1: Int, index2: Int) {
        val temp = heap[index1]
        heap[index1] = heap[index2]
        heap[index2] = temp
    }

    fun insert(value: Int) {
        heap.add(value)
        var current = heap.size - 1
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current))
            current = parent(current)
        }
    }

    private fun sinkDown(index: Int) {
        var current = index
        var maxIndex = index

        while (true) {
            var leftIndex = leftChild(current)
            var rightIndex = rightChild(current)
            if (leftIndex < heap.size && heap[leftIndex] > heap[maxIndex]) {
                maxIndex = leftIndex
            }
            if (rightIndex < heap.size && heap[rightIndex] > heap[maxIndex]) {
                maxIndex = rightIndex
            }
            if (current != maxIndex) {
                swap(current, maxIndex)
                current = maxIndex
            } else {
                break
            }
        }
    }
    //[61, 99, 75, 58, 72]
    //[99, 61, 75, 58, 72]

    fun remove(): Int? {
        if (heap.isEmpty()) return null
        if (heap.size == 1) return heap.removeFirst()
        val removedValue = heap[0]
        heap[0] = heap.removeLast()
        sinkDown(0)

        return removedValue
    }
}

