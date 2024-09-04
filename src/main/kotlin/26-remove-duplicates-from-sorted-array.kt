import java.util.Arrays

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var counter = 1
    var previousElement = -101
    nums.onEachIndexed { index, it ->
        if (index == 0) {
            previousElement = it
            return@onEachIndexed
        }
        if (previousElement != it) {
            nums[counter] = it
            counter++
        }
        previousElement = it
    }
    return counter
}
fun main() {
    val nums = intArrayOf(0,0,0,1,1,1,2,2,3,3,4)
//    val nums = intArrayOf(1,1,2)
    println(removeDuplicates(nums))
    println(nums.contentToString())
}