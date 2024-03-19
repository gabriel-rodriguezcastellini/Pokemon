/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author gabriel
 */
public class Charmander extends Pokemon implements IFire{

    public Charmander() {
    }
    
    @Override
    protected void attackTackle() {
        System.out.println("Hi I'm Charmander and this is my attack tackle");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Hi I'm Charmander and this is my attack scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("Hi I'm Charmander and this is my attack bite");
    }

    @Override
    public void attackFireBlast() {
        System.out.println("Hi I'm Charmander and this is my attack fire blast");
    }

    @Override
    public void attackFlamethrower() {
        System.out.println("Hi I'm Charmander and this is my attack flamethrower");
    }

    @Override
    public void attackBlazeKick() {
        System.out.println("Hi I'm Charmander and this is my attack blaze kick");
    }
}
