/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matadorspillet;

/**
 *
 * @author Kim
 */
public class ShipCompanyField extends OwnableField {
    private int shipPay;
    public ShipCompanyField(int shipPay,String name, int number, int price) {
        super(name, number, price);
        this.shipPay = shipPay;
    }
    
    @Override
    public void consequence(Player poorPlayer) {
        super.consequence(poorPlayer);
        if(this.getOwner() != poorPlayer){
            
            System.out.println(poorPlayer.getName() + " landed on " + poorPlayer.getCurrentField() + "and has to pay " + shipPay);
            poorPlayer.pay(this.getPrice());
            System.out.println("PLAYER BETALTE TEST");
        }
    }
    
    
}
