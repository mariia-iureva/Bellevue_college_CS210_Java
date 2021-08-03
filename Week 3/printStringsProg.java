/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdyur
 */
public class printStringsProg {
    public static void main(String[] args) {
        printStrings("abc", 5);
    }
        
    public static void printStrings(String text, int n){
    //that accepts a String and a number of repetitions as parameters 
    //and prints that String the given number of times with a space after each time. 
        for (int i = 1; i <= n; i++) {
            System.out.print(text + " ");
        }
    }
}
