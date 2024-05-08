/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {
        //TIPOS DE DATOS
        //1.- ENTERO
        //1.1.- DECLARACIÓN CON VALOR
        int numeroUno = 0;
        int numeroDos = 0;
        
        //1.2.- SOBREESCRIBIR EL VALOR
        numeroUno = 19;
        numeroDos = 13;
        
        //SUMA 2 NÚMEROS
        int resultado = numeroUno + numeroDos;
        
        //IMPRIMIR SALIDA DE INFORMACIÓN
        System.out.println("El resultado es: " + resultado);
        
        
        //1.3.- UTILIZACIÓN DE ENTRADAS
        Scanner s = new Scanner(System.in);
        
        //TRANSFORMAR DE DATO PRIMITIVO A OBJETO
        int num1 = Integer.parseInt(s.next());
    }
}
