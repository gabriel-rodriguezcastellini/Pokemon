/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author gabriel
 */
public class Pikachu extends Pokemon implements IElectric{

    public Pikachu() {
    }
    
    @Override
    protected void attackTackle() {
        System.out.println("Hi I'm Pikachu and this is my attack tackle");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Hi I'm Pikachu and this is my attack scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("Hi I'm Pikachu and this is my attack bite");
    }

    @Override
    public void attackThunderShock() {
        System.out.println("Hi I'm Pikachu and this is my attack thunder shock");
    }

    @Override
    public void attackThunderbolt() {
        System.out.println("Hi I'm Pikachu and this is my attack thunderbolt");
    }
}
