/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdyur
 */
public class ex4 {
    public static void main(String[] args) {
        printOdds(3);
        printOdds(17 / 2);

        int x = 25;
        printOdds(37 - x + 1);
    }

    public static void printOdds(int n) {
        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd + " ");
        }
        System.out.println();
    }
}