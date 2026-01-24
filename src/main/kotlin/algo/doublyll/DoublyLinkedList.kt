package algo.doublyll

class DoublyLinkedList(value: Int) {
    private var head: Node? = null
    private var tail: Node? = null
    private var length: Int = 0

    data class Node(var value: Int, var prev: Node? = null, var next: Node? = null) {}

    init {
        val newNode = Node(value)
        tail = newNode
        head = newNode
        length = 1
    }

    fun printList() {
        var node = head
        while (node != null) {
            println("${node.value} ")
            node = node.next
        }
    }

    fun getHead() = println("Head: ${head?.value}")

    fun getTail() = println("Tail: ${tail?.value}")

    fun getLength() = println("Length: $length")

    fun append(value: Int) {
        val newNode = Node(value)
        if (length == 0) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            newNode.prev = tail
            tail = newNode
        }
        length++
    }

    fun prepend(value: Int) {
        val newNode = Node(value)
        if (length == 0) {
            head = newNode
            tail = newNode
        } else {
            newNode.next = head
            head?.prev = newNode
            head = newNode
        }
        length++
    }

    fun removeLast(): Node? {
        if (length <= 0) return null

        var node = tail
        tail = tail?.prev
        tail?.next = null
        node?.prev = null
        length--
        if (length == 0) {
            head = null
        }
        return node
    }

    fun  removeFirst(): Node? {
        if(length <= 0) return null
        var node = head
        if (length == 1) {
            head = null
            tail = null
        } else {
            head = head?.next
            head?.prev = null
            node?.next = null
        }
        length--
        return node
    }


    fun get(index: Int): Node? {
        if (index < 0 || index >= length) return null
        var node = head
        if(index <= length / 2) {
            for (i in 0 until index) {
                node = node?.next
            }
        } else {
            node = tail
            for (i in length  downTo index + 2) {
                node = node?.prev
            }
        }
        return node
    }

    fun set(index: Int, value: Int): Boolean {
        val node = get(index)
        node?.value = value
        return node != null
    }

    fun insert(index: Int, value: Int): Boolean {
        var newNode = Node(value)
        if(index < 0 || index > length) return false
        if(index == 0) {
            prepend(value)
            return true
        }
        if(index == length) {
            append(value)
            return true
        }
        var next = get(index)
        var prev = next?.prev
        prev?.next = newNode
        newNode.prev = prev
        newNode.next = next
        next?.prev = newNode
        length++
        return true
    }

    fun remove(index: Int): Node? {
        val node = get(index) ?: return null
        if(index == 0) return removeFirst()
        if(index == length) return removeLast()
        var prev = node?.prev
        var next = node?.next
        prev?.next = next
        next?.prev = prev
        node?.prev = null
        node?.next = null
        length--
        return node
    }
}