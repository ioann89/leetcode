//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//
//Example 1:
//Input: head = [1,1,2]
//Output: [1,2]
//
//Example 2:
//Input: head = [1,1,2,3,3]
//Output: [1,2,3]
//
//Constraints:
//The number of nodes in the list is in the range [0, 300].
//-100 <= Node.val <= 100
//The list is guaranteed to be sorted in ascending order.

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

package leetcode

//fun main(args: Array<String>) {
//    fun deleteDuplicates(head: ListNode?): ListNode? {
//        var current_node = head
//        while (current_node != null && current_node?.next != null){
//            if (current_node.`val` == current_node?.next?.`val`){
//                current_node.next = current_node.next.next
//            }else{
//                current_node = current_node.next
//            }
//        }
//        return head
//    }
//}

//Смотрим тут: https://www.youtube.com/watch?v=wIB5sg_Ulx4


