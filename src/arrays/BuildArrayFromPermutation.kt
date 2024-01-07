package arrays


object BuildArrayFromPermutation {
    @JvmStatic
    fun main(args: Array<String>) {
        buildArray(intArrayOf(0,2,1,5,3,4))
    }

    fun buildArray(nums: IntArray): IntArray {
        val res  = IntArray(nums.size)
        for(index in nums.indices) {
            res[index] = nums[nums[index]]
        }
       return res
    }

}