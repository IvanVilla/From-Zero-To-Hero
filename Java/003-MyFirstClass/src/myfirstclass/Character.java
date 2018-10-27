/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstclass;

/**
 * Vamos a crear una ficha en blanco de un personaje de World of Warcraft
 * @author Klaussius
 */
public class Character {
    
    private String faction; //Almacena la facción: horda o alianza
    private String race; //Almacena la raza
    private String charClass; //Almacena la clase
    private String name; //Almacena el nombre
    private int age; //Almacena la edad
    private int gold; //Almacena el oro
    
    /**
     * Incrementa la edad en uno
     */
    public void increaseAge(){
        this.age = this.age + 1;
    }

    // Getters and setters
    public String getFaction() {
        return faction;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
