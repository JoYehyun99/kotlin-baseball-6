package utils

import camp.nextstep.edu.missionutils.Randoms

object RandomNumberGenerator {
    fun getRandomNum(): List<Int> {
        val numList: MutableList<Int> = mutableListOf()

        while (numList.size < 3) {
            val randomNum = Randoms.pickNumberInRange(1, 9)
            if (!numList.contains(randomNum)) {
                numList.add(randomNum)
            }
        }
        return numList.toList()
    }
}