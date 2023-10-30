package utils

import camp.nextstep.edu.missionutils.Randoms

object NumberListGenerator {
    fun getRandomNumList(): List<Int> {
        val numList: MutableList<Int> = mutableListOf()

        while (numList.size < 3) {
            val randomNum = Randoms.pickNumberInRange(1, 9)
            if (!numList.contains(randomNum)) {
                numList.add(randomNum)
            }
        }
        return numList.toList()
    }

    fun makeUserNumList(userNum: String): List<Int> {
        return userNum.map { it.toString().toInt() }.toList()
    }
}