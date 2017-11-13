/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matadorspillet;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Kim Christensen
 */
public class Driver {

    //Creating 40 fields that inherit from FieldInterface
    public static FieldInterface[] fieldArray = new FieldInterface[40];
    public static Dice dice1 = new Dice();
    public int numOfPlayers;
    
    public Driver(int numOfPlayers){
      this.numOfPlayers = numOfPlayers;
      
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Driver driver1 = new Driver(2);
        //Creating our fields
        driver1.fillFields();
        //Creating our players
        driver1.createPlayer("Kim");
        driver1.createPlayer("David");
    }
    
 
    
    public void createPlayer(String name){
        Player player1 = new Player(name);
        
    }
    
    public void fillFields(){
            for (int i = 0; i < fieldArray.length; i++) {
                switch(i+1){
                    case 1: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 3: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 5: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 8: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 11: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 18: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 21: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 23: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 34: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 37: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 39: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 31: fieldArray[i] = new GoToJailField(MonopolyConstants.FIELD_NAMES[i], i+1); //jail
                    break;
                    case 6:  fieldArray[i] = new ShipCompanyField(50, MonopolyConstants.FIELD_NAMES[i],i+1,200); //Shipping
                    break;
                    case 16: fieldArray[i] = new ShipCompanyField(50, MonopolyConstants.FIELD_NAMES[i],i+1,200);
                    break;
                    case 26: fieldArray[i] = new ShipCompanyField(50, MonopolyConstants.FIELD_NAMES[i],i+1,200);
                    break;
                    case 36: fieldArray[i] = new ShipCompanyField(50, MonopolyConstants.FIELD_NAMES[i],i+1,200);
                    break;
                    case 13: Driver.fieldArray[i] = new BreweryField(dice1, MonopolyConstants.FIELD_NAMES[i],i+1,150); //Brewery
                    break;
                    case 29: Driver.fieldArray[i] = new BreweryField(dice1, MonopolyConstants.FIELD_NAMES[i],i+1,150);
                    break;
                    default: Driver.fieldArray[i] = new StreetField(3 * i,MonopolyConstants.FIELD_NAMES[i],i + 1,10 * i); //Streets
                }
            }
        }
}
