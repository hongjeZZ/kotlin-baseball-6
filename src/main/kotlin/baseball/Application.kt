package baseball

import baseball.domain.BaseBallGame
import baseball.view.InputView
import baseball.view.OutputView

fun main() {
    val baseBallGame = BaseBallGame(InputView(), OutputView())
    baseBallGame.run()
}