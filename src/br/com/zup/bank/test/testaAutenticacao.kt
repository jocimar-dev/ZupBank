fun testaAutenticacao() {
    val gerente = br.com.zup.bank.model.Gerente(
            nome = "Alex",
            cpf = "111.111.111-11",
            salario = 1000.0,
            senha = 1000
    )
    val diretora = br.com.zup.bank.model.Diretor(
            nome = "Fran",
            cpf = "222.222.222-22",
            salario = 2000.0,
            senha = 2000,
            plr = 200.0
    )
    val cliente = br.com.zup.bank.model.Cliente(
            nome = "Gui",
            cpf = "333.333.333-33",
            senha = 1234
    )

    val sistema = br.com.zup.bank.model.SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)
}