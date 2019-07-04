package graphs.weighted

import utils.Timer

fun main() {
    val graph = UndirectedWeightGraph<Char>(10, 10_000).apply {
        addVertex('A')
        addVertex('B')
        addVertex('C')
        addVertex('D')
        addVertex('E')
        addVertex('F')
        addVertex('J')

        addEdge('A', 'B', 2)
        addEdge('A', 'C', 8)
        addEdge('B', 'D', 5)
        addEdge('C', 'E', 9)
        addEdge('C', 'E', 9)
        addEdge('B', 'J', 10_001)
        addEdge('D', 'J', 4)
        addEdge('C', 'J', 1)
        addEdge('E', 'J', 7)
        addEdge('D', 'E', 1)
        addEdge('D', 'F', 5)
        addEdge('C', 'F', 6)
    }

    val timer = Timer().apply { start() }
    graph.mstw {from, to, weight ->
        println("$from-($weight)-$to")
    }
    println(timer.stopAndShowTime())
}