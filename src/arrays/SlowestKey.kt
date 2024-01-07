package arrays

object SlowestKey {
    @JvmStatic
    fun main(args: Array<String>) {
        print(slowestKey(intArrayOf(23,34,43,59,62,80,83,92,97), "qgkzzihfc"))
    }

    fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
        val releaseTimeDifference = IntArray(releaseTimes.size)
        for (i in releaseTimes.indices) {
            releaseTimeDifference[i] = if (i == 0) releaseTimes[i] - 0 else releaseTimes[i] - releaseTimes[i - 1]
        }

        var max = 0
        var maxIndex = 0
        for ((index, releaseTime) in releaseTimeDifference.withIndex()) {
            if (releaseTime > max) {
                max = releaseTime
                maxIndex = index
            }
            if (releaseTime == max) {
                max = if (keysPressed[maxIndex].toInt() > keysPressed[index].toInt()) max else releaseTime
                maxIndex = if (keysPressed[maxIndex].toInt() > keysPressed[index].toInt()) maxIndex else index
            }
        }

        return keysPressed[maxIndex]
    }
}