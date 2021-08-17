package Exercicio.`interface`

class Documento(override var nome: String, override var tipoDocumento: String) :Imprimivel {

    override fun imprimir(){
        println("Eu sou o $tipoDocumento, $nome")
    }

}