// 1. Haga un algoritmo que solicite el ingreso de 2 números, valide cual es mayor o si son iguales

fun main(){

    println("ingrese el primer numero")
    var a = readLine()!!.toInt()
    println("ingrese el segundo numero")
    var b = readLine()!!.toInt()

    if(a > b){
        println("$a es mayor que $b")
    }else{
        if(b > a){
            println("$b es mayor que $a")
        }else{
            println("los numeros son iguales")
        }
    }
}