package br.com.zup.bank.model

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: br.com.zup.bank.model.Endereco = br.com.zup.bank.model.Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}