package algo.queue

fun main(){
//    testConstructor()
//    testEnqueue()
    testDequeue()
}

fun testConstructor(){
    var queue = Queue(1)
    queue.printQueue()
    queue.getFirst()
    queue.getLast()
    queue.getLength()
}

fun testEnqueue(){
    var queue = Queue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.getFirst()
    queue.getLast()
    queue.getLength()
    queue.printQueue()
}

fun testDequeue(){
    var queue = Queue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    println("before dequeue")
    queue.printQueue()
    println("after dequeue")
    println(queue.dequeue()?.value)
    println(queue.dequeue()?.value)
    println(queue.dequeue()?.value)
    println(queue.dequeue()?.value)
}