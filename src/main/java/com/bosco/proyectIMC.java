package com.bosco;

import java.util.Scanner;

public class proyectIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su peso en kilogramos (kg): ");
        short weight = scanner.nextDouble();

        System.out.println("Introduzca su altura en metros (m): ");
        short height = scanner.nextDouble();


        short imc = weight / (height * height);

        System.out.println("Su Indice de Masa Corporal es de: " + imc);

        if (imc < 17.0) {
            System.out.println("Tiene un muy bajo peso");
        } else if (imc < 18.5) {
            System.out.println("Tiene bajo peso");
        } else if (imc < 25) {
            System.out.println("Tiene un peso normal");
        } else if (imc < 30) {
            System.out.println("Tiene sobrepeso");
        } else if (imc < 40) {
            System.out.println("Tiene obesidad");
        }

        scanner.close();

    }
}