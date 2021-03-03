package digionebank

import java.math.BigDecimal

class Account(
    val id: String,
    val branch: String,
    val balance: BigDecimal,
) {
    fun deposit(value: BigDecimal) {

    }

    fun draft(value: BigDecimal) {

    }
}

fun main() {
    var newAccount = Account("1", "777", BigDecimal(7777))

    // newAccount.id = "7"

    println(newAccount.id)
}