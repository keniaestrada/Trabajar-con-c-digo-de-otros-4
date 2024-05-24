package com.generation;

import java.util.Scanner;

public class PublicaCodigo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Turno del jugador 1
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine().toLowerCase();

        // Turno del jugador 2
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine().toLowerCase();

        // Comprobar si hay empate
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            // Determinar el ganador
            int g = 2; // Por defecto gana el jugador 2

            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1; // Gana el jugador 1
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1; // Gana el jugador 1
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1; // Gana el jugador 1
                    }
                    break;
                default:
                    System.out.println("Entrada inválida por parte del jugador 1");
                    return;
            }
            System.out.println("Gana el jugador " + g);
        }

        scanner.close();
    }
}

