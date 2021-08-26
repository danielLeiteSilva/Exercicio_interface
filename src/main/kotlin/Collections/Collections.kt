
fun main(){

    val mapa = mapOf(
        0 to "Ovo",
        1 to "Agua",
        2 to "Escopo",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo")

    fun listPrint(mapa: Map<Int, String>){
        mapa.forEach { it ->
            println("A chave e ${it.key} e value ${it.value}")
        }
    }

    listPrint(mapa)


    val apelidos = mapOf(
        "Joao" to listOf("Juan", "El Divo", "Maromba", "Zé Bonitinho"),
        "Miguel" to listOf("Dark Knight", "Bruce", "Batfleck", "Gengiva"),
        "Maria" to listOf("Dark Knight", "Bruce", "Batfleck", "Gengiva"),
        "Lucas" to listOf("Lukinha", "Jorge", "George", "Kevin", "Flynn"))

    fun listaApelidos(mapa: Map<String, List<String>>){
        mapa.map { it ->
            println("=====================")
            println("O a Chave e ${it.key}")
            println("Os valores sao")
            for (a in it.value) {
                print("${a}, ")
            }
            println("=====================")
        }
    }

    listaApelidos(apelidos)

    val list = mutableListOf<Int>()

    list.add(1)
    list.add(5)
    list.add(6)
    list.add(7)
    list.add(8)
    list.add(8)

    fun imprimeLista(lista: MutableList<Int>){
        for(lis in lista){
            println(lis)
        }
    }

    imprimeLista(list)
}