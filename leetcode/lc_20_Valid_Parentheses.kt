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
    //val s = "(]"
    val s = "{[]}"
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
//моё решение, не решает всех проблем


//подсмотрено в leetcod
//Следующий алгоритм не очень быстрый и требует мало памяти, но я думаю, что этот нестандартный подход кажется интересным.

class Solution {
    fun isValid(s: String): Boolean {
        if (s == "") { return true }
        val simplified = s.replace("()", "").replace("{}", "").replace("[]", "")
        if (simplified == s) { return false }
        return isValid(simplified)
    }
}
//Объяснение:
//
//Базовый случай рекурсии довольно прост.
//if (s == "") { return true }
//Если у нас есть пустая строка , она, очевидно, удовлетворяет условию.
//
//В составной допустимой строке все допустимые скобки также содержат другие допустимые скобки. А также одиночные действительные скобки могут встречаться слева или справа от основных скобок. Например:"({[]})()[]"
//
//На следующей строке мы удаляем все внутренние действительные скобки, внутри которых нет других скобок. А также избавляемся от одиночных допустимых скобок.
//val simplified = s.replace("()", "").replace("{}", "").replace("[]", "")
//После этой строки наш вышеупомянутый пример будет таким: "({[]})()[]"-> "({})". Гораздо проще решить эту проблему сейчас, не так ли?
//
//Очевидно, что мы не можем упрощать нашу строку все больше и больше, потому что в какой-то момент мы можем прийти к случаю, когда строку больше нельзя упростить (конечно, в случае, если это недопустимая строка)
//
//И эта строка позволяет нам проверить, совпадает ли упрощенная строка с оригиналом. Если они одинаковы, это означает, что базовая строка недействительна и мы больше не можем ее упрощать. В этом случае функция возвращает false.
//if (simplified == s) { return false }
//И делаем цикл до тех пор, пока он не даст нам результат
//
//return isValid(simplified)