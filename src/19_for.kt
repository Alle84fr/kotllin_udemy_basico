
fun main(args: Array<String>){

    /*
    laço de repetição
    para i na variável ...
    pega 1° item da variável e passa para o i (este i é muito usado no .py)
     */

    var ind = 0
    val cor = arrayListOf("Blue", "Blu", "Azul", "Orange","Arancione", "Laranja")
    for (i in cor){

        println("cor[$ind]=$i | i= $i")
        ind ++
    }
}