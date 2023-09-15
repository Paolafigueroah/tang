/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 * Inicia el programa y limpia la cadena de números,identifica el código de area de cada lugar.
 * @author Paola Figueroa
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los números telefonicos ");
        String oracion = entrada.nextLine();
          
        String nuevaOracion = oracion.replace("(", "").replace(")", "").replace("-", "");
        System.out.println(nuevaOracion);
        
        String entradaNumeros = entrada.nextLine();
        String[] numeros = entradaNumeros.split(" ");

        int tijuana = 0;
        int hermosillo = 0;
        int guaymas = 0;
        int desconocido = 0;
      
        for (String numero : numeros) {  
     
            if (numero.startsWith("664")) {
                tijuana++;
            } else if (numero.startsWith("662")) {
                hermosillo++;
            } else if (numero.startsWith("622")) {
                guaymas++;
            } else {
                desconocido++;
            }
        }
        System.out.println("Hay "+tijuana+" números de Tijuana");
        System.out.println("Hay "+hermosillo+" números de Hermosillo");
        System.out.println("Hay "+tijuana+" números de Guaymas");
        System.out.println("Hay "+tijuana+" números con código de área desconocido");
  } 
}