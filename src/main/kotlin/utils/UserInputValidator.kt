package utils

import utils.GameState.END_RANGE
import utils.GameState.SUCCESS
import utils.MsgConstants.INVALID_INPUT
import java.lang.NumberFormatException

object UserInputValidator {

    fun isDigit(input: List<Int>){
        try {
            input.joinToString("").toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException(INVALID_INPUT)
        }
    }

    fun hasSameNumber(input: List<Int>) {
        if (input.size != input.distinct().size) {
            throw IllegalArgumentException(INVALID_INPUT)
        }
    }

    fun hasRightSize(input: List<Int>) {
        if (input.size != SUCCESS.state) {
            throw IllegalArgumentException(INVALID_INPUT)
        }
    }

    fun isValidNumberRange(input: List<Int>) {
        for (num in input) {
            if (num !in GameState.START_RANGE.state..END_RANGE.state) {
                throw IllegalArgumentException(INVALID_INPUT)
            }
        }
    }

}