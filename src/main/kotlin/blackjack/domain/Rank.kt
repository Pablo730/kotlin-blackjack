package blackjack.domain

enum class Rank(val value: Int, val alias: String) {
    ACE(1, "A"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(10, "J"),
    QUEEN(10, "Q"),
    KING(10, "K"),
    ;

    fun getNumber(): List<Int> {
        return if (this == ACE) {
            listOf(value, 11)
        } else {
            listOf(value)
        }
    }
}
