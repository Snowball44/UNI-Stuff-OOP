
package matadorspillet;

/**
 *
 * @author erso
 */
public abstract class OwnebleField implements FieldInterface{
    private String name;
    private int number;
    private int price;
    private Player owner = null;

    protected OwnebleField(String name, int number, int price)
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

    @Override
    public String toString()
    {
        return "OwnebleField{" + "name=" + name + ", number=" + number 
                + ", price=" + price + ", owner=" + owner + '}';
    }
    
    
    

}
