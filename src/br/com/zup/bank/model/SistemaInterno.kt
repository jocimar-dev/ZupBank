package br.com.zup.bank.model

class SistemaInterno {

    fun entra(admin: br.com.zup.bank.model.Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

}