//Given an integer array nums where the elements are sorted in ascending order, convert it to a
//height-balanced
//binary search tree.
//
//Example 1:
//Input: nums = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]
//Explanation: [0,-10,5,null,-3,null,9] is also accepted:
//
//Example 2:
//Input: nums = [1,3]
//Output: [3,1]
//Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
//
//Constraints:
//1 <= nums.length <= 104
//-104 <= nums[i] <= 104
//nums is sorted in a strictly increasing order.
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

package leetcode

//Не черта не понятно, что куда, зачем?
fun main(args: Array<String>) {
    val node = sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9))
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return buildTree(nums, 0, nums.size - 1)
}

fun buildTree(nums: IntArray, start: Int, end: Int): TreeNode? {

    if (start > end) return null
    val mid = (start + end) / 2
    val node = TreeNode(nums[mid])
    node.left = buildTree(nums, start, mid - 1)
    node.right = buildTree(nums, mid + 1, end)
    return node
}


//что да как: https://www.youtube.com/watch?v=12omz-VAyRk