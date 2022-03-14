/**
 * Time O(M * N), Space O(1)
 */
fun main() {
    println(maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)))) // 6
    println(maximumWealth(arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5)))) // 10
    println(
        maximumWealth(
            arrayOf(
                intArrayOf(2, 8, 7),
                intArrayOf(7, 1, 3),
                intArrayOf(1, 9, 5)
            )
        )
    ) // 17
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    for (account in accounts) {
        var arraySum = 0
        for (customer in account) {
            arraySum += customer
        }
        if (max < arraySum) max = arraySum
    }
    return max
}