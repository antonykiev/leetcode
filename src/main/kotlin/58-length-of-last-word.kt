fun lengthOfLastWord(s: String): Int {
    var result = 0
    s.forEachIndexed { index, c ->
        if (s[index].isWhitespace()) return@forEachIndexed
        if (index - 1 > 0 && s[index - 1].isWhitespace()) result = 0
        result++
    }
    return result
}
fun main() {
    println(lengthOfLastWord("luffy is still joyboy"))
}