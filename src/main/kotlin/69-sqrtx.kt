fun mySqrt(x: Int): Int {
    if (x <= 1) return x
    val input = x.toLong()
    var attempt: Long = x.toLong() / 2

    while (true) {
        if (attempt * attempt == input)
            return attempt.toInt()
        if (attempt * attempt < input) {
            for (i in attempt..input) {
                if (i * i > x)
                    return (i - 1).toInt()
                if (i * i == input)
                    return i.toInt()
            }
        }
        attempt /= 2
    }
}

fun main() {
    println(mySqrt(2147302921))
}