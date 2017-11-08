/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matadorspillet;

import java.util.ArrayList;

/**
 *
 * @author Kim Christensen
 */
public class Player {

    private String name;
    private FieldInterface currentField;
    private ArrayList<OwnableField> ownsList = new ArrayList<>();
    private int money = MonopolyConstants.START_MONEY;
    private int currentPos = 1;
    private int steps;
    private Boolean hasWon;
    

    public Player(String name, FieldInterface currentField, Boolean hasWon) {
        this.name = name;
        this.currentField = currentField;
        this.hasWon = hasWon;
    }

    public Boolean getHasWon() {
        return hasWon;
    }

    public FieldInterface getCurrentField() {
        return currentField;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getSteps(){
        return steps;
    }

    public void setCurrentField(int currentPos){
        this.currentPos = currentPos;
        currentField = Driver.fieldArray[this.currentPos];
    }
    public void move(Dice die) {
        do {
            int steps = die.throwDice();
            int die1 = die.getDie1();
            System.out.println("Die 1 is " + die1);
            int die2 = die.getDie2();
            System.out.println("Die 2 is " + die2);
            
            
             
                currentField = Driver.fieldArray[(steps + currentPos - 1) % Driver.fieldArray.length];
                if(currentPos + steps > 40 ){
                    setMoney(getMoney() + MonopolyConstants.PASSING_START);
                    System.out.println("PENGE OVER START TEST");
                    System.out.println("Player money is now " + getMoney());
                }
                currentPos = currentField.getNumber() % Driver.fieldArray.length;
                System.out.println("The player threw a total of " + steps + " and is now at " + currentField.toString());
                currentField.consequence(this);
                System.out.println("Current position is " + currentPos);
                
                if (die.isDieEqual() == true) {
                    System.out.println("Both die equal. Extra throw");
                }
            
            
        } while (die.isDieEqual() == true && hasWon != true);
    }

    public void pay(int pay) {
        setMoney(getMoney() - pay);
    }

    public void sell(int sell) {
        setMoney(getMoney() + sell);
    }

    public void buyField(OwnableField ownable) {
        if (getMoney() >= ownable.getPrice()) {
            pay(ownable.getPrice());
            this.ownsList.add(ownable);
            ownable.setOwner(this);
        } else {
            System.out.println("You cannot afford this property");
        }
    }

    public void pawnField(OwnableField ownable) {
        if (this.ownsList.contains(ownable)) {
            sell(ownable.getPrice() / 2);
            ownable.setisPawned(true);
        } else {
            System.out.println("You cannot pawn a property you do not have");
        }
    }

    /**
     * @return the money
     */
    public int getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(int money) {
        this.money = money;
    }
}
