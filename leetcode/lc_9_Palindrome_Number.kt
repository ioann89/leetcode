//Given an integer x, return true if x is a palindrome, and false otherwise.
//
//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//
//Example 2:
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//
//Example 3:
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//Constraints:
//-231 <= x <= 231 - 1
//
//Follow up: Could you solve it without converting the integer to a string?

package leetcode


//fun main(args: Array<String>) {
//    var x = 121
//    var z = -121
//    fun isPalindrome(x: Int): Boolean {
//        if (x < 0) {
//            return false
//        } else if (x == 0) {
//            return true
//        }
//
//        var y = x.toString().reversed().toInt()
//
//        if (y == x) {
//            return true
//        } else {
//            return false
//        }
//    }
//    println(isPalindrome(z))
//}

//The second option is not turning a number into a string
fun main(args: Array<String>) {
    var x = 121
    var z = -121
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        } else if (x == 0) {
            return true
        }

        var num = 0
        var y = x
        while (y > 0) {
            num = num * 10 + y % 10
            y /= 10
        }

        if (x == num) {
            return true
        } else {
            return false
        }
    }
    println(isPalindrome(x))
}

