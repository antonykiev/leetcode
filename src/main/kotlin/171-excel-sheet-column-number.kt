fun titleToNumber(columnTitle: String): Int {
    var result = 0.0
    columnTitle
        .forEachIndexed { index, char ->
            val degree = columnTitle.length - 1.0 - index
            result += (char.code - 64) * Math.pow(26.0, degree)
        }
    return result.toInt()
}

fun main() {
    val result = titleToNumber("ZY")
    println(result)
}