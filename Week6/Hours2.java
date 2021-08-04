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
public class Hours2 {
    
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner hoursInput = new Scanner(new File("src\\main\\java\\hours.txt"));
        PrintStream output = new PrintStream(new File("hours_out.txt"));
        //double prev = hoursInput.nextDouble();   // fencepost
        while (hoursInput.hasNextLine()) {
            String line = hoursInput.nextLine();
            processEmployee(line, output);
        }
    }
    
    public static void processEmployee(String line, PrintStream output) 
            throws FileNotFoundException{
        Scanner lineScan = new Scanner(line);
        int id = lineScan.nextInt();
        String name = lineScan.next();

        //double prevHour = lineScan.nextDouble();

        int count = 0;
        double hoursSum = 0.00;
        while (lineScan.hasNextDouble()) {   
            hoursSum += lineScan.nextDouble();
            count++;
        }
        double averageHour = hoursSum / count;

        output.print(name + " (#" + id);
        output.printf(" worked %.2f hours %.2f hours/day)\n",hoursSum, averageHour);
    }
}


