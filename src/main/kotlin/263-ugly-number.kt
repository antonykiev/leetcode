fun isUgly(n: Int): Boolean {
    if (n < 1) return false
    if (n == 1) return true
    var num = n
    arrayOf(2, 3, 5).forEach {
        while (num % it == 0) {
            num /= it
        }
    }
    return num == 1
}

fun main() {
    val result = isUgly(22)
    println(result)
}