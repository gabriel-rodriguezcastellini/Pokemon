/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logic;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        
        squirtle.attackBite();
        squirtle.attackBubble();
        charmander.attackBite();
        charmander.attackBlazeKick();
        bulbasaur.attackBite();
        bulbasaur.attackFrenzyPlant();
        pikachu.attackBite();
        pikachu.attackScratch();
    }
}
