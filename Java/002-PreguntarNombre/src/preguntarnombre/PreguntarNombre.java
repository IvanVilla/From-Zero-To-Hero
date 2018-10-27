/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntarnombre;

import java.util.Scanner;

/**
 * Clase para preguntar nombre
 * @author Klaussius
 */
public class PreguntarNombre {

    public static void main(String[] args) {
    // Pregunto el nombre y lo imprimo en un saludo 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Escribe tu nombre: ");
    String nombre = keyboard.nextLine();
    System.out.println("Hola " + nombre);
    }
    
}
