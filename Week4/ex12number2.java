
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
public class ex12number2 {  
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numBills1 = getResult(console, "John");
        int numBills2 = getResult(console, "Jane");
        System.out.println("John needs " + numBills1 + " bills");
        System.out.println("Jane needs " + numBills2 + " bills");
    }

    public static int getResult(Scanner console, String name) {
        System.out.print("How much will " + name + " be spending? ");
        double amount = console.nextDouble();
        System.out.println();
        int numBills = (int) (amount / 20.0);
        if (numBills * 20.0 < amount) {
            numBills++;
        }
        return numBills;
    }
}
