/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstclass;

/**
 * Vamos a crear una clase donde guardaremos los datos de un personaje de
 * World of Warcraft
 * @author Klaussius
 */
public class MyFirstClass {

    /**
     * Clase principal
     * @param args no requiere argumentos
     */
    public static void main(String[] args) {
        Character klaussius = new Character();
        klaussius.setName("Klaussius");        
        klaussius.setCharClass("Paladin");
        Character kotick = new Character();
        kotick.setName("Kotick");
        kotick.setCharClass("Druid");
        
        System.out.println(
                kotick.getName() + " conoce a " + klaussius.getName());
    }
    
}
