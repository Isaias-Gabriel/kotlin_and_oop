package digionebank

class Analyst(
    name: String,
    cpf: String,
    salary: Double,
) : Worker(
    name,
    cpf,
    salary,
) {

    override fun calculateBonus() = salary * 0.09
}