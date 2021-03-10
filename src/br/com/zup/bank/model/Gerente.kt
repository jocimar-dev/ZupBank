package br.com.zup.bank.model

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : br.com.zup.bank.model.FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario
        }

}