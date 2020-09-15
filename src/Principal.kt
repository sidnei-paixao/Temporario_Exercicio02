fun main()
{
    val oAtacante = Jogador("Xespirito Baiano")
    val oZagueiro = Jogador("Juvenildo Duçantus")
    val oTreino = SessaoTreinamento()

    oTreino.fnTreinar(oAtacante)
    oTreino.fnTreinar(oZagueiro)
    oTreino.fnTreinar(oAtacante)

}