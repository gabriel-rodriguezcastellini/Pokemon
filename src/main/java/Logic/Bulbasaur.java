/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author gabriel
 */
public class Bulbasaur extends Pokemon implements IPlant{

    public Bulbasaur() {
    }
    
    @Override
    protected void attackTackle() {
        System.out.println("Hi I'm Balbasaur and this is my attack tackle");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Hi I'm Balbasaur and this is my attack scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("Hi I'm Balbasaur and this is my attack bite");
    }

    @Override
    public void attackFrenzyPlant() {
        System.out.println("Hi I'm Balbasaur and this is my attack frenzy plant");
    }

    @Override
    public void attackSappySeed() {
        System.out.println("Hi I'm Balbasaur and this is my attack sappy seed");
    }
    
}
