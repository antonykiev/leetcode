/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.



Constraints:

-231 <= x <= 231 - 1
*/

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    if (x < 10) return true
    var rev = 0
    var localX = x
    while (localX > 0) {
        rev *= 10
        rev += localX % 10
        localX /= 10
    }
    return rev == x
}

fun main() {
    println("isPalindrome ${isPalindrome(112)}")
}
