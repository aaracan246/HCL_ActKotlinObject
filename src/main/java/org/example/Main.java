package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Videojuego> inventario = new ArrayList<>();
        Videojuego juego2 = new Videojuego("Dragon Age: Origins", "PC", 1500.00);
        Videojuego juego3 = new Videojuego("Phasmophobia", "PC", 352.0);
        Videojuego juego4 = new Videojuego("Baldur's Gate 3", "PC", 2000.0);

        inventario.add(juego2);
        inventario.add(juego3);
        ej14InventarioVideoj(inventario, juego4);
    }

    public static void ej1Saludo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca su nombre: ");
        String input = scanner.nextLine();
        System.out.println("¡Hola, " + input + "!");
    }

    public static void ej2ParOImpar() {
        Scanner scanner = new Scanner(System.in);
        Integer input = null;

        while (input == null) {
            System.out.println("Por favor, introduzca un número: ");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                input = null;
            }
        }

        if (input % 2 == 0) {
            System.out.println("Su número es par.");
        } else {
            System.out.println("Su número es impar.");
        }
    }

    public static void ej3CalculoCirculo() {
        Scanner scanner = new Scanner(System.in);
        Integer input = null;

        while (input == null) {
            System.out.println("Por favor, introduzca el radio del círculo: ");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                input = null;
            }
        }

        double area = 3.14 * (input * input);
        System.out.println("El área de su círculo es: " + area + " m2.");
    }

    public static void ej4GeneradorRandomNum() {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100) + 1;
        System.out.println("Se ha generado un número. Intenta adivinarlo!!!");

        Integer input = null;
        while (input == null || input != randomNum) {
            System.out.println("Por favor, introduce un número: ");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                input = null;
            }

            if (input != null) {
                if (input < randomNum) {
                    System.out.println("El número es mayor que el que has introducido.");
                } else if (input > randomNum) {
                    System.out.println("El número es menor que el que has introducido.");
                } else {
                    System.out.println("HAS ACERTADO!!!");
                }
            }
        }
    }

    public static void ej5TablaMult() {
        Scanner scanner = new Scanner(System.in);
        Integer input = null;

        while (input == null) {
            System.out.println("Por favor, introduzca un número: ");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                input = null;
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + input + " * " + i + " = " + (input * i) + ".");
        }
    }

    public static void ej6Sumar1Al100() {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            contador += i;
        }
        System.out.println(contador);
    }

    public static void ej7ReversoCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca una cadena de texto: ");
        String input = scanner.nextLine();
        System.out.println("La cadena al revés sería: ");
        System.out.println(new StringBuilder(input).reverse().toString());
    }

    public static void ej8ContadorVocales() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca una frase: ");
        String input = scanner.nextLine();
        int contador = 0;

        for (char c : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println(contador);
    }

    public static void ej9Primos() {
        Scanner scanner = new Scanner(System.in);
        Integer input = null;

        while (input == null) {
            System.out.println("Por favor, introduzca un número");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                input = null;
            }
        }

        boolean isPrime = true;
        if (input < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(input); i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }

    public static void ej10Temperaturas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca la temperatura en ºC: ");
        int input = scanner.nextInt();
        int temperaturaAFahrenheit = input * 9 / 5 + 32;
        System.out.println("La temperatura " + input + " ºC en Fahrenheit será: " + temperaturaAFahrenheit + " ºF.");

        System.out.println("Por favor, introduzca la temperatura en ºF: ");
        int input2 = scanner.nextInt();
        int temperaturaACentigrados = (input2 - 32) * 5 / 9;
        System.out.println("La temperatura " + input2 + " ºF en Centígrados será: " + temperaturaACentigrados + " ºC.");
    }

    public static void ej11Fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        int input = scanner.nextInt();

        List<Integer> listaNumsFibo = new ArrayList<>();
        if (input >= 0) listaNumsFibo.add(0);
        if (input >= 1) listaNumsFibo.add(1);

        for (int i = 2; i <= input; i++) {
            int nextNum = listaNumsFibo.get(i - 1) + listaNumsFibo.get(i - 2);
            listaNumsFibo.add(nextNum);
        }
        System.out.println(listaNumsFibo);
    }

    public static void ej12NumInverso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        int input = scanner.nextInt();
        String numInvertido = new StringBuilder(String.valueOf(input)).reverse().toString();
        System.out.println("Su número " + input + " al revés será " + numInvertido + ".");
    }

    public static void ej13ClaseAnime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el nombre del anime: ");
        String nameAnim = scanner.nextLine();

        System.out.println("Por favor, introduzca el número de episodios: ");
        int episodesAnim = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.println("Por favor, introduzca el género del anime: ");
        String genreAnim = scanner.nextLine();

        Anime anime = new Anime(nameAnim, episodesAnim, genreAnim);
        System.out.println("El anime " + anime.getName() + " tiene " + anime.getEpisodes() + " episodios y es del género " + anime.getGenre() + ".");
    }

    public static void ej14InventarioVideoj(List<Videojuego> inventario, Videojuego item) {
        Videojuego juego1 = new Videojuego("World of Warcraft", "PC", 3000.59);
        inventario.add(juego1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Te han comprado una copia de " + item.getTitulo() + "!!! Qué deseas hacer con ella????");
        System.out.println("1. Añadir videojuego");
        System.out.println("2. Eliminar videojuego");
        System.out.println("3. Mostrar videojuegos");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> inventario.add(item);
            case 2 -> {
                if (inventario.isEmpty()) {
                    System.out.println("El inventario de videojuegos está vacío.");
                } else {
                    System.out.println("Por favor, seleccione la opción a eliminar: ");
                    for (int i = 0; i < inventario.size(); i++) {
                        System.out.println((i + 1) + ". Remove: " + inventario.get(i));
                    }
                    int opcion1 = scanner.nextInt();
                    if (opcion1 > 0 && opcion1 <= inventario.size()) {
                        inventario.remove(opcion1 - 1);
                        System.out.println("El objeto ha sido eliminado con éxito.");
                    } else {
                        System.out.println("Opción no válida.");
                    }
                }
            }
            case 3 -> {
                if (inventario.isEmpty()) {
                    System.out.println("El inventario de videojuegos está vacío.");
                } else {
                    System.out.println(inventario);
                }
            }
        }
    }
}

class Anime {
    private String name;
    private int episodes;
    private String genre;

    public Anime(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }
}

class Videojuego {
    private String titulo;
    private String plataforma;
    private double horasJugadas;

    public Videojuego(String titulo, String plataforma, double horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getHorasJugadas() {
        return horasJugadas;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", horasJugadas=" + horasJugadas +
                '}';
    }
}