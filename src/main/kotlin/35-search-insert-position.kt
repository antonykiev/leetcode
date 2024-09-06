fun searchInsert(nums: IntArray, target: Int): Int {
    for (i in 0 until nums.size) {
        if (target > nums[i]) continue
        if (target == nums[i]) return i
        if (target < nums[i]) return i
    }
    return nums.size
}

fun main() {
    println(searchInsert(intArrayOf(1, 3, 5, 6), 3))
}