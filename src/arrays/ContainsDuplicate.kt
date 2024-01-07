package arrays

object ContainsDuplicate {
    @JvmStatic
    fun main(args: Array<String>) {
        print(containsDuplicate(intArrayOf(1,2,3,4,)))
    }

    private fun containsDuplicate(nums: IntArray): Boolean {
      val map = HashSet<Int>()
        for (number in nums) {
             if(map.contains(number)) {
                 return true
            } else {
                map.add(number)
            }
        }
        return false
    }
}