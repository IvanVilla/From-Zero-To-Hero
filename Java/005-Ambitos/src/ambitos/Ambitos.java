/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambitos;

/**
 *
 * @author Klaussius
 */
public class Ambitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre_persona = "Turalyon";
        nombre_persona = dime_nombre(nombre_persona);
        System.out.println(nombre_persona);      
        String persona_1 = "Larg";
        String persona_2 = "Vixie";
        int invitados = 8;
        System.out.println(casar_a_la_fuerza(persona_1, invitados, persona_2));
        String humano = "ASMODES";
        System.out.println(portal(humano));
        
    }
    
    public static String dime_nombre(String nombre){
        nombre = nombre.toUpperCase();
        return nombre;
    }
    
    public static String casar_a_la_fuerza(String marido, int invitados, String mujer){
        return "Se han casao " + marido + " y " + mujer + " y hubo " + invitados + " invitados.";
    }
    
    public static String portal(String terricola){
        terricola = terricola.toLowerCase();
        return terricola + " es un terricola";
    }
    
}
