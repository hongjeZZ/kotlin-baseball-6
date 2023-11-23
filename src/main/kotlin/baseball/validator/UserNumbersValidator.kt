package baseball.validator

class UserNumbersValidator {
    fun validate(userNumbers: String) {
        requireValidNumbers(userNumbers)
        requireValidRangeNumbers(userNumbers)
        requireNoZero(userNumbers)
        requireUniqueNumbers(userNumbers)
    }

    private fun requireValidNumbers(userNumbers: String) {
        userNumbers.toIntOrNull() ?: throw IllegalArgumentException("[ERROR] 유효하지 않은 숫자입니다. 다시 입력해주세요.")
    }

    private fun requireValidRangeNumbers(userNumbers: String) {
        require(userNumbers.length == 3) { "[ERROR] 유효하지 않은 숫자입니다. 다시 입력해주세요." }
    }

    private fun requireNoZero(userNumbers: String) {
        require(!userNumbers.contains("0")) { "[ERROR] 유효하지 않은 숫자입니다. 다시 입력해주세요." }
    }

    private fun requireUniqueNumbers(userNumbers: String) {
        require(userNumbers.toSet().size == userNumbers.length) { "[ERROR] 유효하지 않은 숫자입니다. 다시 입력해주세요." }
    }
}