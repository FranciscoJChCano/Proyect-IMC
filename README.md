Declaración del Paquete

 // package com.bosco;

 Esta línea declara el paquete en el que se encuentra la clase. Los paquetes en Java se usan para organizar clases e interfaces relacionadas.

 Importación de la Clase Scanner

 //import java.util.Scanner;

 Esta línea importa la clase Scanner del paquete java.util. La clase Scanner se usa para leer la entrada del usuario.

 Definición de la Clase

 //public class proyectIMC 

 Esta línea define una clase pública llamada proyectIMC. En Java, el nombre de la clase pública debe coincidir con el nombre del archivo, en este caso proyectIMC.java.

 Método Principal

 //  public static void main(String[] args) 

 El método main es el punto de entrada de cualquier aplicación Java. Aquí es donde comienza la ejecución del programa.

 Inicialización del Scanner

 //Scanner scanner = new Scanner(System.in);

 //Esta línea crea un nuevo objeto Scanner para leer la entrada desde la entrada estándar (el teclado).

 Solicitar y Leer el Peso

//System.out.println("Introduzca su peso en kilogramos (kg): ");
//double weight = scanner.nextDouble();

Estas líneas imprimen un mensaje solicitando al usuario que introduzca su peso en kilogramos, luego leen el valor introducido como un double y lo almacenan en la variable weight.

Solicitar y Leer la Altura

//System.out.println("Introduzca su altura en metros (m): ");
//double height = scanner.nextDouble();

De manera similar, estas líneas imprimen un mensaje solicitando al usuario que introduzca su altura en metros, leen el valor introducido como un double y lo almacenan en la variable height.

Calcular el IMC

//double imc = weight / (height * height);

Esta línea calcula el Índice de Masa Corporal (IMC) usando la fórmula peso / (altura * altura) y almacena el resultado en la variable imc.

Imprimir el IMC

//System.out.println("Su Indice de Masa Corporal es de: " + imc);

Esta línea imprime el valor calculado del IMC en la consola.

Clasificación del IMC

//if (imc < 17.0) {

//System.out.println("Delgadez Severa");

//} else if (imc < 18.5) {

//System.out.println("Delgadez moderada");

//} else if (imc < 25) {

//System.out.println("Peso normal");

//} else if (imc < 30) {

//System.out.println("Sobrepeso");

//} else if (imc < 35) {

//System.out.println("Obesidad Leve");

//} else if (imc < 40) {

//System.out.println("Obesidad Moderada");

//} else if (imc < 45) {

//System.out.println("Obesidad Morbida");

//}

Este bloque de código verifica el valor del imc y imprime la categoría correspondiente basada en el rango en el que se encuentra el imc. Las categorías van desde "Delgadez Severa" hasta "Obesidad Mórbida".

Cerrar el Scanner

//scanner.close();

Esta línea cierra el objeto Scanner para liberar los recursos que estaba utilizando. Es una buena práctica cerrar el Scanner cuando ya no se necesita.

El programa calcula y muestra el Índice de Masa Corporal (IMC) de un usuario basándose en su peso y altura ingresados. Luego, clasifica el IMC en una de varias categorías y muestra la categoría correspondiente en la consola.

