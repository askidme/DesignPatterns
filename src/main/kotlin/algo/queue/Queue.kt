package algo.queue

class Queue(value: Int) {
    private var first: Node? = null
    private var last: Node? = null
    private var length = 0
    data class Node(val value: Int, var next: Node? = null)

    init {
        val newNode = Node(value)
        first = newNode
        last = newNode
        length++
    }

    fun printQueue(){
        var temp = first
        while (temp != null) {
            println(temp.value)
            temp = temp.next
        }
    }

    fun getFirst() {
        println("First: ${first?.value}")
    }

    fun getLast() {
        println("Last: ${last?.value}")
    }

    fun getLength() {
        println("length: $length")
    }

    fun enqueue(value: Int) {
        var newNode = Node(value)
        if(length == 0){
            first = newNode
            last = newNode
        } else {
            last?.next = newNode
            last = newNode
        }
        length++
    }

    fun dequeue(): Node? {
        if(length == 0) return null
        var temp = first
        if(length == 1){
            first = null
            last = null;
        } else {
            first = first?.next
            temp?.next = null
        }
        length--
        return temp
    }
}