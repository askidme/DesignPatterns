package algo.hashtable

class HashTable(size: Int = 7) {
    private var dataMap: Array<Node?> = arrayOfNulls(size)

    data class Node(val key: String, var value: Int, var next: Node? = null)

    fun printTable(){
        for(i in dataMap.indices){
            println("$i:")
            var node = dataMap[i]
            while (node != null) {
                println("{${node.key} = ${node.value}}")
                node = node.next
            }
        }
    }

    fun set(key: String, value: Int) {
        val index = hash(key)
        val newNode = Node(key, value)
        if(dataMap[index] == null) {
            dataMap[index] = newNode
        } else {
            var temp = dataMap[index]
            while (temp != null) {
                if(temp.key == key) {
                    temp.value = value
                    return
                }
                if(temp.next == null) {
                    temp.next = newNode
                    return
                }
                temp = temp.next
            }
        }
    }

    fun get(key: String): Int {
        val index = hash(key)
        var temp: Node? = dataMap[index]
        while(temp != null) {
            if(temp.key == key) return temp.value
            temp = temp.next
        }
        return  0
    }

    fun keys(): List<String>?{
        val keys = mutableListOf<String>()
        for(index in dataMap.indices){
            var temp = dataMap[index]
            while(temp != null) {
                keys.add(temp.key)
                temp = temp.next
            }
        }
        return  keys
    }
    private fun hash(key: String): Int {
        var hash = 0
        val keyChars = key.toCharArray()
        for (c in keyChars) {
            hash = (hash + c.code * 23) % dataMap.size
        }
        return hash
    }
}