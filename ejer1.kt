//  La tienda "Mis Zapatos" está de aniversario, por esa razón se está realizando un descuento del 50% en compras
// mayores o iguales a los $ 100.000. Haga un algoritmo que permita validar cuando se debe aplicar un descuento a un 
// cliente, en caso de que el descuento sea valido se debe informar al usuario indicando el valor descontado.

fun main(){

    println("ingrese el valor de la compra  ")
    var valorCompra = readLine()!!.toDouble()

    println("el valor actual de la compra es de $valorCompra")

    if(valorCompra >= 100000){

        var descuento = valorCompra * 0.5
        valorCompra -= descuento
        println("el descuento aplicado del 50% es equivalente a $descuento")
    }

    println("el valor final de su compra es de: $valorCompra")
}

