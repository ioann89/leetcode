//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
//
//Example 1:
//Input: root = [1,2,2,3,4,4,3]
//Output: true
//
//Example 2:
//Input: root = [1,2,2,null,3,null,3]
//Output: false
//
//Constraints:
//The number of nodes in the tree is in the range [1, 1000].
//-100 <= Node.val <= 100
//
//Follow up: Could you solve it both recursively and iteratively?


package leetcode


fun main(args: Array<String>) {
    var ti = TreeNode(5)
    var v = ti.`val`

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    val root = arrayOf(1, 2, 2, 3, 4, 4, 3)

    fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
        if (t1 == null || t2 == null) return t1 == t2
        if (t1.`val` != t2.`val`) return false

        return isMirror(t1.left, t2.right)
                && isMirror(t1.right, t2.left)
    }

    fun isSymmetric(root: TreeNode?): Boolean {
        return root == null || isMirror(root, root)
    }
}


//смотреть, что да как, тут: https://www.youtube.com/watch?v=-5E5Jt_HKLc //немного пришлось подправить