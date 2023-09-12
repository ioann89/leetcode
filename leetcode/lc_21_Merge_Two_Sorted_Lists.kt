//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//Return the head of the merged linked list.
//
//Example 1:
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//
//Example 2:
//Input: list1 = [], list2 = []
//Output: []
//
//Example 3:
//Input: list1 = [], list2 = [0]
//Output: [0]
//
//Constraints:
//
//The number of nodes in both lists is in the range [0, 50].
//-100 <= Node.val <= 100
//Both list1 and list2 are sorted in non-decreasing order.


package leetcode

fun main(args: Array<String>) {
    var list1 = ListNode(1, 2, 4)
    var list2 = ListNode(1, 3, 4)

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode.ListNode? {

        var temp_node = ListNode(0)
        var current_node = temp_node
        var list1 = list1
        var list2 = list2

        while (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                current_node.next = list1
                list1 = list1.next
            } else {
                current_node.next = list2
                list2 = list2.next
            }
            current_node = current_node.next!!
        }

        if (list1 != null) {
            current_node.next = list1
        }
        if (list2 != null) {
            current_node.next = list2

        }
        return temp_node.next

    }
}

//объяснение здесь: https://www.youtube.com/watch?v=KVf1Uuqfv8E
//код работает, но не в ide)))


//Угнано с leetcode:
//class Solution {
//    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
//        if (list1 == null) return list2
//        if (list2 == null) return list1
//
//        return if (list1.`val` <= list2.`val`) {
//            list1.next = mergeTwoLists(list1.next, list2)
//            list1
//        } else {
//            list2.next = mergeTwoLists(list1, list2.next)
//            list2
//        }
//    }
//}