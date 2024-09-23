

fun isPowerOfTwo(n: Int): Boolean {
    if (n == 1) return true
    if (n == 2) return true
    var i = n.toDouble()
    while (i > 2.0) {
        i /= 2.0
        if (i == 2.0) return true
        if (i < 2.0) return false
    }
    return false
}
fun main() {
    println(isPowerOfTwo(8))
}