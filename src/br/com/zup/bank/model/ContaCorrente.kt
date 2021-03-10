package br.com.zup.bank.model

class ContaCorrente(
    titular: String,
    numero: Int
) : br.com.zup.bank.model.Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}