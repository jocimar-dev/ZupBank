import br.com.alura.bytebank.teste.testaCondicoes
import br.com.alura.bytebank.teste.testaLacos
import br.com.zup.bank.test.testaAutenticacao
import br.com.zup.bank.test.testaComportamentosConta
import br.com.zup.bank.test.testaCopiasEReferencias
import br.com.zup.bank.test.testaFuncionarios

fun main() {
    testaAutenticacao()
    testaCondicoes(saldo = 100.0)
    testaLacos()
    testaCopiasEReferencias()
    testaComportamentosConta()
    testaFuncionarios()

}