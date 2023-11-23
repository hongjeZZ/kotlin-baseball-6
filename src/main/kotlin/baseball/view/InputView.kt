package baseball.view

import baseball.validator.UserNumbersValidator
import camp.nextstep.edu.missionutils.Console

class InputView {
    private val userNumbersValidator = UserNumbersValidator()

    fun getUserNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        val userNumber = getValidInput()
        return userNumber.map { it.toString().toInt() }
    }

    fun getRestartNumber(): Int {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return Console.readLine().toInt()
    }

    private fun getValidInput(): String {
        return try {
            val number = Console.readLine().trim()
            userNumbersValidator.validate(number)
            number
        } catch (e: IllegalArgumentException) {
            println(e.message)
            getValidInput()
        }
    }
}