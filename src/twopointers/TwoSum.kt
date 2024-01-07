package twopointers

object TwoSum {

//    target is 16
    // [1,2,4,5,7,8,8,9,11]
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var pointerA = 0
        var pointerB = numbers.lastIndex

        while(pointerA < pointerB) {
            var sum = numbers[pointerA] + numbers[pointerB]
            if (sum > target) {
                pointerB--
            } else if (sum < target) {
                pointerA++
            } else {
                break
            }
        }
        return intArrayOf(pointerA, pointerB)
    }
}