package arrays

object PlusOne {

    @JvmStatic
    fun main(args: Array<String>) {
        print(plusOne(intArrayOf(9)).joinToString(separator = " "))
    }

    private fun plusOne(digits: IntArray): IntArray {
        var resultArray = digits
        var reminder = 1
        for (index in resultArray.lastIndex downTo 0) {
            val sum = resultArray[index] + reminder
            if (sum <= 9) {
                resultArray[index] = sum
                break
            } else {
                val sumAsArray = sum.toString().map { it.toString().toInt() }.toIntArray()
                digits[index] = sumAsArray[1]
                reminder = sumAsArray[0]
            }
            if(index == 0 && reminder > 0) {
                resultArray = intArrayOf(reminder) + resultArray
            }
        }
        return resultArray
    }

}