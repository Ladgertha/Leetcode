package graph

fun main() {
    println(findCenter(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(4, 2)))) // 2
    println(
        findCenter(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(5, 1),
                intArrayOf(1, 3),
                intArrayOf(1, 4)
            )
        )
    ) // 1
}

fun findCenter(edges: Array<IntArray>): Int {
    val firstEdge = edges.first()
    val lastEdge = edges.last()
    for (number in firstEdge) {
        for (edge in lastEdge) {
            if (number == edge) return number
        }
    }
    return -1
}