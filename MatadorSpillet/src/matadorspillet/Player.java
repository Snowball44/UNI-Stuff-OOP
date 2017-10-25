/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matadorspillet;

/**
 *
 * @author Kim Christensen
 */
public class Player {

    private String name;
    private Field currentField;
    private Boolean hasWon;

    public Player(String name, Field currentField, Boolean hasWon) {
        this.name = name;
        this.currentField = currentField;
        this.hasWon = hasWon;
    }

    public Boolean getHasWon() {
        return hasWon;
    }

    public Field getCurrentField() {
        return currentField;
    }

    public void move(Dice die) {
        do {
            int steps = die.throwDice();
            int die1 = die.getDie1();
            System.out.println("Die 1 is " + die1);
            int die2 = die.getDie2();
            System.out.println("Die 2 is " + die2);
            int currentPos = currentField.getNumber();
            if (currentPos + steps < 40) {
                currentField = Driver.fieldArray[steps + currentPos-1];
                System.out.println("The player threw a total of " + steps + " and is now at " + currentField.toString());
                if (die.isDieEqual() == true) {
                    System.out.println("Both die equal. Extra throw");
                }
            } else {
                hasWon = true;
                System.out.println("The player throws " + steps + " and wins ");
            }
        } while (die.isDieEqual() == true && hasWon != true);
    }

}
