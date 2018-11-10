/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicalculadora;

/**
 * Tarea: crear una minicalculadora
 * @author Klaussius
 */
public class MiniCalculadora {

    /**
     * Hace un test con la calculadora, más abajo están las funciones que hay
     * que completar
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Suma
        int suma1 = 21;
        int suma2 = 21;
        int sumaTotal = sumar(suma1, suma2);
        System.out.println("Suma = " + sumaTotal);
        // Resta
        int resta1 = 63;
        int resta2 = 21;
        int restaTotal = restar(resta1, resta2);
        System.out.println("Resta = " + restaTotal);
        // Multipolicar
        int multiplica1 = 21;
        int multiplica2 = 2;
        int multiplicaTotal = restar(multiplica1, multiplica2);
        System.out.println("Multiplicación = " + multiplicaTotal);        
    }
    
    // TODO... Completar las siguientes funciones
    
    /**
     * Esta función suma números
     * @param n1 número 1
     * @param n2 número 2
     * @return int, suma de n1 y n2
     */
    public static int sumar(int n1, int n2){
        // Pon aquí tu código...
        
        int result = 0;
        return result;
    }
    /**
     * Esta función resta números
     * @param n1
     * @param n2
     * @return int, resultaodo de restar n2 a n1
     */
    public static int restar (int n1, int n2){
        // Pon aquí tu código...
        
        int result = 0;
        return result;        
    }
    
    /**
     * Esta función multiplica números
     * @param n1
     * @param n2
     * @return int, resultaodo de restar n2 a n1
     */
    public static int multiplicar (int n1, int n2){
        // Pon aquí tu código...
        
        int result = 0;
        return result;
    }
    
}
