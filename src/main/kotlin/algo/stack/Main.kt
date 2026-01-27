package algo.stack

fun main(){
//    testConstructor()
//    testPush()
    testPop()
}

fun testConstructor(){
    val myStack = Stack(4)
    myStack.getTop()
    myStack.getHeight()
    myStack.printStack()
}

fun testPush(){
    val myStack = Stack(3)
    myStack.push(2)
    myStack.push(1)
    myStack.getTop()
    myStack.getHeight()
    myStack.printStack()
}

fun testPop(){
    val myStack = Stack(2)
    myStack.push(1)
    println("stack before pop")
    myStack.printStack()
    myStack.pop()
    println("stack after pop")
    myStack.printStack()
    myStack.pop()
    println("stack after pop")
    myStack.printStack()
    myStack.pop()
    println("stack after pop")
    myStack.printStack()
}