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
public class BreweryField extends OwnableField {
    
private Dice dice;

    public BreweryField(Dice dice,String name, int number, int price) {
        super(name, number, price);
        this.dice = dice;
    }

    
    @Override
    public void consequence(Player poorPlayer) {
        super.consequence(poorPlayer);
        
        if(this.getOwner() != poorPlayer){
            System.out.println(poorPlayer.getName() + "landed on " + poorPlayer.getCurrentField() + "and has to pay " + poorPlayer.getSteps());
            poorPlayer.pay(poorPlayer.getSteps());
            System.out.println("PLAYER BETALTE TEST");
        }
    }
    
    
}
