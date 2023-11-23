package baseball.domain

import baseball.view.InputView
import baseball.view.OutputView

class BaseBallGame(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    private val numbersGenerator = NumbersGenerator()
    fun run() {
        outputView.printGameStartMessage()
        val computerNumbers = numbersGenerator.createNumbers()
        val userNumbers = inputView.getUserNumbers()
    }
}