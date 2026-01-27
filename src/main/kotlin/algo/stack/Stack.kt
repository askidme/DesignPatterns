package algo.stack

class Stack(value: Int) {
    private var top: Node? = null
    private var height: Int = 0
    init {
        val newNode = Node(value = value)
        top = newNode
        height++
    }
    data class Node(val value: Int, var next: Node? = null)

    fun printStack(){
        var temp = top
        while (temp != null) {
            println(temp.value)
            temp = temp.next
        }
    }

    fun getTop() {
        println("Top: ${top?.value}")
    }

    fun getHeight() {
        println("Height: ${height}")
    }

    fun push(value: Int) {
        val node = Node(value)
        if (height == 0) {
            top = node
        } else{
            node.next = top
            top = node
        }
        height++
    }

    fun pop(): Node? {
        if (height == 0) return null
        var node = top
        top = node?.next
        node?.next = null
        height--
        return node
    }
}