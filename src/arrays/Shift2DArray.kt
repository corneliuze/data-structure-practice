package arrays

import java.util.Collections

object Shift2DArray {
    @JvmStatic
    fun main(args: Array<String>) {
        print(shiftGrids(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)), 4))
    }

    private fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
        val flattenedList = arrayListOf<Int>()
        grid.forEach { array ->
            array.forEach {
                flattenedList.add(it)
            }
        }
        Collections.rotate(flattenedList, k)
        return flattenedList.chunked(grid.first().size)
    }


    private fun shiftGrids(grid: Array<IntArray>, k: Int): List<List<Int>> {
        val numRows = grid.size
        val numColumns = grid.first().size

        val gridSize = numRows * numColumns
        val realK = k % gridSize
        val answer = Array(numRows) {
            IntArray(numColumns) { 0 }
        }

        for (i in 0 until gridSize) {
            val currentRow = i / numColumns
            val currentColumn = i % numColumns

            println("current row $currentRow & current column $currentColumn")

            val newRow = ((i+realK) % gridSize) / numColumns
            val newColumn = ((i+realK) % gridSize) % numColumns
            println("i+ real k ${((i+realK) % gridSize)}")
            println("new current row $newRow & new current column $newColumn")


            answer[newRow][newColumn] = grid[currentRow][currentColumn]
        }

        return answer.toList().map(IntArray::toList)
    }
}