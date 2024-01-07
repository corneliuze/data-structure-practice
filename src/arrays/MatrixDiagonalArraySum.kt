package arrays

object MatrixDiagonalArraySum {

    @JvmStatic
    fun main(args: Array<String>) {
        print(diagonalSum(arrayOf(intArrayOf(1,1,1,1), intArrayOf(1,1,1,1), intArrayOf(1,1,1,1))))
    }

    fun diagonalSum(mat: Array<IntArray>): Int {
        var res = 0
        for (arrIndex in mat.indices) {
            for (index in mat[arrIndex].indices) {
                res += if (arrIndex == index || (arrIndex + index) == mat.lastIndex) mat[arrIndex][index] else 0
            }
        }
        return res
    }
}