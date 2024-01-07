package arrays

object SortedSquareArray {

    @JvmStatic
    fun main(args: Array<String>) {
        print(sortedSquaredArray(mutableListOf(-9, -2, 1,2,3,4,5,6)))
    }

    private fun sortedSquaredArray(array: List<Int>): List<Int> {
        var first = 0
        var last = array.lastIndex
        val result = array.map {0}.toMutableList()
        while(first < last) {
            if (array[first] * array[first] > array[last] * array[last]) {
                result[first] = array[last] * array[last]
                result[last] = array[first] * array[first]
            } else {
                result[first] = array[first] * array[first]
                result[last] = array[last] * array[last]
            }
            first++
            last--
        }
        return result
    }

    private fun swap() {

    }

}