/**
 * O(n) space and O(n) time
 */

fun main() {
    println(canBeTypedWords("hello world", "ad"))//1
    println(canBeTypedWords("leet code", "lt"))//1
    println(canBeTypedWords("leet code", "e"))//0
    println(canBeTypedWords("Anya likes cats", "y"))//2
}

fun canBeTypedWords(text: String, brokenLetters: String): Int {
    val letters = mutableSetOf<Char>()

    for (letter in brokenLetters) {
        letters.add(letter)
    }

    // I wanted to do without split
    var newWord = false
    var words = 0
    for (index in text.indices) {
        val letter = text[index]

        when {
            index == text.length - 1 && !letters.contains(letter) && !newWord -> {
                words++
            }
            letter == ' ' -> {
                if (newWord) {
                    newWord = false
                } else {
                    words++
                }
            }
            letters.contains(letter) -> {
                newWord = true
            }
        }
    }
    return words
}