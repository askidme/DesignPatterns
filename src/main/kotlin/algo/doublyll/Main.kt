package algo.doublyll

fun main() {
//    testAppend()
//    testRemoveLast()
//    testPrepend()
//    testRemoveFirst()
//    testGetByIndex()
//    testSetByIndex()
    testInsert2()
//    testRemove()
}
fun testRemove(){
    val myDll = DoublyLinkedList(1)
    for(i in 2 ..  10)
        myDll.append(i)
    println("before")
    myDll.printList()
//    for(i in 9 downTo  0)
    println("remove node by index $7 with value: ${myDll.remove(7)?.value}")
    println("remove node by index $5 with value: ${myDll.remove(5)?.value}")
    println("remove node by index $3 with value: ${myDll.remove(3)?.value}")
    println("after")
    myDll.printList()
}
fun testInsert2() {
    val myDll = DoublyLinkedList(0)
    myDll.insert(1,1);
    myDll.printList();
}
fun testInsert() {
    val myDll = DoublyLinkedList(0)
    myDll.append(5)
    println("before insert")
    myDll.printList()
    for (i in 0 until 4) {
        println("insert value ${i + 1} by index ${i + 1} success: ${myDll.insert(i + 1, i + 1)}")
    }
    println("after insert")
    myDll.printList()
}

fun testSetByIndex() {
    val myDll = DoublyLinkedList(0)
    myDll.append(1)
    myDll.append(2)
    myDll.append(3)
    myDll.append(4)
    myDll.append(5)

    println("before set")
    var node: DoublyLinkedList.Node?
    for (i in 0 until 6) {
        node = myDll.get(i)
        println("$i : ${node?.value}")
    }
    println("invoke set")
    for (i in 0 until 7) {
        println("set to ${i + 10} successful: ${myDll.set(i, i + 10)}")
    }
    println("after set")
    for (i in 0 until 6) {
        node = myDll.get(i)
        println("$i : ${node?.value}")
    }

}

fun testGetByIndex() {
    val myDll = DoublyLinkedList(0)
    myDll.append(1)
    myDll.append(2)
    myDll.append(3)
    myDll.append(4)
    myDll.append(5)
    var node: DoublyLinkedList.Node?
    for (i in 0 until 5) {
        node = myDll.get(i)
        println("$i : ${node?.value}")
    }

}

fun testRemoveFirst() {
    val myDll = DoublyLinkedList(2)
    myDll.append(1)
    for (i in 0 until 3) {
        println("${myDll.removeFirst()?.value}")
    }
}

fun testRemoveLast() {
    val myDll = DoublyLinkedList(1)
//    myDll.append(2)
    myDll.getTail()
    myDll.printList()
    println("removeLast: ")
    myDll.removeLast()
    myDll.getTail()
    myDll.printList()
    println("removeLast: ")
    myDll.removeLast()
    myDll.printList()
    println("result")
    myDll.printList()
}

fun testPrepend() {
    val myDll = DoublyLinkedList(1)
    myDll.removeLast()
    myDll.printList()
    myDll.prepend(2)
    myDll.getHead()
    myDll.getTail()
    myDll.getLength()
    myDll.printList()
    myDll.prepend(1)
    myDll.getHead()
    myDll.getTail()
    myDll.getLength()
    myDll.printList()

}

fun testAppend() {
    val myDll = DoublyLinkedList(1)
    myDll.append(2)
    myDll.printList()
}

fun testDll() {
    val myDll = DoublyLinkedList(7)
    myDll.getHead()
    myDll.getTail()
    myDll.getLength()
    myDll.printList()

}