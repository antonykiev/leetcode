fun summaryRanges(nums: IntArray): List<String> {
    if (nums.size < 2) return nums.map { it.toString() }

    val result = mutableListOf<String>()
    var start = 0

    for (i in 0..nums.size - 1) {
        if (i == 0) {
            start = nums[i]
            continue
        }
        if (nums[i] - nums[i - 1] == 1) {
            if (i == nums.size - 1) {
                result.add(stringRange(start, nums[i]))
            }
            continue
        } else {
            result.add(stringRange(start, nums[i - 1]))
            if (i == nums.size - 1) {
                result.add("${nums[i]}")
            }
            start = nums[i]
            continue
        }
    }
    return result
}

fun stringRange(start: Int, end: Int) : String {
    return if (start == end) "$start"
    else "$start->$end"
}

fun main() {
    println(summaryRanges(intArrayOf(0,2,4,5,7)))
}