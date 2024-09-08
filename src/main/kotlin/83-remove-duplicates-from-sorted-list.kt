/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 *
 */
fun deleteDuplicates(head: ListNode?): ListNode? {
    head ?: return null
    var current: ListNode = head
    var next = current.next
    while (next != null) {
        if (current.element == next.element) {
            current.next = next.next
        } else {
            current = next
        }
        next = current.next
    }
    return head
}

fun main() {
    val result = deleteDuplicates(
        ListNode(0).apply {
            next = ListNode(0).apply {
                next = ListNode(1).apply {
                    next = ListNode(1).apply {
                        next = ListNode(2).apply {
                            next = ListNode(3).apply {
                                next = ListNode(3)
                            }
                        }
                    }
                }
            }
        }
    )
    println(result)
}