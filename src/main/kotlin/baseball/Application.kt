package baseball

import baseball.view.OutputView

fun main() {
    val baseBallGame = BaseBallGame(OutputView())
    baseBallGame.run()
}
