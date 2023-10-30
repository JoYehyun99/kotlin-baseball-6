package baseball

import camp.nextstep.edu.missionutils.Console
import utils.GameState
import utils.GameState.RESTART
import utils.GameState.TERMINATION
import utils.MsgConstants
import utils.NumberListGenerator.getRandomNumList
import utils.NumberListGenerator.makeUserNumList
import utils.UserInputValidator.isValidInput

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
            isValidInput(input)
            val userNum = makeUserNumList(input)
        } while (Judgement(computerNum, userNum).compareNumbers())
        println("${GameState.SUCCESS.state}${MsgConstants.END}")
    }
}