
fun strStr(haystack: String, needle: String): Int {
    if (haystack.length < needle.length) return -1
    if (haystack == needle) return 0
    if (needle.isEmpty()) return 0

    val n = haystack.length
    val m = needle.length

    for (i in 0 .. n - m) {
        for (j in 0 until m) {
            if (haystack[j + i] != needle[j]) break
            if (j == m - 1) return i
        }
    }
    return -1
}
fun main() {
    println(strStr("mississippi", "sipp"))
}