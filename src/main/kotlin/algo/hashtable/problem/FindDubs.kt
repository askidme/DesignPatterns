package algo.hashtable.problem

fun main(){
    val array  = arrayOf(2, 1, 2, 3, 4, 3)
    val output = findDubs(array)
    output.forEach { println(it) }
}

fun findDubs(array: Array<Int>): Array<Int> {
    val result = mutableListOf<Int>()
    val map = mutableMapOf<Int, Int>()
    for(i in array.indices){
        map[array[i]] = map.getOrDefault(array[i],0) + 1
    }
    map.forEach { (t, u) ->
        run {
            if (u > 1) {
                result.add(t)
            }
        }
    }
    return result.toTypedArray()
}