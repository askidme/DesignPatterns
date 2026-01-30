package algo.hashtable.problem

import algo.hashtable.HashTable

fun main() {
    var arr1 = arrayOf(1, 3, 5)

    var arr2 = arrayOf(2, 4, 6, 1)
    println(itemInCommon2(arr1, arr2))
}

fun itemInCommon(arr1: Array<Int>, arr2: Array<Int>): Boolean {
    for (a in arr1) {
        for (b in arr2) {
            if (a == b) return true
        }
    }
    return false
}
fun itemInCommon2(arr1: Array<Int>, arr2: Array<Int>): Boolean {
    var map = HashMap<Int, Boolean>()
    for (a in arr1) {
        map[a] = true
    }
    for (b in arr2) {
        if(map[b] != null) return true
    }
    return false
}