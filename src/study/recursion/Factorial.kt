package study.recursion

object Factorial {
    @JvmStatic
    fun main(args: Array<String>) {
        print(factorial(5))
    }

    private fun factorial(n: Int): Int {
        return if (n <= 1) { // Base case: if n is 0 or 1, the factorial is 1
            1
        } else { // Recursive case: n! = n * (n-1)!
            n * factorial(n - 1)
        }
    }
}