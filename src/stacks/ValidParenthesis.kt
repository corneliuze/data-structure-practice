package stacks

import java.util.Stack

object ValidParenthesis {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val charArray = s.toCharArray()
        for (char in charArray) {
            when (char) {
                '(', '[', '{' -> {
                    stack.push(char)
                }
                ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') return false
                }
                ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') return false
                }
                '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') return false
                }
            }
        }

        return stack.isEmpty()
    }
}