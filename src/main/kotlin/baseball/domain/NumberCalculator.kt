package baseball.domain

class NumberCalculator {
    fun getBallAndStrike(
        computerNumbers: List<Int>, userNumbers: List<Int>
    ): Pair<Int, Int> {
        val totalCount = getTotalCount(computerNumbers, userNumbers)
        val strikeCount = getStrikeCount(computerNumbers, userNumbers)
        val ballCount = totalCount - strikeCount
        return Pair(strikeCount, ballCount)
    }

    private fun getTotalCount(computerNumbers: List<Int>, userNumbers: List<Int>): Int =
        userNumbers.count { it in computerNumbers }

    private fun getStrikeCount(computerNumbers: List<Int>, userNumbers: List<Int>): Int =
        userNumbers.indices.count { userNumbers[it] == computerNumbers[it] }
}