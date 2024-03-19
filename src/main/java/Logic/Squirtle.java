/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author gabriel
 */
public class Squirtle extends Pokemon implements IWater{

    public Squirtle() {
    }
    
    
    @Override
    protected void attackTackle() {
        System.out.println("Hi I'm Squirtle and this is my attack tackle");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Hi I'm Squirtle and this is my attack scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("Hi I'm Squirtle and this is my attack bite");
    }

    @Override
    public void attackHydroCannon() {
        System.out.println("Hi I'm Squirtle and this is my attack hydro cannon");
    }

    @Override
    public void attackBubble() {
        System.out.println("Hi I'm Squirtle and this is my attack bubble");
    }

    @Override
    public void attackHydroPump() {
        System.out.println("Hi I'm Squirtle and this is my attack hydro pump");
    }
}
