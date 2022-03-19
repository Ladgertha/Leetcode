package linear_search

/**
 * Time O(n) Space O(1)
 */

fun main() {
    println(maxProductDifference(intArrayOf(5,6,2,7,4))) //34
    println(maxProductDifference(intArrayOf(4,2,5,9,7,4,8))) // 64
    println(maxProductDifference(intArrayOf(1,6,7,5,2,4,10,6,4))) // 68
}

fun maxProductDifference(nums: IntArray): Int {
    var maxOne = nums.first()
    var maxTwo = nums.last()
    var minOne = nums.first()
    var minTwo = nums.last()

    for (index in 1 until nums.size) {
        val number = nums[index]
        when {
            number > maxOne -> {
                maxTwo = maxOne
                maxOne = number
            }
            number > maxTwo -> {
                maxTwo = number
            }
            minOne > number -> {
                minTwo = minOne
                minOne = number
            }
            minTwo > number -> {
                minTwo = number
            }
        }
    }
    return maxOne * maxTwo - minOne * minTwo
}