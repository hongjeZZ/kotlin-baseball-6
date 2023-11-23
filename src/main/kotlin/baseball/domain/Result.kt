package baseball.domain

class Result(private val _result: Pair<Int, Int>) {
    fun getResult(): Pair<Int, Int> = _result
    fun isThreeStrike(): Boolean {
        return _result.second == 3
    }
}