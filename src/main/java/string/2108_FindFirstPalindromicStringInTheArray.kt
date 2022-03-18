package string

fun main() {
    println(firstPalindrome(arrayOf("abc", "car", "ada", "racecar", "cool"))) //ada
    println(firstPalindrome(arrayOf("notapalindrome", "racecar"))) //racecar
    println(firstPalindrome(arrayOf("def", "ghi"))) //
    println(firstPalindrome(arrayOf("cqllrtyhw", "swwisru", "gpzmbders", "wqibjuqvs", "pp", "usewxryy", "ybqfuh", "hqwwqftgyu", "jggmatpk"))) //pp
}

fun firstPalindrome(words: Array<String>): String {
    for (word in words) {
        var start = 0
        var end = word.length - 1
        if (word.length == 1) return word
        while (start < end) {
            if (word[start] != word[end]) {
                break
            } else {
                start++
                end--
            }
            if (start >= end) return word
        }
    }
    return ""
}