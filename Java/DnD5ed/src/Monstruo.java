/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Klaussius
 */
public class Monstruo {

    private String nombre;
    private String alineacion;
    private int armadura;
    private int puntosDeVida;
    private int fuerza;
    private int destreza;
    private int constitucion;
    private int inteligencia;
    private int sabiduria;
    private int carisma;

    /**
     * Constructor de la clase
     * @param nombre
     * @param alineacion
     * @param armadura categoría de armadura
     * @param puntosDeVida vida actual del monstruo
     * @param fuerza
     * @param destreza
     * @param constitucion
     * @param inteligencia
     * @param sabiduria
     * @param carisma
     */
    public Monstruo(String nombre, String alineacion, int armadura,
            int puntosDeVida, int fuerza, int destreza, int constitucion,
            int inteligencia, int sabiduria, int carisma) {
        this.nombre = nombre;
        this.alineacion = alineacion;
        this.armadura = armadura;
        this.puntosDeVida = puntosDeVida;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.carisma = carisma;
    }
    
    /**
     * Devuelve el nombre y alineación del monstruo
     * @return nombre, alineacion
     */
    public String mostrarMonstruo() {
        String descripcion = "";
        descripcion = descripcion + "Nombre: " + this.nombre + "\n";
        descripcion = descripcion + "Alineación: " + this.alineacion;
        return descripcion;
    }
    
    /**
     * Esto le quita vida al bicho
     * @param damage daño que recibe
     * @return vida que le queda
     */
    public void quitarVida(int damage){
        this.puntosDeVida = this.puntosDeVida - damage;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public int getCarisma() {
        return carisma;
    }

}
