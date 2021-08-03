/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdyur
 */
public class isVowel {
    public static void main(String[] args) {
        System.out.println(isVowel("b"));
    }
    public static boolean isVowel(String s) {
        return s.equalsIgnoreCase("a") ||  s.equalsIgnoreCase("e") ||
                s.equalsIgnoreCase("i") ||  s.equalsIgnoreCase("o") ||
                s.equalsIgnoreCase("u");        
    }

}
