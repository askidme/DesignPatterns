package algo.hashtable


fun main() {
//    testConstructor()
    testSet()
//    testGet()
//    testKeys()
}
fun testKeys(){
    val myHt = HashTable()
    myHt.set("bolts", 200)
    myHt.set("screws", 140)
    myHt.set("paint", 140)
    myHt.set("nails", 100)
    myHt.set("tile", 50)
    myHt.set("lumber", 80)

    val keys = myHt.keys()
    println(keys)
}
fun testGet() {
    val myHt = HashTable()
    myHt.set("nails", 100)
    myHt.set("tile", 50)
    myHt.set("lumber", 80)
    println(myHt.get("lumber"))
    println(myHt.get("bolts"))

}

fun testSet() {
    val myHt = HashTable()
    myHt.set("nails", 100)
    myHt.set("nails", 110)
    myHt.set("tile", 50)
    myHt.set("lumber", 80)

    myHt.set("bolts", 200)
    myHt.set("screws", 140)

    myHt.printTable()
}


fun testConstructor() {
    val myHt = HashTable()
    myHt.printTable()
}

