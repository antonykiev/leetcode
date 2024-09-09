fun majorityElement(nums: IntArray): Int {
    var counter = 0
    var result = Int.MIN_VALUE
    nums.forEach {
        if (counter == 0) {
            result = it
            counter++
        } else if (result == it) {
            counter++
        } else {
            counter--
        }
    }
    return result
}

fun main() {
    println(majorityElement(intArrayOf(3, 3, 3, 1, 1, 3, 3)))
}