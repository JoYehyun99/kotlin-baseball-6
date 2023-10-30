package utils

import utils.GameState.END_RANGE
import utils.GameState.SUCCESS
import utils.MsgConstants.INVALID_INPUT
import java.lang.NumberFormatException

object UserInputValidator {
    fun isValidInput(input: String) {
        if (input.length != SUCCESS.state || input.toSet().size != input.length || !input.all { it.isDigit() && it != '0' }) {
            throw IllegalArgumentException(INVALID_INPUT)
        }
    }
}