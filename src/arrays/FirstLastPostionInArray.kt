package arrays

object FirstLastPostionInArray {
    @JvmStatic
    fun main(args: Array<String>) {
        print(
            searchRange(
                intArrayOf(5, 7, 7, 8, 8, 10), 7
            ).joinToString(separator = " ")
        )
    }

    private fun searchRange(nums: IntArray, target: Int): IntArray {
        var start = 0
        var end = nums.lastIndex
        var res = intArrayOf(-1, -1)
        for (index in nums.indices) {
        if(nums[index] == target) {
            res[0] = if (res[0] == -1) index else continue
        } else if(nums[end] == target) {
            res[1] = if (res[1] == -1) end else continue
        }
         if (index < end )  end -- else break
        }
        return res
    }
}