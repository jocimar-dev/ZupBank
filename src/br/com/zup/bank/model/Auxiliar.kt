package br.com.zup.bank.model

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : br.com.zup.bank.model.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() = salario * 0.05 //To change initializer of created properties use File | Settings | File Templates.


}