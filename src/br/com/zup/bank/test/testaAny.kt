package br.com.zup.bank.test

fun testaAny() {
    val endereco = br.com.zup.bank.model.Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    )
    val enderecoNovo = br.com.zup.bank.model.Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println(
        "${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())}"
    )
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}