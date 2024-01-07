package arrays

object TwoSum {
    @JvmStatic
    fun main(args: Array<String>) {
        print(twoNumberSum(mutableListOf(3, 5, -4, 8, 11 , 1, -1, 6), 1))
    }

    private fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
        val set = HashSet<Int>()
        for(num in array) {
            val diff = targetSum - num
            if(set.contains(diff)) {
                return listOf(num, diff)
            } else {
                set.add(num)
            }
        }
        return emptyList()
    }
}