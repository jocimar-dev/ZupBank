package br.com.zup.bank.model

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : br.com.zup.bank.model.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), br.com.zup.bank.model.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}