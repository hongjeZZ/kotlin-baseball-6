package baseball.view

class OutputView {
    fun printGameStartMessage() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun printResult(result: Pair<Int, Int>) {
        val (ballCount, strikeCount) = result

        val message = when {
            ballCount > 0 && strikeCount > 0 -> "${ballCount}볼 ${strikeCount}스트라이크"
            ballCount > 0 -> "${ballCount}볼"
            strikeCount > 0 -> "${strikeCount}스트라이크"
            else -> "낫싱"
        }
        println(message)
    }
}