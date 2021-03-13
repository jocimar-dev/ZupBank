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
        get() = salario * 0.05 //Para alterar o inicializador das propriedades criadas, use Arquivo | Configurações | Modelos de arquivo.


}