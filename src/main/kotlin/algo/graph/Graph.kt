package algo.graph

class Graph(private val adjList: MutableMap<String, MutableSet<String>> = mutableMapOf()) {

    fun printGraph() = println(adjList)

    fun addVertex(vertex: String): Boolean {
        adjList[vertex].let {
            adjList[vertex] = mutableSetOf()
            return true
        }
        return false
    }

    fun addEdge(vertex1: String, vertex2: String): Boolean {
        if (adjList[vertex1] == null || adjList[vertex2] == null) return false
        adjList[vertex1]!!.add(vertex2)
        adjList[vertex2]!!.add(vertex1)
        return true
    }

    fun removeEdge(vertex1: String, vertex2: String): Boolean {
        if (adjList[vertex1] == null || adjList[vertex2] == null) return false
        adjList[vertex1]!!.remove(vertex2)
        adjList[vertex2]!!.remove(vertex1)
        return true
    }

    fun removeVertex(vertex: String): Boolean {
        adjList[vertex]?.forEach { adjList[it]!!.remove(vertex) }.also { adjList.remove(vertex) } ?: return false
        return true
    }
}