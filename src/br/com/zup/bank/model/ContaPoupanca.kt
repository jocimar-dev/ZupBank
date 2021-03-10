package br.com.zup.bank.model

class ContaPoupanca(
    titular: String,
    numero: Int
) : br.com.zup.bank.model.Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}