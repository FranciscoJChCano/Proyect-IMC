package com.bosco;

import java.util.Scanner;

public class proyectIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su peso en kilogramos (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Introduzca su altura en metros (m): ");
        double height = scanner.nextDouble();


        double imc = weight / (height * height);

        System.out.println("Su Indice de Masa Corporal es de: " + imc);

        if (imc < 17.0) {
            System.out.println("Delgadez Severa");
        } else if (imc < 18.5) {
            System.out.println("Delgadez moderada");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidad Leve");
        } else if (imc < 40) {
            System.out.println("Obesidad Moderada");
        } else if (imc < 45) {
            System.out.println("Obesidad Morbida");
        }

    scanner.close();

    }
}