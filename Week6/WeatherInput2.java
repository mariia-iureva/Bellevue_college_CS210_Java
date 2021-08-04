/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;    // for File
import java.util.*;  // for Scanner

/**
 *
 * @author mdyur
 */
public class WeatherInput2 {
    
// Displays changes in temperature from data in an input file.

    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("src\\main\\java\\weather2.txt"));
        double prev = input.nextDouble();   // fencepost
        while (input.hasNext()) {
            if (input.hasNextDouble()) {   
                double next = input.nextDouble();
                System.out.println(prev + " to " + next +
                        ", change = " + (next - prev));
                prev = next;

            } else {
                input.next();  // throw away unwanted token
            }
        }
    }
}
