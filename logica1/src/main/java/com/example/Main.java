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
                
                case 2:
                    ford(scanner);
                    mostrarMenu = false;
                    break;
                case 3:
                    kia(scanner);
                    mostrarMenu = false;
                    break;
                case 4:
                   mazda(scanner);
                   break;
                case 5:
                  renault(scanner);
                  break;
                  case 6:
                  toyota(scanner);
                  break;
                 
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

    //Opción 2, Ford---------------------------------------------------------------------
    private static void ford(Scanner scanner) {
        System.out.println("1. Explorer");
        System.out.println("2. Edge");
        System.out.println("3. Raptor");
        System.out.print("Seleccione un vehiculo: ");

        int ford = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (ford) {
            case 1:
                explorer(scanner);
                break;
             case 2:
                edge(scanner);
                break;
             case 3:
                raptor(scanner);
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private static void explorer(Scanner scanner) {
        System.out.println("Informacion del vehiculo: ");
        System.out.println("Kilometros: 0" + ", " + "Precio: $20.000usd" + ", " + "Color: Negro");
    }
    
    private static void edge(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 8.000" +", "+ "Precio: $15.000usd" +", "+
      "Color: Beige");
      }

    private static void raptor(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 2.000" +", "+ "Precio: $30.000usd" +", "+
      "Color: Azul");
    }

    //Opción 3, Kia---------------------------------------------------------------------
    private static void kia(Scanner scanner) {
        System.out.println("1. Picanto");
        System.out.println("2. Sportage");
        System.out.println("3. K3");
        System.out.print("Seleccione un vehiculo: ");

        int kia = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (kia) {
            case 1:
                picanto(scanner);
                break;
             case 2:
                sportage(scanner);
                break;
             case 3:
                k3(scanner);
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private static void picanto(Scanner scanner) {
        System.out.println("Informacion del vehiculo: ");
        System.out.println("Kilometros: 0" + ", " + "Precio: $20.000usd" + ", " + "Color: Blanco");
    }
    
    private static void sportage(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 8.000" +", "+ "Precio: $15.000usd" +", "+
      "Color: Gris");
      }

    private static void k3(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 2.000" +", "+ "Precio: $30.000usd" +", "+
      "Color: Azul");
    }

    //Opción 4, Mazda ---------------------------------------------------------------------
    private static void mazda(Scanner scanner) {
        System.out.println("1. Mazda 2");
        System.out.println("2. Mazda 3");
        System.out.println("3. Mazda CX-30");
        System.out.print("Seleccione un vehiculo: ");

        int mazda = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (mazda) {
            case 1:
                mazda2(scanner);
                break;
             case 2:
                mazda3(scanner);
                break;
             case 3:
                mazdaCX30(scanner);
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private static void mazda2(Scanner scanner) {
        System.out.println("Informacion del vehiculo: ");
        System.out.println("Kilometros: 0" + ", " + "Precio: $20.000usd" + ", " + "Color: Blanco");
    }
    
    private static void mazda3(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 8.000" +", "+ "Precio: $15.000usd" +", "+
      "Color: Gris");
      }

    private static void mazdaCX30(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 2.000" +", "+ "Precio: $30.000usd" +", "+
      "Color: Azul");
    }

     //Opción 5, Renault ---------------------------------------------------------------------
     private static void renault(Scanner scanner) {
        System.out.println("1. Logan");
        System.out.println("2. Duster");
        System.out.println("3. Sandero");
        System.out.print("Seleccione un vehiculo: ");

        int renault = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (renault) {
            case 1:
                logan(scanner);
                break;
             case 2:
                duster(scanner);
                break;
             case 3:
                sandero(scanner);
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private static void logan(Scanner scanner) {
        System.out.println("Informacion del vehiculo: ");
        System.out.println("Kilometros: 0" + ", " + "Precio: $20.000usd" + ", " + "Color: gris");
    }
    
    private static void duster(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 8.000" +", "+ "Precio: $15.000usd" +", "+
      "Color: blanco");
      }

    private static void sandero(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 2.000" +", "+ "Precio: $30.000usd" +", "+
      "Color: negro");
    }

     //Opción 6, Toyota ---------------------------------------------------------------------
     private static void toyota(Scanner scanner) {
        System.out.println("1. Fortuner");
        System.out.println("2. Corolla");
        System.out.println("3. Four Runner");
        System.out.print("Seleccione un vehiculo: ");

        int toyota = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (toyota) {
            case 1:
                fortuner(scanner);
                break;
             case 2:
                corolla(scanner);
                break;
             case 3:
                fourrunner(scanner);
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private static void fortuner(Scanner scanner) {
        System.out.println("Informacion del vehiculo: ");
        System.out.println("Kilometros: 0" + ", " + "Precio: $20.000usd" + ", " + "Color: gris");
    }
    
    private static void corolla(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 8.000" +", "+ "Precio: $15.000usd" +", "+
      "Color: blanco");
      }

    private static void fourrunner(Scanner scanner) {
      System.out.println("Informacion del vehiculo: ");
      System.out.println("Kilometros: 2.000" +", "+ "Precio: $30.000usd" +", "+
      "Color: negro");
    }

    //Informacion de dinero
    
}
