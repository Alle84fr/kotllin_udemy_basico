fun main (){

    val tipoChar = 'm'
    var tipoInt = 147
    var tipofloat = 147.852F    //F para indicar que é float
    var tipoString = "Cavalo"
    val tipoDoble = 147.853
    val tipoLong = 123_654_745_896L  //números muito grandes L de long

    println("val tipoChar = $tipoChar" +
            "\n var tipoInt = $tipoInt" +
            "\n var tipofloat = $tipofloat" +
            "\n var tipoString = $tipoString" +
            "\n val tipoDoble = $tipoDoble" +
            "\n val tipoLong = $tipoLong")

    // se quiser sem texto - ver que tem aspas duplas, menos no string que é apenas o nome

    println("\n$tipoChar" +
            "\n$tipoInt" +
            "\n$tipofloat" +
            "\n$tipoDoble" +
            "\n$tipoLong")
    println(tipoString)
}
/*
$ = STRING TEMPLATE/ MODELO DE STRING , se declara $nomeVariável - permite iserir variáveis e expressões no texto de forma "automática"
deve estar entre " " aspas duplas, salvo string


 */