//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//
//Example 2:
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
//
//
//Constraints:
//1 <= haystack.length, needle.length <= 104
//haystack and needle consist of only lowercase English characters.

package leetcode

fun main(args: Array<String>) {
    fun strStr(haystack: String, needle: String): Int {
        return haystack.indexOf(needle)
    }
}


//ну или так
//
//fun strStr(haystack: String, needle: String): Int {
//
//    var hL = haystack.length
//    var nL = needle.length-1
//
//    for(i in 0 until hL-nL) {
//        val subString = haystack.substring(i .. i+nL)
//        if(subString == needle) return i
//    }
//    return -1
//}