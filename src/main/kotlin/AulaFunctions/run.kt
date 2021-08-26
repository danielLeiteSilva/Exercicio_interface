import java.util.regex.Pattern

fun main() {

    val soma = { a:Int, b:Int -> a + b}
    val subtracao = { a:Int, b:Int -> a - b}
    val multiplicacao = { a:Int, b:Int -> a * b}
    val divisao = { a:Int, b:Int -> a / b}

    println("Soma: ${soma(10, 15)}")
    println("Subtracao: ${ subtracao(15, 5) } ")
    println("Multiplicacao: ${ multiplicacao(12, 13) }")
    println("Divisao: ${ divisao(13, 12) } ")


    //-------------------------------------------------------

    val validaEmail = {email: String ->
       email.contains("@")
    }

    println(validaEmail("daniel199257@gmail.com"))

    //---------------------------------------------------------
    val multiplos = { valores: List<Int> ->

        var multi = 1
        for(numero in valores) {
            multi *= numero
        }
        multi
    }

    println(multiplos(listOf(10, 10)))
}