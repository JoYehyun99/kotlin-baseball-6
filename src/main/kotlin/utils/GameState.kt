package utils

enum class GameState(val state: Int) {
    RESTART(1),
    TERMINATION(2),
    SUCCESS(3)
}