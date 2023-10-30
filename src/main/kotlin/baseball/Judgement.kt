package baseball

import utils.GameState.SUCCESS
import utils.MsgConstants.BALL
import utils.MsgConstants.NOTHING
import utils.MsgConstants.STRIKE


class Judgement (
    private val computerList: List<Int>,
    private val userList: List<Int>
){
    fun compareNumbers(): Boolean {
        var strike = 0
        var ball = 0

        for (userIdx in userList.indices) {
            val userNum = userList[userIdx]
            val comIdx = computerList.indexOf(userNum)
            if (comIdx != -1) {
                if (comIdx == userIdx) {
                    strike += 1
                } else {
                    ball += 1
                }
            }
        }
        printHint(strike, ball)
        return strike != SUCCESS.state
    }

    private fun printHint(strike: Int, ball: Int) {
        when {
            strike == 0 && ball == 0 -> print(NOTHING)
            strike > 0 && ball > 0 -> print("$ball$BALL $strike$STRIKE")
            strike == 0 && ball > 0 -> print("$ball$BALL")
            strike > 0 && ball == 0-> print("$strike$STRIKE")
        }
        println()
    }
}