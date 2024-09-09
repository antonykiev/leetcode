fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var i = m - 1
    var j = nums1.size - 1
    var p = n - 1
    while (p >= 0) {
        if (i >= 0 && nums1[i] > nums2[p]) {
            nums1[j--] = nums1[i--]
        } else {
            nums1[j--] = nums2[p--]
        }
    }
}

fun main() {
    val r = intArrayOf(1, 2, 3, 0, 0, 0)
    merge(r, 3, intArrayOf(2, 2, 2), 3)
    println(r.toList())
}
