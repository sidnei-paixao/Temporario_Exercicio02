class Jogador (var nome: String)
{
    var nEnergia = 0
    var nAlegria = 0
    var nGols = 0
    var nExperiencia = 0

    constructor(nome: String, nExp: Int): this(nome)
    {
        this.nExperiencia = nExp;
    }

    fun fnFazerGol()
    {
        this.nEnergia-=5
        this.nAlegria+=10
        this.nGols++
        println("GOOOOL!")
    }
    fun fnCorrer()
    {
        this.nEnergia-=10
        println("Cansei")
    }
}