package binary_search

/**
 * Time is O(log n). Space is O(1)
 */
fun main() {
    println("Answer is ${firstBadVersion(22)}")
}

fun firstBadVersion(n: Int): Int {
    if (n == 0 || n == 1) return n

    var start = 1
    var end = n
    var middle: Int

    while (start < end) {
        println("end is $end and start is $start")
        middle = start + (end - start) / 2
        println("middle is $middle")
        if (isBadVersion(middle)) {
            println("It is a bad version")
            end = middle
        } else {
            println("It is not a bad version")
            start = middle + 1
        }
    }
    return start
}

// Add this method for test
private fun isBadVersion(middle: Int): Boolean {
    // First bad version is 4
    return middle >= 4
}