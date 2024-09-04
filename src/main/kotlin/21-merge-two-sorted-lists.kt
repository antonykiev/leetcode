fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val result = ListNode(0)
    var current = result

    var node1 = list1
    var node2 = list2
    while (node1 != null || node2 != null) {
        if (node1 == null) {
            current.next = node2
            break
        }
        if (node2 == null) {
            current.next = node1
            break
        }

        if (node1.element < node2.element) {
            current.next = node1
            node1 = node1.next
        } else {
            current.next = node2
            node2 = node2.next
        }
        current = current.next!!
    }
    return result.next
}

data class ListNode(var element: Int) {
    var next: ListNode? = null
}

fun main() {
    var result = mergeTwoLists(ListNode(1), ListNode(1))
    while (result?.next != null) {
        println(result)
        result = result.next
    }
    println(result)

}