package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val inventario = mutableListOf<Videojuego>()
    val juego2 = Videojuego("Dragon Age: Origins", "PC", 1500.00)
    val juego3 = Videojuego("Phasmophobia", "PC", 352.0)
    val juego4 = Videojuego("Baldur's Gate 3", "PC", 2000.0)

    inventario.add(juego2)
    inventario.add(juego3)
    ej14InventarioVideoj(inventario, juego4)
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

fun ej10Temperaturas(){

    println("Por favor, introduzca la temperatura en ºC: ")
    var input: Int? = null

    while (input == null){
        println("Por favor, introduzca un número")
        input = readln().toIntOrNull()
    }

    println("Se está convirtiendo la temperatura a ºF . . .")
    val temperaturaAFahrenheit = input * 9/5 + 32

    println("La temperatura $input ºC en Fahrenheit será: $temperaturaAFahrenheit ºF.")

    println("Por favor, introduzca la temperatura en ºF: ")
    var input2: Int? = null

    while (input2 == null){
        println("Por favor, introduzca un número")
        input2 = readln().toIntOrNull()
    }

    println("Se está convirtiendo la temperatura a ºC . . .")
    val temperaturaACentigrados = (input2 - 32) * 5/9

    println("La temperatura $input2 ºF en Centígrados será: $temperaturaACentigrados ºC.")



}

fun ej11Fibonacci(){

    var input: Int? = null
    val listaNumsFibo: MutableList<Int> = mutableListOf()

    while (input == null){
        println("Por favor, introduzca un número: ")
        input = readln().toIntOrNull()
    }

    if (input >= 0) { listaNumsFibo.add(0) }
    if (input >= 1) { listaNumsFibo.add(1) }

    for (i in 2..input){

        val nextNum = listaNumsFibo[i-1] + listaNumsFibo[i-2]
        listaNumsFibo.add(nextNum)
    }
    println(listaNumsFibo)
}

fun ej12NumInverso(){

    var input: Int? = null

    while (input == null){
        println("Por favor, introduzca un número: ")
        input = readln().toIntOrNull()
    }
    val numInvertido = input.toString().reversed()
    println("Su número $input al revés será $numInvertido.")
}

fun ej13ClaseAnime(){

    println("Por favor, introduzca el nombre del anime: ")
    val nameAnim = readln()


    var episodesAnim: Int? = null

    while (episodesAnim == null){
        println("Por favor, introduzca el número de episodios: ")
        episodesAnim = readln().toIntOrNull()
    }

    println("Por favor, introduzca el género del anime: ")
    val genreAnim = readln()

    val anime = Anime(nameAnim, episodesAnim, genreAnim)

    println("El anime ${anime.name} tiene ${anime.episodes} episodios y es del género ${anime.genre}.")
}

data class Anime(val name: String, val episodes: Int, val genre: String)


fun ej14InventarioVideoj(inventario: MutableList<Videojuego>, item: Videojuego){

    val juego1 = Videojuego("World of Warcraft", "PC", 3000.59)
    val juego2 = Videojuego("Dragon Age: Origins", "PC", 1500.00)
    val juego3 = Videojuego("Phasmophobia", "PC", 352.0)

    inventario.add(juego1)
    inventario.add(juego2)
    inventario.add(juego3)

    println("Te han comprado una copia de ${item.titulo}!!! Qué deseas hacer con ella????")


    println("Por favor seleccione una opción: ")
    println("1. Añadir videojuego")
    println("2. Eliminar videojuego")
    println("3. Mostrar videojuegos")
    val opcion = readln().toIntOrNull()

    when (opcion) {
        1 -> inventario.add(item)

        2 -> {
            if (inventario.isEmpty()){
                println("El inventario de videojuegos está vacío.")
            }
            else{

                println("Por favor, seleccione la opción a eliminar: ")
                println(inventario)
                inventario.forEachIndexed{ index, item ->
                    println("${index + 1}. Remove: $item")
                    val opcion1 = readln().toIntOrNull()
                    if (opcion1 != null && opcion1 in 1..inventario.size) {
                        inventario.removeAt(opcion1 - 1)
                        println("El objeto ha sido eliminado con éxito.")
                    }
                    else{
                        println("Opción no válida.")
                    }
                }
            }
        }
        3 -> {
            if (inventario.isEmpty()){ println("El inventario de videojuegos está vacío.") }
            else { println(inventario) }}
    }
}
data class Videojuego(val titulo: String, val plataforma: String, val horasJugadas: Double)