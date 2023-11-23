package baseball.domain

import baseball.view.InputView
import baseball.view.OutputView

class BaseBallGame(
    private val inputView: InputView,
    private val outputView: OutputView,
) {
    private val numbersGenerator = NumbersGenerator()
    private val resultCalculator = ResultCalculator()
    private lateinit var computerNumbers: List<Int>
    private lateinit var result: Result
    private var restartNumber = 1

    fun run() {
        outputView.printGameStartMessage()

        while (restartNumber == 1) {
            processGame()
        }
    }

    private fun processGame() {
        computerNumbers = numbersGenerator.createNumbers()

        do {
            playRound()
        } while (!result.isThreeStrike())

        outputView.printGameEndMessage()
        restartNumber = inputView.getRestartNumber()
    }

    private fun playRound() {
        val userNumbers = inputView.getUserNumbers()
        result = resultCalculator.getResult(computerNumbers, userNumbers)

        outputView.printResult(result)
    }
}