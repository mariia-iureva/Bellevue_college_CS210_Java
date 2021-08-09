/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author mdyur
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] array1 = {11, 42, -5, 27, 0, 89};
        int[] array2 = reverse(array1);
        System.out.println("array2 " + Arrays.toString(array2));
    }
    
    
    public static int[] reverse(int[] numbers){
        
        for (int i = 0; i < numbers.length / 2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length - 1 - i];
                numbers[numbers.length - 1 - i] = temp;    
        }
        return numbers;
    }
}
