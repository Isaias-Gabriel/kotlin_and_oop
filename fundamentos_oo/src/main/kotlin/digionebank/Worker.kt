package digionebank

abstract class Worker(
    name: String,
    cpf: String,
    val salary: Double,
) : Person(name, cpf) {
    protected abstract fun calculateBonus(): Double

    override fun toString(): String = """
        name: $name
        cpf: $cpf
        salary: $salary
        bonus: ${calculateBonus()}
    """.trimIndent()
}