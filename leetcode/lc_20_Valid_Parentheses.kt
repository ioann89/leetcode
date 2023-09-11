//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//Example 1:
//Input: s = "()"
//Output: true
//
//Example 2:
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false
//
//
//Constraints:
//
//1 <= s.length <= 104
//s consists of parentheses only '()[]{}'.

package leetcode

fun main(args: Array<String>) {

    //val s = "()[]{}"
    val s = "(]"
    var flag = false
    fun isValid(s: String): Boolean {
        for (i in 0 until s.length step 2) {
            val char = s[i]
            val char2 = s[i + 1]
            if (char == '(' && char2 == ')') {
                flag = true
            } else if (char == '{' && char2 == '}') {
                flag = true
            } else if (char == '[' && char2 == ']') {
                flag = true
            } else {
                flag = false
            }
        }
        return flag
    }

    println(isValid(s))
}