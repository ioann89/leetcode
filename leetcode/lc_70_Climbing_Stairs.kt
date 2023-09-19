//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//Example 1:
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//
//Example 2:
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
//
//Constraints:
//1 <= n <= 45

package leetcode

fun main(args: Array<String>) {
    val n = 45

    fun climbStairs(n: Int): Int {
        if (n == 1) return 1

        var dp = IntArray(n + 1)
        dp[1] = 1
        dp[2] = 2

        for (i in 3..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }
        return dp[n]
    }
    println(climbStairs(n))
}


//Полноценный разбор задачи: https://www.youtube.com/watch?v=2WKsL1TW5eg
//Но это видео лучше: https://www.youtube.com/watch?v=UUaMrNOvSqg