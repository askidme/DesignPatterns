package algo.bst

fun main() {
//    testInsert()
//    println("\n*************************************************\n")
//    testRInsert()
////    testContains()
//    println("\n*************************************************\n")
//    testRContains()
//    testMinValue()
//    testDelete()
//    testBfs()
    println("dfs pre order")
    testDfsPreOrder()
    println("dfs post order")
    testDfsPostOrder()
    println("dfs in order")
    testDfsInOrder()

}

fun testDfsInOrder() {
    val myBst = createSampleBST()
    println(myBst.dfsInOrder())
}

fun testDfsPostOrder() {
    val myBst = createSampleBST()
    println(myBst.dfsPostOrder())
}

fun testDfsPreOrder() {
    val myBst = createSampleBST()
    println(myBst.dfsPreOrder())
}

fun testBfs(){
    val myBst = createSampleBST()
    println(myBst.bfs())
}

fun testDelete(){
    val myBst = BinarySearchTree()
    myBst.insert(2)
    myBst.insert(1)
    myBst.insert(3)

    println("\nRoot: ${myBst.root?.value}")
    println("Root->Left: ${myBst.root?.left?.value}")
    println("Root->Right: ${myBst.root?.right?.value}")

    myBst.deleteNode(2)

    println("\nRoot: ${myBst.root?.value}")
    println("Root->Left: ${myBst.root?.left?.value}")
    println("Root->Right: ${myBst.root?.right?.value}")
}

fun testMinValue() {
    val myBst = createSampleBST()
    println(myBst.minValue(myBst.root))
    println(myBst.minValue(myBst.root?.right))
}

fun testConstructor() {
    val myBst = BinarySearchTree()
    println("root = ${myBst.root}")
}

fun testInsert() {
    val myBst = BinarySearchTree()
    myBst.insert(47)
    myBst.insert(21)
    myBst.insert(76)
    myBst.insert(18)
    myBst.insert(52)
    myBst.insert(82)

    myBst.insert(27)
    println(myBst.root?.left?.right?.value)
}

fun testRInsert() {
    val myBst = BinarySearchTree()
    myBst.rInsert(47)
    myBst.rInsert(21)
    myBst.rInsert(76)
    myBst.rInsert(18)
    myBst.rInsert(52)
    myBst.rInsert(82)

    myBst.insert(27)
    println(myBst.root?.left?.right?.value)
}

fun testContains() {
    val myBst = BinarySearchTree()
    myBst.insert(47)
    myBst.insert(21)
    myBst.insert(76)
    myBst.insert(18)
    myBst.insert(52)
    myBst.insert(82)

    println("contains 47 = ${myBst.contains(47)}")
    println("contains 18 = ${myBst.contains(18)}")
    println("contains 82 = ${myBst.contains(82)}")
    println("contains 27 = ${myBst.contains(27)}")

}

fun testRContains() {
    val myBst = BinarySearchTree()
    myBst.insert(47)
    myBst.insert(21)
    myBst.insert(76)
    myBst.insert(18)
    myBst.insert(52)
    myBst.insert(82)


    println("contains 47 = ${myBst.rContains(47)}")
    println("contains 18 = ${myBst.rContains(18)}")
    println("contains 82 = ${myBst.rContains(82)}")
    println("contains 27 = ${myBst.rContains(27)}")

}

private fun createSampleBST(): BinarySearchTree {
    val myBst = BinarySearchTree()
    myBst.insert(47)
    myBst.insert(21)
    myBst.insert(76)
    myBst.insert(18)
    myBst.insert(27)
    myBst.insert(52)
    myBst.insert(82)
    return myBst
}