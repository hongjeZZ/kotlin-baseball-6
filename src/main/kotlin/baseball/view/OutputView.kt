package baseball.view

import baseball.domain.Result

class OutputView {
    fun printGameStartMessage() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun printResult(result: Result) {
        val (ballCount, strikeCount) = result.getResult()

        val message = when {
            ballCount > 0 && strikeCount > 0 -> "${ballCount}볼 ${strikeCount}스트라이크"
            ballCount > 0 -> "${ballCount}볼"
            strikeCount > 0 -> "${strikeCount}스트라이크"
            else -> "낫싱"
        }
        println(message)
    }

    fun printGameEndMessage() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}