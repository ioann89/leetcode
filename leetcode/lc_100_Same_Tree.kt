//Given the roots of two binary trees p and q, write a function to check if they are the same or not.
//Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
//
//Example 1:
//Input: p = [1,2,3], q = [1,2,3]
//Output: true
//
//Example 2:
//Input: p = [1,2], q = [1,null,2]
//Output: false
//
//Example 3:
//Input: p = [1,2,1], q = [1,1,2]
//Output: false
//
//Constraints:
//The number of nodes in both trees is in the range [0, 100].
//-104 <= Node.val <= 104

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

var ti = TreeNode(5)
var v = ti.`val`

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

}

fun main(args: Array<String>) {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {

    return true
    }
}