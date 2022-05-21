package fibonacci

fun main() {
    println(fib(2)) //1
    println(fib(3)) //2
    println(fib(4)) //3
    println(fib(5)) //5
    println(fib(6)) //8
    println(fib(7)) //13

    println(fibWithArray(2)) //1
    println(fibWithArray(3)) //2
    println(fibWithArray(4)) //3
    println(fibWithArray(5)) //5
    println(fibWithArray(6)) //8
    println(fibWithArray(7)) //13
}

// First solution: Space O(1) + Time O(n)
fun fib(n: Int): Int {
    if (n < 2) return n
    var a = 0
    var b = 1
    for (i in 2 until n) {
        val temp = a
        a = b
        b += temp
    }
    return a + b
}

//Solution with array: Space O(n) + Time O(n)
fun fibWithArray(n: Int): Int {
    if (n < 2) return n
    val arr = IntArray(n)
    arr[0] = 0
    arr[1] = 1
    for (i in 2 until n) {
        arr[i] = arr[i - 1] + arr[i - 2]
    }
    return arr[n - 2] + arr[n - 1]
}