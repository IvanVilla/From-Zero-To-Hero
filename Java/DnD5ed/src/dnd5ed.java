/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Klaussius
 */
public class dnd5ed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Definimos un monstruo llamado beholder
        Monstruo beholder = new Monstruo(
                "Beholder", "Legal Malvado", 18, 189, 10, 14, 18, 17, 15, 17
        );
        
        System.out.println("Antes del golpe:" + beholder.getPuntosDeVida());
        beholder.quitarVida(20);
        System.out.println("Después del golpe:" + beholder.getPuntosDeVida());
        
        Monstruo goblin = new Monstruo (
                "Goblin", "Neutral Malvado", 15, 7, 8, 14, 10, 10, 8, 8
        );
        // Muestra datos de los monstruos
        System.out.println(beholder.mostrarMonstruo());
        System.out.println(goblin.mostrarMonstruo());
    }
    
}
