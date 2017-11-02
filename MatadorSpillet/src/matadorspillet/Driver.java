/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matadorspillet;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.text.html.HTML;

/**
 *
 * @author Kim Christensen
 */
public class Driver {

    //Making our fieldArray accessible multiple places
    public static Field[] fieldArray = new Field[40];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Filler data for the array
        for (int i = 0; i < fieldArray.length; i++) {
            fieldArray[i] = new Field("test" + (i + 1), (i + 1));
        }

        //Creating dice the players 
        Dice dice1 = new Dice();
        //Creating two players
        Player player1 = new Player("Kim", fieldArray[0], false);
        Player player2 = new Player("David", fieldArray[0], false);
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
}
