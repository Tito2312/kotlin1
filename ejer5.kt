// Haga un algoritmo que solicite el nombre de n cantidad de personas e imprima un saludo, el usuario ingresará la
// cantidad de personas a validar.

fun main(){

    println("ingrese la cantidad de personas a saludar")
    val cantPersonas = readLine()!!.toInt()

    var contador = 1

    do{

        println("ingrese el nombre de la persona $contador")
        val nombre = readLine()
        println("Hola $nombre, bienvenido")
        contador++
    }while(contador <= cantPersonas)
}