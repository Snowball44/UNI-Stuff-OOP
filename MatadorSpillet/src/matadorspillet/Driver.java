/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matadorspillet;

import java.util.ArrayList;

/**
 *
 * @author Kim Christensen
 */
public class Driver {
    public static Field[] fieldArray = new Field[40];
    public static void main(String[] args) {
        
       
        for(int i = 0; i < fieldArray.length;i++){
            fieldArray[i] = new Field("test"+i+1,i+1);
        }
        
        Player player1 = new Player("Kim",fieldArray[0]);
        Player player2 = new Player("David",fieldArray[0]);
        
        
    }
}
