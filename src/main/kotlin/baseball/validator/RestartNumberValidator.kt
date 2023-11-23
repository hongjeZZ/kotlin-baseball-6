package baseball.validator

class RestartNumberValidator {
    fun validate(restartNumber: String) {
        require(restartNumber == "1" || restartNumber == "2") { "[ERROR] 유효하지 않은 숫자입니다. 다시 입력해주세요." }
    }
}