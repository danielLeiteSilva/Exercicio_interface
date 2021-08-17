package Exercicio.`interface`

fun main(){
    val documento = Documento("Registro Civil", "RG")
    val foto = Foto("Foto do usuario", "JPG")
    val contrato = Contrato("Contrato trabalho", "CLT")

    val impressora = Impressora(mutableListOf(documento, foto, contrato))

    impressora.imprimirLista()
}