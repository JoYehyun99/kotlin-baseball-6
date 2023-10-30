package baseball

import camp.nextstep.edu.missionutils.Console
import utils.MsgConstants
import utils.NumberListGenerator.getRandomNumList
import utils.NumberListGenerator.makeUserNumList
import utils.UserInputValidator.hasRightSize
import utils.UserInputValidator.hasSameNumber
import utils.UserInputValidator.isDigit
import utils.UserInputValidator.isValidNumberRange

class Game {

    fun startGame() {
        println(MsgConstants.START)
        val computerNum = getRandomNumList()
        print(MsgConstants.INPUT)
        val input = Console.readLine()
        val userNum = makeUserNumList(input)
        if (checkInputValid(userNum)) {

        }
    }

    private fun checkInputValid(numList: List<Int>): Boolean {
        return isDigit(numList) && hasSameNumber(numList) && hasRightSize(numList) && isValidNumberRange(numList)
    }


}