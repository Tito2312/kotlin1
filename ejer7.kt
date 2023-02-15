
//Cree un algoritmo que lea un número y determine si éste es divisible entre 11.

fun main(){

    println("ingrese la cantidad de numeros que desea validar")
    var cantidad = readLine()!!.toInt()

    for (i in 1..cantidad) {
        println("ingrese un numero")
        val numero = readLine()!!.toInt()

        if(numero % 11 == 0){
            println("el numero es divisible entre 11")
        }else{
            println("el numero es no divisible entre 11")
        }
    }
}