//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//
//Example 1:
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
//
//Example 2:
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
//
//Constraints:
//0 <= x <= 231 - 1


package leetcode

fun main(args: Array<String>) {
    var x = 2147395599
    fun mySqrt(x: Int): Int {
        if (x == 0) return 0

        var left: Long = 1
        var right = x
        var pivot: Long = 0

        while (right - left > 1) {
            pivot = (right + left) / 2
            if (pivot * pivot > x) right = pivot.toInt()
            else left = pivot
        }
        return left.toInt()
    }
    println(mySqrt(x))
}


//Полноценный разбор задачи: https://www.youtube.com/watch?v=giT4bzi-zwk