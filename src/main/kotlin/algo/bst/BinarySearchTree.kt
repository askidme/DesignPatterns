package algo.bst

class BinarySearchTree {
    var root: Node? = null

    data class Node(var value: Int = 0, var left: Node? = null, var right: Node? = null)

    fun insert(value: Int): Boolean {
        val newNode = Node(value)
        if (root == null) {
            root = newNode
            return true
        }
        var temp = root
        while (temp != null) {
            if (temp.value == value) {
                return false
            }
            if (value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode
                    return true
                }
                temp = temp.left
            } else {
                if (temp.right == null) {
                    temp.right = newNode
                    return true
                }
                temp = temp.right
            }
        }
        return true
    }

    fun contains(value: Int): Boolean {
        var temp = root
        while (temp != null) {
            temp = if (value < temp.value) {
                temp.left
            } else if(value > temp.value){
                temp.right
            } else {
                return true;
            }
        }
        return false
    }
}