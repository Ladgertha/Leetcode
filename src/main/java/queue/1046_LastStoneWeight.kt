import java.util.*

fun main() {
    println(lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1))) //1
    println(lastStoneWeight(intArrayOf(1))) //1
}

fun lastStoneWeight(stones: IntArray): Int {
    val queue = PriorityQueue<Int>(Collections.reverseOrder())
    for (stone in stones) {
        queue.offer(stone)
    }

    while (queue.isNotEmpty() && queue.size != 1) {
        val x = queue.poll()
        val y = queue.poll()
        println("x is $x and y is $y")
        if (x != y) {
            queue.offer(x - y)
        }
    }
    return if (queue.isEmpty()) 0 else queue.poll()
}