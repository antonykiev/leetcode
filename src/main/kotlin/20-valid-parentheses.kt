import java.util.Stack

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.onEach {
        when (it) {
            '(',
            '{',
            '[' -> stack.push(it)
        }
        if (stack.isEmpty()) return false
        when (it) {
            ')' -> if (stack.pop() != '(') return false
            '}' -> if (stack.pop() != '{') return false
            ']' -> if (stack.pop() != '[') return false
        }
    }
    return stack.isEmpty()
}
fun main() {
    println(isValid("()"))
    println(isValid("()[]{}"))
    println(isValid("(]"))
    println(isValid("([])"))
}