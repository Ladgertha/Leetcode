package linear_search

fun main() {
    println(finalValueAfterOperations(arrayOf("--X", "X++", "X++"))) // 1
    println(finalValueAfterOperations(arrayOf("++X", "++X", "X++"))) // 3
    println(finalValueAfterOperations(arrayOf("X++", "++X", "--X", "X--"))) // 0
}

fun finalValueAfterOperations(operations: Array<String>): Int {
    var result = 0
    for (operation in operations) {
        when (operation) {
            "--X", "X--" -> result--
            "++X", "X++" -> result++
        }
    }
    return result
}