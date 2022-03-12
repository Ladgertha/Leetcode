package linear_search

fun main() {
    println(average(intArrayOf(4000, 3000, 1000, 2000))) //2500.00000
    println(average(intArrayOf(1000, 2000, 3000))) //2000.00000
}

fun average(salary: IntArray): Double {
    var sum = salary.first()
    var max = salary.first()
    var min = salary.first()
// From 1 because already added first number
    for (index in 1 until salary.size) {
        val number = salary[index]
        if (number < min) {
            min = number
        } else if (number > max) {
            max = number
        }
        sum += number
    }
    return (sum.toDouble() - min - max) / (salary.size - 2)
}

