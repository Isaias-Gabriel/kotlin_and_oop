package digionebank.tests

import digionebank.ClientType

fun main() {
    ClientType.values().forEach {
        println("${it.description} - $it")
    }

    ClientType.values().forEach { element ->
        println("${element.description} - $element")
    }

    val pf = ClientType.PF

    println("${pf.description} - ${pf.name}")
}