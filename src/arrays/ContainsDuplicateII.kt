package arrays

object ContainsDuplicateII {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val numsMap = mutableMapOf<Int, Int>()

        for ((index, element) in nums.withIndex()) {
            if (numsMap.containsKey(element)) {
                val diff = index - numsMap[element]!!
                if (diff <= k) return true
            }
            numsMap.put(element, index)
        }
        return false
    }
}