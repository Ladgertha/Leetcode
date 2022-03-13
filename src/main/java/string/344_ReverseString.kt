package string

/**
 * Space O(1) and time O(n)
 */
fun main() {
    reverseString(charArrayOf('h', 'e', 'l', 'l', 'o'))
}

private fun reverseString(s: CharArray): Unit {
    var start = 0
    var end = s.size - 1

    while (start < end) {
        println("start is $start")
        println("end is $end")
        println(s[start])
        println(s[end])
        val temp = s[start]
        s[start++] = s[end]
        s[end--] = temp
    }
    println(s.contentToString())
}