package algo.heap

fun main(){
//    testInsert()
    testRemove()
}

fun testRemove(){
    val myHeap = Heap()
    myHeap.insert(95)
    myHeap.insert(75)
    myHeap.insert(80)
    myHeap.insert(55)
    myHeap.insert(60)
    myHeap.insert(50)
    myHeap.insert(65)
    println(myHeap.getHeap())
    println(myHeap.remove())
    println(myHeap.getHeap())
    println(myHeap.remove())
    println(myHeap.getHeap())
    println(myHeap.remove())
    println(myHeap.getHeap())

}
fun testInsert() {
    val myHeap = Heap()
    myHeap.insert(99)
    myHeap.insert(72)
    myHeap.insert(61)
    myHeap.insert(58)
    println(myHeap.getHeap())
    myHeap.insert(100)
    println(myHeap.getHeap())
    myHeap.insert(75)
    println(myHeap.getHeap())

}