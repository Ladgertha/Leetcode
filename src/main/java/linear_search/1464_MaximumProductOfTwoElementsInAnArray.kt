// Space O(1) Time O(n)

fun main() {
    println(maxProduct(intArrayOf(3, 4, 5, 2))) //12
    println(maxProduct(intArrayOf(1, 5, 4, 5))) //16
    println(maxProduct(intArrayOf(3, 7))) //12
}

fun maxProduct(nums: IntArray): Int {
    // Because 1 <= nums[i] <= 10^3
    var max = 0
    var secondMax = 0

    for (number in nums) {
        if (number > max) {
            secondMax = max
            max = number
        } else if (number > secondMax) {
            secondMax = number
        }
    }

    return (max - 1) * (secondMax - 1)
}