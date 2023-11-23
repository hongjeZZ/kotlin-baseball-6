package baseball.domain

import baseball.view.InputView
import baseball.view.OutputView

class BaseBallGame(
    private val inputView: InputView,
    private val outputView: OutputView,
) {
    private val numbersGenerator = NumbersGenerator()
    private val numberCalculator = NumberCalculator()
    private lateinit var computerNumbers: List<Int>
    private lateinit var result: Pair<Int, Int>

    fun run() {
        outputView.printGameStartMessage()
        computerNumbers = numbersGenerator.createNumbers()

        do {
         playRound()
        } while (result.second != 3)
    }

    private fun playRound() {
        val userNumbers = inputView.getUserNumbers()
        result = numberCalculator.getBallAndStrike(computerNumbers, userNumbers)

        outputView.printResult(result)
    }
}