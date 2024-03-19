/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author gabriel
 */
public abstract class Pokemon {
    protected int pokedexNumber;
    protected String name;    
    protected double weight;
    protected String gender;
    protected int season;
    
    protected abstract void attackTackle();
    protected abstract void attackScratch();
    protected abstract void attackBite();
}
