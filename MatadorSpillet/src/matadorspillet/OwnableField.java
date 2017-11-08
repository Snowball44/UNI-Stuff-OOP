
package matadorspillet;

import java.util.Scanner;

/**
 *
 * @author erso
 */
public abstract class OwnableField implements FieldInterface{
    private int payField;
    private String name;
    private int number;
    private int price;
    private boolean isPawned = false;
    private boolean buyChoice;
    private Player owner = null;
    Scanner input = new Scanner(System.in);
    private char choice;
    protected OwnableField(String name, int number, int price)
    {
        
        this.name = name;
        this.number = number;
        this.price = price;
    }
/**
     * @return the payField
     */
    public int getPayField() {
        return payField;
    }

    /**
     * @param payField the payField to set
     */
    public void setPayField(int payField) {
        this.payField = payField;
    }
    //@Override
    public String getName(){
        return name;
    }

    //@Override
    public int getNumber()
    {
        return number;
    }

    public int getPrice()
    {
        return price;
    }

    public Player getOwner()
    {
        return owner;
    }

    public void setOwner(Player owner)
    {
        this.owner = owner;
    }
    
    public void setisPawned(boolean isPawned){
        this.isPawned = isPawned;
    }
    @Override 
    public void consequence(Player poorPlayer){
        if(this.getOwner()==poorPlayer){
            System.out.println(poorPlayer.getName()+ " already owns this field");
        }
        else if(this.getOwner() == null){
            System.out.println("Do you wish to buy this field? Please enter y or n");
            char choice = input.next().charAt(0);
            
            if(choice == 'y'){
                poorPlayer.buyField(this);
                buyChoice = true;
            }
            else {
                System.out.println("You chose not to buy this field");
                buyChoice = false;
            }
        }
        
        
    }
    @Override
    public String toString()
    {
        return "OwnebleField{" + "name=" + name + ", number=" + number 
                + ", price=" + price + ", owner=" + (owner == null ? "" : owner.getName()) + '}';
    }
}
