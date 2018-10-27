/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 * Ejemplos de teoría del día 2
 * @author Klaussius
 */
public class Examples002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar o definir una variable en JAVA:
        int numero_1;
        int numero_2;
        int resultado_1;
        numero_1 = 3;
        numero_2 = 2;
        resultado_1 = numero_1 - numero_2;
        System.out.println(resultado_1);
        // Probando con texto:
        String nombre_1;
        nombre_1 = "Klaussius";
        System.out.println(nombre_1);
        // Asignando a la vez que definiendo:
        int numero_3 = 3;
        int numero_4 = 2;
        int resultado_2 = numero_3 - numero_4;
        System.out.println(resultado_2);
        // Cambiando el valor de una variable
        String nombre_2 = "Klaussius";        
        System.out.println(nombre_2);
        nombre_2 = "Sombrero";
        System.out.println(nombre_2);
        // Definir métod JAVA... más abajo definimos la función fuera del ámbito
        // del método MAIN, pero dentro del ámbito de la clase Examples002
        int numero_5 = 43;
        int numero_6 = 1;
        System.out.println(restar(numero_5, numero_6));
    }
    /**
     * Función que resta dos números, hay que usar el static porque es un
     * requisito de JAVA cuando se definen funciones en la clase principal
     * @param numero_1 primer parámetro
     * @param numero_2 segundo parámetro
     * @return resultado de la resta
     */
    public static int restar(int numero_1, int numero_2){
        int resultado = numero_2 - numero_1;
        return resultado;
}
    
    
    
}
