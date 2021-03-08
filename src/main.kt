import javax.sql.rowset.JoinRowSet

fun main (args: Array<String>){
    println("Bem vindo ao Banco Zup!!")
    val numeroDaConta: Int = 1
    val titular: String = "José"
    var saldo: Double = 0.0
    saldo = 100.00
    saldo = saldo + 100

    println("titular $titular")
    println("número da Conta $numeroDaConta")
    println("saldo $saldo")

}
//Resultado:
//Bem vindo ao Banco Zup!!
//titular José
//número da Conta 1
//saldo 200.0