package baseball

import baseball.domain.NumbersGenerator
import baseball.view.OutputView

class BaseBallGame(
    private val outputView: OutputView
) {
    private val numbersGenerator = NumbersGenerator()
    fun run() {
        outputView.printGameStartMessage()
        val computerNumbers = numbersGenerator.createNumbers()
    }
}