import Metodos.Pessoa

fun main(){

    val pessoa1 = Pessoa("Raquel", 436162226)
    val pessoa2 = Pessoa("Daniel", 492362166)
    println(pessoa1 == pessoa2)
    println(pessoa1)
    println(pessoa1.hashCode())

}