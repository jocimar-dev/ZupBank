package br.com.zup.bank.test

import br.com.zup.bank.model.Autenticavel
import br.com.zup.bank.model.SistemaInterno
import br.com.zup.bank.model.Cliente
import br.com.zup.bank.model.ContaPoupanca
import br.com.zup.bank.model.ContaCorrente
import br.com.zup.bank.model.Conta


fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
    println("nome do cliente ${fran.nome}")

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)

    println("Total de contas: ${Conta.total}")
}