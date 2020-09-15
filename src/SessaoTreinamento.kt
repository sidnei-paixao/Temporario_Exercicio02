class SessaoTreinamento
{
    var nExperiencia = 10

    fun fnTreinar(oJogador: Jogador)
    {
        val nExp = oJogador.nExperiencia
        oJogador.fnCorrer()
        oJogador.fnFazerGol()
        oJogador.fnCorrer()
        oJogador.nExperiencia++

        println("Jogador ${oJogador.nome} tinha $nExp ponto(s) de experiência, e ficou com ${oJogador.nExperiencia}.")
    }
}