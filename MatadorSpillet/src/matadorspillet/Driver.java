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

    //Making our fieldArray accessible multiple places
    public static OwnableField[] fieldArray = new OwnableField[40];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Creating dice the players 
        Dice dice1 = new Dice();
        //Creating two players
        Player player1 = new Player("Kim", fieldArray[0], false);
        Player player2 = new Player("David", fieldArray[0], false);
        //Creating our fields
        Driver.fillFields();
        //Creating a loop which makes players throw dice until they pass field 40
        while (true) {

            //The players throw each their dice
            System.out.println("Player 1 throws ");
            System.out.println("Please type y or n if you wish to throw");
            char choice = input.next().charAt(0);
            player1.move(dice1);
            if(player1.getHasWon()==true){
                break;
            }
            System.out.println("Player 2 throws");
            player2.move(dice1);
            if(player2.getHasWon()==true){
                break;
            }
            if(choice == 'n'){
                break;
            }
        }

        //Who won?
        if (player1.getHasWon() == true) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }

    }
    public void fillFields(){
            for (int i = 0; i < fieldArray.length; i++) {
                switch(i+1){
                    case 1: fieldArray[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i],i+1);
                    break;
                    case 3: System.out.println("Test 3");
                    break;
                    case 5: System.out.println("Test 5");
                    break;
                    case 8: System.out.println("test start");
                    break;
                    case 11: System.out.println("test start");
                    break;
                    case 18: System.out.println("test start");
                    break;
                    case 21: System.out.println("test start");
                    break;
                    case 23: System.out.println("test start");
                    break;
                    case 34: System.out.println("test start");
                    break;
                    case 37: System.out.println("test start");
                    break;
                    case 39: System.out.println("test start");
                    break;
                    case 31: fieldArray[i] = new GoToJailField(MonopolyConstants.FIELD_NAMES[i], i+1); //jail
                    break;
                    case 6: System.out.println("test start"); //Shipping
                    break;
                    case 16: System.out.println("test start");
                    break;
                    case 26: System.out.println("test start");
                    break;
                    case 36: System.out.println("test start");
                    break;
                    case 13: Driver.fieldArray[i] = new BreweryField( MonopolyConstants.FIELD_NAMES[i],i+1,150); //Brewery
                    break;
                    case 29: System.out.println("brwwery");
                    break;
                    default: Driver.fieldArray[i] = new StreetField(3 * i,MonopolyConstants.FIELD_NAMES[i],i + 1,10 * i); //Streets
                }
            }
        }
}
