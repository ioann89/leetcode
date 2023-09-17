//Given two binary strings a and b, return their sum as a binary string.
//
//Example 1:
//Input: a = "11", b = "1"
//Output: "100"
//
//Example 2:
//Input: a = "1010", b = "1011"
//Output: "10101"
//
//Constraints:
//1 <= a.length, b.length <= 104
//a and b consist only of '0' or '1' characters.
//Each string does not contain leading zeros except for the zero itself.

package leetcode

import java.math.BigInteger

fun main(args: Array<String>) {
    val a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
    val b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
    //11101110000
    fun addBinary(a: String, b: String): String {
        var num: BigInteger = BigInteger(a) + BigInteger(b)
        var res = ""

        if (num == BigInteger.ZERO) {
            return "0"
        }

        while (num != BigInteger.ZERO) {
            val digit = num % BigInteger.TEN
            if (digit == BigInteger.valueOf(2)) {
                res += '0'
                num = num.divide(BigInteger.TEN).add(BigInteger.ONE)
                continue
            }
            if (digit == BigInteger.valueOf(3)) {
                res += '1'
                num = num.divide(BigInteger.TEN).add(BigInteger.ONE)
                continue
            }
            res += digit.toString()
            num /= BigInteger.TEN
        }
        return res.reversed()
    }
    println(addBinary(a, b))
}

//для цифр по меньше
//
//if (num == 0.toLong()) {
//    return "0"
//}
//
//while (num != 0.toLong()) {
//    if (num % 10 == 2.toLong()) {
//        res += '0'
//        num = (num / 10) + 1
//        continue
//    }
//    if (num % 10 == 3.toLong()) {
//        res += '1'
//        num = (num / 10) + 1
//        continue
//    }
//    res += (num % 10).toString()
//    num /= 10
//}
//return res.reversed()

// смотреть сюда! -> https://www.youtube.com/watch?v=OEW50g03mT0
//
//fun addBinary(a: String, b: String): String {
//    val res = StringBuilder()
//    var i: Int = a.length - 1
//    var j: Int = b.length - 1
//    var carry = 0
//    while (i >= 0 || j >= 0) {
//        var sum = carry
//        if (i >= 0) sum += a[i] - '0'
//        if (j >= 0) sum += b[j] - '0'
//        carry = if (sum > 1) 1 else 0
//        res.append(sum % 2)
//        i--
//        j--
//    }
//    if (carry != 0) res.append(carry)
//    return res.reverse().toString()
//}