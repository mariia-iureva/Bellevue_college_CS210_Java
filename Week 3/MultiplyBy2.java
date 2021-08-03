/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdyur
 */
import java.util.*;   

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int number = console.nextInt();
        System.out.println();
        System.out.println(number + " times 2 = " + (number * 2));
    }
}
