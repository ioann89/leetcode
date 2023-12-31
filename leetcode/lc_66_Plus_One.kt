//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
//
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//
//Example 2:
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//
//Example 3:
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
//
//
//Constraints:
//1 <= digits.length <= 100
//0 <= digits[i] <= 9
//digits does not contain any leading 0's.

package leetcode

import java.math.BigInteger

fun main(args: Array<String>) {
    fun plusOne(digits: IntArray): IntArray {
        // Мы используем BigInteger для выполнения арифметических операций с более большими числами.
        // BigInteger может обрабатывать числа произвольного размера.
        // Мы используем метод add() для сложения числа BigInteger.ONE (1) с числом, полученным из digits.
        val number = BigInteger(digits.joinToString("")).add(BigInteger.ONE)

        // В этом коде мы сначала преобразуем число number в строку с помощью функции toString().
        // Затем мы вызываем функцию map() для преобразования каждого символа строки в отдельное значение типа Int
        // с помощью лямбда-выражения { it.toString().toInt() }.
        // Затем мы используем функцию toIntArray(), чтобы преобразовать список в массив.
        val res = number.toString().map { it.toString().toInt() }.toIntArray()
        return res
    }
}

//подсмотрено leetcode
//fun plusOne(digits: IntArray): IntArray {
//    for (i in digits.size - 1 downTo 0) {
//        digits[i] += 1
//        if (digits[i] <= 9) return digits
//        digits[i] = 0
//    }
//    val arr = IntArray(digits.size + 1)
//    arr[0] = 1
//
//    return arr
//}