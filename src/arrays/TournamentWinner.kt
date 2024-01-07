package arrays

object TournamentWinner {

    @JvmStatic
    fun main(args: Array<String>) {
        print(
            tournamentWinner(
                mutableListOf(
                    listOf("Go", "Python"),
                    listOf("Python", "Kotlin"),
                    listOf("Kotlin", "Go")
                ), mutableListOf(0, 0, 1)
            )
        )
    }

   private fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
        val maps = HashMap<String, Int>()
        var winner = ""
       var maxPoint = 0
        for (gameIndex in competitions.indices) {
            val homeIndex = competitions[gameIndex][0];
            val awayIndex = competitions[gameIndex][1]
            if (results[gameIndex] == 1) {
                maps[homeIndex] = (maps[homeIndex] ?: 0) + 3
                 if ((maps[homeIndex] ?: 0) > maxPoint) {
                     winner = homeIndex
                    maxPoint = maps[homeIndex] ?: 0
                }
            } else {
                maps[awayIndex] = (maps[awayIndex]?: 0) + 3
                if ((maps[awayIndex] ?: 0) > maxPoint) {
                    winner = awayIndex
                    maxPoint = maps[awayIndex] ?: 0
                }
            }
        }

       return winner
    }
}