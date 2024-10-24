package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    ej9Primos()
}

fun ej1Saludo(){

    println("Por favor, introduzca su nombre: ")
    val input = readln()

    println("¡Hola, $input!")
}

fun ej2ParOImpar(){

    println("Por favor, introduzca un número: ")
    var input = readln().toIntOrNull()

    while (input == null){
        println("Por favor, introduzca un número: ")
        input = readln().toIntOrNull()
    }

    if (input % 2 == 0){
        println("Su número es par.")
    }
    else{
        println("Su número es impar.")
    }

}

fun ej3CalculoCirculo(){

    println("Por favor, introduzca el radio del círculo: ")
    var input = readln().toIntOrNull()

    while (input == null){
       println("Por favor, introduzca el radio del círculo: ")
       input = readln().toIntOrNull()

    }

    val area = 3.14 * (input * input)

    println("El área de su círculo es: $area m2.")

}

fun ej4GeneradorRandomNum(){

    val randomNum = (1..100).random()

    println("Se ha generado un número. Intenta adivinarlo!!!")
    println("Por favor, introduce un número: ")
    var input = readln().toIntOrNull()

    while (input == null || input != randomNum){
        println("Por favor, introduce un número: ")
        input = readln().toIntOrNull()

        if (input != null) {
            if (input < randomNum){ println("El número es mayor que el que has introducido.") } else{ println("El número es menor que el que has introducido.") }
        }
        if (input == randomNum){
            println("HAS ACERTADO!!!")
            break
        }
    }
}

fun ej5TablaMult(){

    println("Por favor, introduzca un número: ")
    var input = readln().toIntOrNull()

    while (input == null){
        input = readln().toIntOrNull()
    }

    println("1. $input * 1 = ${input * 1}.")
    println("2. $input * 2 = ${input * 2}.")
    println("3. $input * 3 = ${input * 3}.")
    println("4. $input * 4 = ${input * 4}.")
    println("5. $input * 5 = ${input * 5}.")
    println("6. $input * 6 = ${input * 6}.")
    println("7. $input * 7 = ${input * 7}.")
    println("8. $input * 8 = ${input * 8}.")
    println("9. $input * 9 = ${input * 9}.")
    println("10. $input * 10 = ${input * 10}.")
}

fun ej6Sumar1Al100(){
    val listaNums = (1..100)
    var contador = 0

    for (i in listaNums){
        contador += i
    }

    println(contador)
}

fun ej7ReversoCadena(){

    println("Por favor, introduzca una cadena de texto: ")
    val input = readln()

    println("La cadena al revés sería: ")
    println(input.reversed())
}

fun ej8ContadorVocales(){
    println("Por favor, introduzca una frase: ")
    val input = readln().toCharArray()
    var contador = 0

    for (i in input){
        when (i) {
            'a' -> contador += 1
            'A' -> contador += 1

            'e' -> contador += 1
            'E' -> contador += 1

            'i' -> contador += 1
            'I' -> contador += 1

            'o' -> contador += 1
            'O' -> contador += 1

            'u' -> contador += 1
            'U' -> contador += 1
        }
    }
    println(contador)
}


fun ej9Primos(){

    var input: Int? = null

    while (input == null){
        println("Por favor, introduzca un número")
        input = readln().toIntOrNull()
    }
    var contador = 0

    for (num in 1..input) {
        if (input%num == 0){
            contador+=1
        }
    }
    if (contador > 2){ println("El número no es primo.") } else{ println("El número es primo.") }
}

fun ej10Fibonacci(){

}