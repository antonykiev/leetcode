fun plusOne(digits: IntArray): IntArray {
    if (digits.size == 1 && digits[0] == 9) return intArrayOf(1, 0)
    if (digits.size == 1) return intArrayOf(digits[0] + 1)

    for (i in digits.size - 1 downTo 0) {
        if (digits[i] != 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }
    return intArrayOf(1) + digits
}

fun main() {
    println(plusOne(intArrayOf(9)).asList())
}