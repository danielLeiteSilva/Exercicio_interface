package Exercicio.`interface`

class Foto(override var nome: String, override var tipoDocumento: String) : Imprimivel {

    override fun imprimir(){
        println("Eu sou o $tipoDocumento, $nome")
    }

}