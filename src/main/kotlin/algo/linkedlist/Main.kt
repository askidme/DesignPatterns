package algo.linkedlist

fun main() {
//    testRemove()
    testRemoveFirst()
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
fun testReverse(){
    val list = LinkedList(1)
    list.append(2)
    list.append(3)
    list.append(4)
//    list.insert(1,1)
//    println(list.remove(0))
    list.reverse()
    list.printList()
}

fun testRemove() {
    val list = LinkedList(1)
    list.append(3)
    list.printList()
    list.getTail()
    list.getHead()
    list.remove(1)
    list.printList()
    list.getTail()
    list.getHead()
}

fun testRemoveFirst(){
    val list = LinkedList(1)
    list.append(3)
    list.printList()
    list.getTail()
    list.getHead()
    list.removeFirst()
    list.printList()
    list.getTail()
    list.getHead()
}