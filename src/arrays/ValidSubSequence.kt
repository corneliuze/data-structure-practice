package arrays

object ValidSubSequence {

    @JvmStatic
    fun main(args: Array<String>) {
        print(isValidSubsequence(mutableListOf(5, 1, 22, 25, 6, -1, 8, 10), mutableListOf(1, 6, -1, 12)))
    }

    private fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
        var sequenceIndex = 0
        for(num in array) {
            if(sequence[sequenceIndex] == num) {
                if(sequenceIndex == sequence.lastIndex) return true
                sequenceIndex ++
            }
        }
        return false
    }
}