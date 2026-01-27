package algo.bst

fun main(){
    testInsert()
//    testContains()
}

fun testConstructor(){
    val myBst = BinarySearchTree()
    println("root = ${myBst.root}")
}

fun testInsert(){
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
fun testContains(){
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