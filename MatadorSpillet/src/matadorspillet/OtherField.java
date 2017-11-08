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
public class OtherField implements FieldInterface {
    private String name;
    private int number;
    

    public OtherField(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public int getNumber() {
        return this.getNumber();
    }

    @Override
    public void consequence(Player poorPlayer) {
        System.out.println(poorPlayer.getName() + " landed on " + this.getName());
    }
    
}
