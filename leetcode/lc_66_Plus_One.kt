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

fun main(args: Array<String>) {
    fun plusOne(digits: IntArray): IntArray {
        //В этом коде мы создаем массив чисел array с помощью arrayOf().
        // Затем мы используем функцию joinToString(""),
        // чтобы объединить все элементы массива в одну строку без разделителей.
        // Затем мы вызываем функцию toInt() для преобразования строки в целое число.

        //Теперь переменная number будет содержать целое число,
        // которое получено из массива чисел. Обратите внимание,
        // что если в массиве есть символы, отличные от цифр,
        // то преобразование в целое число может вызвать исключение.
        val number = digits.joinToString("").toInt() + 1

        //В этом коде мы сначала преобразуем число number в строку с помощью функции toString().
        // Затем мы вызываем функцию map() для преобразования каждого символа строки в отдельное значение типа Int
        // с помощью лямбда-выражения { it.toString().toInt() }.
        // Затем мы используем функцию toIntArray(), чтобы преобразовать список в массив.
        val res = number.toString().map { it.toString().toInt() }.toIntArray()
        return res
    }
}