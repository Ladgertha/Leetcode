package linked_list

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 * Time O(n) Space O(1)
 */

fun deleteDuplicates(head: ListNode?): ListNode? {
    var current = head
    while (current?.next != null) {
        if (current.next?.value == current.value) {
            current.next = current.next?.next
        } else {
            current = current.next
        }
    }
    return head
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}