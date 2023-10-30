package baseball

import camp.nextstep.edu.missionutils.Console
import utils.GameState.RESTART
import utils.GameState.TERMINATION
import utils.MsgConstants
import utils.NumberListGenerator.getRandomNumList
import utils.NumberListGenerator.makeUserNumList
import utils.UserInputValidator.hasRightSize
import utils.UserInputValidator.hasSameNumber
import utils.UserInputValidator.isDigit
import utils.UserInputValidator.isValidNumberRange

class Game {
    fun startGame() {
        do {
            println(MsgConstants.START)
            val computerNum = getRandomNumList()
            println(computerNum)
            playGame(computerNum)
            println("게임을 새로 시작하려면 ${RESTART.state}, 종료하려면 ${TERMINATION.state}를 입력하세요.")
        } while (Console.readLine().toInt() == RESTART.state)
    }

    private fun playGame(computerNum: List<Int>) {
        do {
            print(MsgConstants.INPUT)
            val input = Console.readLine()
            val userNum = makeUserNumList(input)
            checkInputValid(userNum)
        } while (Judgement(computerNum, userNum).compareNumbers())
    }

    private fun checkInputValid(numList: List<Int>) {
        isDigit(numList)
        hasSameNumber(numList)
        hasRightSize(numList)
        isValidNumberRange(numList)
    }


}