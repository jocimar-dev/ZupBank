package br.com.zup.bank.model

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
) : br.com.zup.bank.model.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}