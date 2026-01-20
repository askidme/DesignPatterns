package algo.linkedlist

class LinkedList(value: Int) {
    private var head: Node? = null
    private var tail: Node? = null
    private var length = 0

    data class Node(var value: Int, var next: Node? = null)

    init {
        head = Node(value).also { tail = it }
        length = 1
    }

    fun printList() {
        generateSequence(head) { it.next }.forEach { println(it.value) }
    }

    fun getHead() = println("Head: ${head?.value}")

    fun getTail() = println("Tail: ${tail?.value}")

    fun getLength() = println("Length: ${length}")

    fun append(value: Int) {
        val newNode = Node(value)
        if (length == 0) {
            head = newNode.also { tail = it }
        } else {
            tail?.next = newNode
            tail = newNode
        }
        length++
    }

    fun removeLast(): Node? {
        if (length == 0) return null
        var temp = head
        var pre = head
        while (temp?.next != null) {
            pre = temp
            temp = temp.next
        }
        tail = pre
        tail?.next = null
        length--
        if (length == 0) {
            head = null
            tail = null
        }
        return temp
    }

    fun prepend(value: Int) {
        val newNode = Node(value)
        when (length) {
            0 -> head = newNode.also { tail = it }
            else -> {
                newNode.next = head
                head = newNode
            }
        }
        length++
    }

    fun removeFirst(): Node? {
        if (length == 0) return null
        var temp = head
        head = head?.next
        temp?.next = null
        length--
        if (length == 0) {
            tail = null
        }
        return temp
    }

    fun get(index: Int): Node? {
        if (index < 0 || index >= length) return null
        var temp = head
        for (i in 0 until index) {
            temp = temp?.next
        }
        return temp
    }

    fun set(index: Int, value: Int): Boolean {
        val temp = get(index) ?: return false
        temp.value = value
        return true
    }

    fun insert(index: Int, value: Int): Boolean {
        if (index < 0 || index > length) return false
        if (index == 0) {
            prepend(value)
            return true
        }
        if (index == length) {
            append(value)
            return true
        }
        var temp = get(index - 1)
        val newNode = Node(value)
        newNode.next = temp?.next
        temp?.next = newNode
        length++
        return true
    }

    fun remove(index: Int): Node? {
        if (index < 0 || index >= length) return null
        if (index == 0) return removeFirst()
        val prev = get(index - 1)
        val temp = prev?.next
        prev?.next = temp?.next
        temp?.next = null
        length--
        return temp
    }

    fun reverse() {
        var temp = head
        head = tail
        tail = temp
        var before: Node? = null
        var after = temp?.next
        for(i in 0 until length) {
            after = temp?.next
            temp?.next = before
            before = temp
            temp = after

        }
    }

    override fun toString(): String {
        return "head: $head, tail: $tail, length: $length"
    }
}