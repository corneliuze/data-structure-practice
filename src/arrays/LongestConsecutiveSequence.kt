package arrays

object LongestConsecutiveSequence {
//    https://leetcode.com/problems/longest-consecutive-sequence/

    fun longestConsecutive(nums: IntArray): Int {
        var numSet = mutableSetOf<Int>()
        nums.forEach {
            numSet.add(it)
        }

        for (number in nums){
            val forwardNumber = number + 1
            val backwardNumber = number - 1
            if (!numSet.contains(forwardNumber) && !numSet.contains(backwardNumber)) {
                numSet.remove(number)
            }
        }

        return numSet.size
    }
}