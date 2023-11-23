package baseball.view

import baseball.validator.RestartNumberValidator
import baseball.validator.UserNumbersValidator
import camp.nextstep.edu.missionutils.Console

class InputView {
    private val userNumbersValidator = UserNumbersValidator()
    private val restartNumberValidator = RestartNumberValidator()

    fun getUserNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        val userNumber = getValidInput { userNumbersValidator.validate(it) }
        return userNumber.map { it.toString().toInt() }
    }

    fun getRestartNumber(): Int {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return getValidInput { restartNumberValidator.validate(it) }.toInt()
    }

    private fun getValidInput(validate: (String) -> Unit): String {
        return try {
            val input = Console.readLine().trim()
            validate(input)
            input
        } catch (e: IllegalArgumentException) {
            println(e.message)
            getValidInput(validate)
        }
    }
}