package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mostrarMenu = true;

        System.out.println("Bienvenido al concesionario de vehiculos TeoMotors");
        System.out.println("A continuacion veras nuestro catalogo de marcas: ");

        while (true) {
            if (mostrarMenu) {
                marcas();
            }

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    chevrolet(scanner);
                    mostrarMenu = false; // Después de elegir una marca, no mostramos el menú
                    break;
                /*
                 * case 2:
                 * ford(scanner);
                 * break;
                 * case 3:
                 * kia(scanner);
                 * break;
                 * case 4:
                 * mazda(scanner);
                 * break;
                 * case 5:
                 * renault(scanner);
                 * break;
                 * case 6:
                 * toyota(scanner);
                 * break;
                 */
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            
        }
    }
}
    private static void marcas() {
        System.out.println("1. Chevrolet");
        System.out.println("2. Ford");
        System.out.println("3. Kia");
        System.out.println("4. Mazda");
        System.out.println("5. Renault");
        System.out.println("6. Toyota");
        System.out.println("0. Salir");
        System.out.print("Seleccione una marca: ");

    }

    private static void chevrolet(Scanner scanner) {
        System.out.println("1. Onix");
        System.out.println("2. Aveo");
        System.out.println("3. Spark GT");
        System.out.print("Seleccione un vehiculo: ");

        int chevrolet = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (chevrolet) {
            case 1:
                onix(scanner);
                break;
        
             case 2:
             aveo(scanner);
             break;
             case 3:
             sparkGT(scanner);
             break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private static void onix(Scanner scanner) {
        System.out.println("Informacion del vehiculo: ");
        System.out.println("Kilometros: 0" + ", " + "Precio: $15.000usd" + ", " + "Color: Blanco");

    }
    
    private static void aveo(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 30.000" +", "+ "Precio: $5.000usd" +", "+
      "Color: Gris");
      }

    private static void sparkGT(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 45.000" +", "+ "Precio: $7.000usd" +", "+
      "Color: Azul");
    }
}
