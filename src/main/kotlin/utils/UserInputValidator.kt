package utils

import utils.GameState.END_RANGE
import utils.GameState.SUCCESS
import utils.MsgConstants.INVALID_INPUT
import java.lang.NumberFormatException

object UserInputValidator {

    fun isDigit(input: List<Int>): Boolean{
        return try {
            input.joinToString("").toInt()
            true
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException(INVALID_INPUT)
        }
    }

    fun hasSameNumber(input: List<Int>): Boolean {
        if (input.size != input.distinct().size) {
            throw IllegalArgumentException(INVALID_INPUT)
        }
        return true
    }

    fun hasRightSize(input: List<Int>): Boolean {
        if (input.size == SUCCESS.state) {
            throw IllegalArgumentException(INVALID_INPUT)
        }
        return true
    }

    fun isValidNumberRange(input: List<Int>): Boolean {
        for (num in input) {
            if (num !in GameState.START_RANGE.state..END_RANGE.state) {
                throw IllegalArgumentException(INVALID_INPUT)
            }
        }
        return true
    }

}