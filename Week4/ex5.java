/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mdyur
 */
public class ex5 {
    public static void main(String[] args) {
        ifElseMystery1(3, 20);
        ifElseMystery1(4, 5);
        ifElseMystery1(5, 5);
        ifElseMystery1(6, 10);
    }
    public static void ifElseMystery1(int x, int y) {
        int z = 4;
        if (z <= x) {
            z = x + 1;
        } else {
            z = z + 9;
        }
        if (z <= y) {
            y++;
        }
        System.out.println(z + " " + y);
    
    }
}
