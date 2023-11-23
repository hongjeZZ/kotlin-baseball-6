package baseball.domain

class NumberCalculator {
    fun getResult(
        computerNumbers: List<Int>, userNumbers: List<Int>
    ): Result {
        val strikeCount = getStrikeCount(computerNumbers, userNumbers)
        val ballCount = getTotalCount(computerNumbers, userNumbers) - strikeCount
        return Result(Pair(ballCount, strikeCount))
    }

    private fun getTotalCount(computerNumbers: List<Int>, userNumbers: List<Int>): Int =
        userNumbers.count { it in computerNumbers }

    private fun getStrikeCount(computerNumbers: List<Int>, userNumbers: List<Int>): Int =
        userNumbers.indices.count { userNumbers[it] == computerNumbers[it] }
}