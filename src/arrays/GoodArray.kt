package arrays

object GoodArray {

    @JvmStatic
    fun main(args: Array<String>) {
    print(isGood(intArrayOf(1,1)))
    }

    private fun isGood(nums: IntArray): Boolean {
        if (nums.size < 2) return false
        nums.sort()
        var isGood = false
        for (index in nums.indices) {
            isGood = if (index <= nums.lastIndex - 1) {
                index + 1 == nums[index]
            } else {
                index  == nums.last()
            }
            if (!isGood) return false
        }
        return isGood
    }
}