fun main (args: Array<String>){
    /*
    Se precisar do índice, usa for
    for (i in cor)

    Se for só percorrer a lista usa o foreach
    roupa.forEach

     */
    
    var roupa = arrayListOf("Paulista", "Carioca", "Bahiano", "Pernanbucano")

    roupa.forEach {
        println(it.uppercase())
    }

}