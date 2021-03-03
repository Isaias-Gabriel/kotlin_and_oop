package digionebank.tests

import digionebank.Bank

fun main() {
    val newBank = Bank(name = "Big Bad Bank", number = 101)

    val notSoNewBank = newBank.copy(number = 1)

    println(newBank.name)
    println(newBank.number)

    println("---")

    println(notSoNewBank.name)
    println(notSoNewBank.number)
}