import digionebank.Analyst
import digionebank.PrintWorkerReport
import digionebank.Worker
import java.math.BigDecimal

fun main() {
//    val juan = Worker(name = "Juan", cpf = "777.777.777-11", salary = BigDecimal(7))
    val juan = Analyst(name = "JUAN", cpf = "777.777.777-11", salary = 7.0)

//    println(juan.toString())
    PrintWorkerReport.print((juan))
}