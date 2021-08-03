
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdyur
 */
public class Lotto {
    // Draws 10 lotto numbers; returns true if one is 7.
    public static void main(String[] args) {
        Random rand = new Random();
        while (!seven(rand)) {
            System.out.println(seven(rand));    
        } 
            
    }
    public static boolean seven(Random rand) {
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(30) + 1;
            System.out.print(num + " ");

            if (num == 7) {    // found lucky 7; can exit now
                return true;
            }
        

            
        }
        return false;  // if we get here, there was no 7

    
    }
}
