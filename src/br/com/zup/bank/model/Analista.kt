package br.com.zup.bank.model

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : br.com.zup.bank.model.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

}