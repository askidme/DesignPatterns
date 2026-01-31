package algo.graph

fun main(){
    testRemoveVertex()
}

fun testAddVertex(){
    val myGraph = Graph()
    myGraph.addVertex("A")
    myGraph.printGraph()
}

fun testAddEdge(){
    val myGraph = Graph()
    myGraph.addVertex("A")
    myGraph.addVertex("B")
    myGraph.addEdge("A", "B")
    myGraph.addEdge("A", "B")
    myGraph.printGraph()
}

fun testRemoveEdge(){
    val myGraph = Graph()
    myGraph.addVertex("A")
    myGraph.addVertex("B")
    myGraph.addVertex("C")
    myGraph.addEdge("A", "B")
    myGraph.addEdge("A", "C")
    myGraph.addEdge("B", "C")
    myGraph.printGraph()
    myGraph.removeEdge("A", "B")
    myGraph.printGraph()
}

fun testRemoveVertex(){
    val myGraph = Graph()
    myGraph.addVertex("A")
    myGraph.addVertex("B")
    myGraph.addVertex("C")
    myGraph.addVertex("D")
    myGraph.addEdge("A", "B")
    myGraph.addEdge("A", "C")
    myGraph.addEdge("A", "D")
    myGraph.addEdge("B", "D")
    myGraph.addEdge("C", "D")
    myGraph.printGraph()
    myGraph.removeVertex("D")
    myGraph.printGraph()
}