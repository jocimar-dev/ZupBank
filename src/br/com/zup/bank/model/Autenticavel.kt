package br.com.zup.bank.model

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}