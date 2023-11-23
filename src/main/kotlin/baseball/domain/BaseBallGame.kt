package baseball.domain

import baseball.view.InputView
import baseball.view.OutputView

class BaseBallGame(
    private val inputView: InputView,
    private val outputView: OutputView,
) {
    private val numbersGenerator = NumbersGenerator()
    private val numberCalculator = NumberCalculator()

    fun run() {
        outputView.printGameStartMessage()
        val computerNumbers = numbersGenerator.createNumbers()
        val userNumbers = inputView.getUserNumbers()

        val result = numberCalculator.getBallAndStrike(computerNumbers, userNumbers)
    }
}