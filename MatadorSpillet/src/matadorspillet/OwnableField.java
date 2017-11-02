
package matadorspillet;

/**
 *
 * @author erso
 */
public abstract class OwnableField implements FieldInterface{
    private String name;
    private int number;
    private int price;
    private boolean isPawned = false;
    private Player owner = null;

    protected OwnableField(String name, int number, int price)
    {
        this.name = name;
        this.number = number;
        this.price = price;
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
    public String toString()
    {
        return "OwnebleField{" + "name=" + name + ", number=" + number 
                + ", price=" + price + ", owner=" + owner + '}';
    }
    
    
    

}
