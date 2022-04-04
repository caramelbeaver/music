const val ITEM_PRICE = 100.0
const val DISCOUNT = 100.0
const val DISCOUNT_START = 1000.0
const val DISCOUNT_NEXT_TIER = 10000.0

fun main() {
    val regularСustomer = true
    val itemCount = 15.0

    val totalPrice = ITEM_PRICE * itemCount

    val result = if (totalPrice > DISCOUNT_NEXT_TIER)
        totalPrice * 0.95
    else if (totalPrice > DISCOUNT_START)
        totalPrice - DISCOUNT
    else totalPrice

    val totalResult = if (regularСustomer)
        result * 0.99
    else result
    println("Итоговая сумма: $totalResult")
}