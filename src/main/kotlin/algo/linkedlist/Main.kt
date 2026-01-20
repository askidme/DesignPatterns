package algo.linkedlist

fun main() {
    val list = LinkedList(1)
    list.append(2)
    list.append(3)
    list.append(4)
//    list.insert(1,1)
//    println(list.remove(0))
    list.reverse()
    list.printList()
//3 -> 2 -> 1
//1 -> 2 -> 3
    
    /*
    val reversed = tail
    for(i in length - 2 downTo 0){
        prev = get(i - 1)
        prev.net = null
        reversed = prev
    }
    return reversed
    * */
}