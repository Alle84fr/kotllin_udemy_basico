fun main(args: Array<String>){

    /*

    tipoDoModificador nomeVariável = arrayListOf<tipo/classe>(valores)

    se for criar já com valores pode deixar de por o tipo
    val arraylista = arrayListOf<Int>(2,4,8) ==
    val arraylista = arrayListOf(2,4,8)

    se for criar sem deve por o tipo
    val arraylista = arrayListOf<Int>()

       possui métodos já prontos
     */

    val par = arrayListOf(8,14,2,400, 220,38)

    // adiciona
    par.add(22)
    par.add(12)

    par.forEach {
        println("$it")
    }

    par.sort()
    println(par)

    //retira o valor
    par.remove(14)
    println(par)

    //quanto itens tem
    println(par.size)

    //adiciona coleção ou novo array do mesmo tipo
    val novo = arrayListOf(88, 6, 348)
    par.addAll(novo)
    println(par)

    //encontra item sem usar find - usar o índice
    // neste caso pegarei o tamanho e printarei o último item
    // imprimir último
    println(par.last())
    par.sort()
    println(par)
    // imprimir último
    println(par[par.size-1])
    println(par[5])
}