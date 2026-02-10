package algo.bst

import java.util.*

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
            } else if (value > temp.value) {
                temp.right
            } else {
                return true;
            }
        }
        return false
    }

    fun rContains(value: Int) = rContains(root, value)

    private fun rContains(currentNode: Node?, value: Int): Boolean {
        if (currentNode == null) return false
        if (value == currentNode.value) return true

        return if (value < currentNode.value) {
            rContains(currentNode.left, value)
        } else {
            rContains(currentNode.right, value)
        }
    }

    fun rInsert(value: Int) {
        if (root == null) root = Node(value)
        rInsert(root, value)
    }

    private fun rInsert(currentNode: Node?, value: Int): Node {
        if (currentNode == null) return Node(value)

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value)
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value)
        }
        return currentNode
    }

    fun deleteNode(value: Int): Node? {
        return deleteNode(root, value);
    }

    private fun deleteNode(currentNode: Node?, value: Int): Node? {
        if (currentNode == null) return null

        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value)
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value)
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null
            }
            if (currentNode.left == null) {
                return currentNode.right
            }
            if (currentNode.right == null) {
                return currentNode.left
            }
            val subTreeMin = minValue(currentNode.right)
            currentNode.value = subTreeMin
            currentNode.right = deleteNode(currentNode.right, subTreeMin)
        }
        return currentNode
    }

    fun minValue(currentNode: Node?): Int = generateSequence(currentNode) { it.left }.last().value


    fun bfs(): List<Int>{
        var currentNode = root
        var queue: Queue<Node> = LinkedList()
        val result = ArrayList<Int>()
        queue.add(currentNode)
        while (!queue.isEmpty()) {
            currentNode = queue.poll()
            result.add(currentNode.value)
            if(currentNode.left != null) {
                queue.add(currentNode.left)
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right)
            }
        }

        return result
    }

    fun dfsPreOrder(): List<Int> {
        if (root == null) return ArrayList()
        val result = ArrayList<Int>()
        class Traverse {
            constructor(currentNode: Node) {
                result.add(currentNode.value)
                if(currentNode.left != null) {
                    Traverse(currentNode.left!!)
                }
                if(currentNode.right != null) {
                    Traverse(currentNode.right!!)
                }
            }
        }
        Traverse(root!!)
        return result
    }

    fun dfsPostOrder(): List<Int> {
        if(root == null) return ArrayList()
        val result = ArrayList<Int>()
        class Traverse {
            constructor(currentNode: Node) {
                if(currentNode.left != null) {
                    Traverse(currentNode.left!!)
                }
                if(currentNode.right != null) {
                    Traverse(currentNode.right!!)
                }
                result.add(currentNode.value)
            }
        }
        Traverse(root!!)
        return result
    }

    fun dfsInOrder(): List<Int> {
        if (root == null) return ArrayList()
        val result = ArrayList<Int>()
        class Traverse {
            constructor(currentNode: Node) {
                if(currentNode.left != null) {
                    Traverse(currentNode.left!!)
                }
                result.add(currentNode.value)
                if(currentNode.right != null) {
                    Traverse(currentNode.right!!)
                }
            }
        }
        Traverse(root!!)
        return result
    }
}