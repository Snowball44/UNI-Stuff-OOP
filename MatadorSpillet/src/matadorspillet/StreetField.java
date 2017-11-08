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
public class StreetField extends OwnableField {
    private int payField;
    public StreetField(int payField,String name, int number, int price){
        super(name, number, price);
        this.payField = payField;
    }
    
    

    @Override
    public void consequence(Player poorPlayer) {
        super.consequence(poorPlayer);
        if(super.getOwner()!=poorPlayer && super.getOwner()!=null){
            poorPlayer.pay(super.getPrice());
            super.getOwner().setMoney(super.getOwner().getMoney()+ super.getPayField());
        }
        
        
    }
    
}
