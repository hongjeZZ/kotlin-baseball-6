package baseball.domain

import camp.nextstep.edu.missionutils.Randoms

class NumbersGenerator {
    fun createNumbers(): List<Int> {
        val numbers = mutableSetOf<Int>()

        while (numbers.size < 3) {
            numbers.add(createRandomNumber())
        }
        return numbers.toList()
    }

    private fun createRandomNumber(): Int {
        return Randoms.pickNumberInRange(1, 9)
    }
}