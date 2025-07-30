/*
adivinhe o n° a ser sorteado
sleep é do pacote java.lang e não tem de ser importado
 */



fun main(args: Array<String>){

    /*
    será o n° de 0 a 10
    vou ver se tem time para dar pausa
     */

    val num = arrayListOf(0,1,2,3,4,5,6,7,8,9,10)


    println("Dentre 0 a 10, qual n° será sorteado? ")
    var palpite = readLine()?.toInt()!!

    // até agora ele não falou, mas é esquanto isso ocorre, o laço permanece ativo, quando der falso, sai
    while(palpite<0 || palpite>10){
        println("O n° $palpite está fora do intevalo de 0 a 10")
        println("Dentre 0 a 10, qual n° será sorteado? ")
        // como já criei a variável, agora só a chamo, sem por tipo de mutabilidade
        palpite = readLine()?.toInt()!!

    }

    var rand = num.random()

    /*
    Thread == fio/tarefa/linha de execução
    é em milissegundo que é 1000 segundo
    sleep - pausa
     */
    Thread.sleep(2000)

    if(palpite == rand){
        println("Você acertou, o n° sorteado foi $rand, vc escolheu $palpite")
    } else {
        println("Eita que não foi desta vez, o n° sorteado foi $rand, vc escolheu $palpite")
    }


}