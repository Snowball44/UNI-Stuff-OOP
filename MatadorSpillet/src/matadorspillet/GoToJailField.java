package matadorspillet;

/**
 *
 * @author erso
 */
public class GoToJailField implements FieldInterface
{

    private String name;
    private int number;

    public GoToJailField(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getNumber()
    {
        return number;
    }

    @Override
    public void consequense(Player poorPlayer)
    {
        poorPlayer.setCurrentField(MonopolyConstants.JAIL_POS);
        
    }

    @Override
    public String toString()
    {
        return "GoToJailField{" + "name=" + name + ", number=" + number + '}';
    }
    
    

}
