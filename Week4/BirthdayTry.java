
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdyur
 */
public class BirthdayTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two numbers: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        sc.close(); 
        System.out.println("First number is " + a + " and second number is " + b); 
    }   
}
