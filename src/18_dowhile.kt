fun main(args: Array<String>){

    /*
    ordena/executa enquanto um operador for diferente ou igual
    execute este corpo enquanto a condição for falsa
    do while executa , faz verificação
    Se for falso será executado, se verdade é executado ao menos uma vez

    while executa enquanto verdade,se já vier verdade, pula, não executa
     */

    var nume = arrayListOf<Int>()
    var taman = 0

    do{
        nume.add(taman ++)
        println("Tamanho da lista é ${nume.size}")
    }
    while (nume.size != 10)
}