fun longestCommonPrefix(strs: Array<String>): String {
    var firstWord = strs.first()
    strs.onEach { element ->
        firstWord = firstWord.commonPrefixWith(element)
        if (firstWord.isEmpty()) return firstWord
    }
    return firstWord
}

fun main() {
    println(longestCommonPrefix(arrayOf("flow", "flowe", "flowert")))
}