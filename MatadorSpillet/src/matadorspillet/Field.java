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
public class Field {
    
    private String name;
    private int number;

    public Field(String name, int number) {
        if(number > 0 && number <= 42){
        this.name = name;
        this.number = number;
        }
        else{
            System.out.println("Please enter a number between 1 and 42");
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public String toString(){
        return name + number;
    }
    
}
