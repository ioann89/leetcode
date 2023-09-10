//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//
//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//
//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//
//Constraints:
//
//1 <= strs.length <= 200
//0 <= strs[i].length <= 200
//strs[i] consists of only lowercase English letters.

package leetcode

fun main(args: Array<String>) {

    var strs = arrayOf("flower", "flow", "flight")

    fun longestCommonPrefix(strs: Array<String>): String {

        if (strs.count() == 0) return ""

        var prefix = strs[0]

        for (i in 0 until strs.size) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
            }
        }

        return prefix
    }

    println(longestCommonPrefix(strs))
}


//боже мой какая боль
//решение пришлось смотреть здесь https://www.youtube.com/watch?v=bl8ue-dTxgs