fun addDigits(num: Int): Int {
    if (num in 1..9) return num
    return (num - 1) % 9 + 1
}

fun main() {
    println(addDigits(22))
}