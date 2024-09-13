fun isAnagram(s: String, t: String): Boolean {
//    val sortS = s.map { it.code }.sorted()
//    val sortT = t.map { it.code }.sorted()
//    return sortS == sortT
    val arr = IntArray(26)
    s.forEach { i ->
        arr[i-'a']++
    }
    t.forEach { i ->
        arr[i-'a']--
    }
    return !arr.any { it != 0 }
}
fun main() {
    println(isAnagram("cat", "tac"))
    println(isAnagram("ret", "toy"))
    println(isAnagram("", "tac"))
    println(isAnagram("cat", "    "))
}