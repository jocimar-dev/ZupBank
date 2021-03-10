package br.com.zup.bank.model

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: br.com.zup.bank.model.Funcionario){
        this.total += funcionario.bonificacao
    }

}