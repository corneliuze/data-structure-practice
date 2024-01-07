package study.recursion

object FibonacciNumber {
    @JvmStatic
    fun main(args: Array<String>) {
        print(fibonacciNumber(5))
    }

    private fun fibonacciNumber(n: Int): Int {
        return if (n <= 1) {
            return n
        } else {
            fibonacciNumber(n - 1) + fibonacciNumber(n - 2)
        }
    }
}