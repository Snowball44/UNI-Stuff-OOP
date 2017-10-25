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
public class Dice {
    
    private int die1;
    private int die2;
    private boolean dieEqual;
    
    //Contruct

    public Dice() {
        
        
        
    }
    
    
    
    //Methods
    
    public int throwDice(){
        
        die1 = (int)(1 + Math.random() * 6);
        die2 = (int)(1 + Math.random() * 6);
        
        return die1 + die2;
    }
    
    public boolean isDieEqual(){
        if(die1 == die2){
            dieEqual = true;
        }
        else{
            dieEqual = false;
        }
        return dieEqual;
    }
}
