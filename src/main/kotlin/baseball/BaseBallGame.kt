package baseball

import baseball.view.OutputView

class BaseBallGame(
    private val outputView: OutputView
) {
    fun run() {
        outputView.printGameStartMessage()
    }
}