// CS210 Summer 2021 Assignment #7 "Personality Test"
// Mariia Iureva

// Personality test - The Keirsey Temperament Sorter (keirsey.com) 
// is a test that measures four independent dimensions of your personality
//

import java.io.*;     // for File
import java.util.*;   // for Scanner


public class PersonalityTest {
    
    public static  final int DIMENSIONS = 4;//the number of personality dimensions

    public static void main(String[] args) 
            throws FileNotFoundException {
	//printing intro 
        System.out.println("** This program reports the results for Keirsey Personality Test **\n");
        //reading input
        Scanner personalityTestInput = new Scanner(new File("personality.txt"));
        
        while (personalityTestInput.hasNextLine()) {
        //creating strings with user data: first line - name, second line answers
            String name = personalityTestInput.nextLine();
            String line = personalityTestInput.nextLine();
            
        // counting As and Bs and putting it into array with 4 items
            int[] countAs = countAB(line, 'a');
            int[] countBs = countAB(line, 'b');
            
        // creating a string in a form  [nA-nB..] for the final output
            String answersString = answersToString(countAs, countBs);
            
        // Calculating B percentage
            int[] bPercentage = getPercentageB(countAs, countBs);
            
        // Getting personality result
            String personality_type = personality_type(bPercentage);
            
        // Printing out results
            print_output(name, answersString, bPercentage, personality_type);
        }
    }
    
    
    private static int[] countAB(String line, char type) {
        // loop through line, store count of the type in an array
        int[] countArray = new int[DIMENSIONS];
        for (int i = 0; i < line.length(); i++) {
            char ans = Character.toLowerCase(line.charAt(i));
            if (ans == type) {
                if ((i + 1) % 7 == 1) {
                    countArray[0]++;
                }
                if ((i + 1) % 7 == 2 || (i + 1) % 7 == 3) {
                    countArray[1]++;
                }
                if ((i + 1) % 7 == 4 || (i + 1) % 7 == 5) {
                    countArray[2]++;
                }
                if ((i + 1) % 7 == 0 || (i + 1) % 7 == 6) {
                    countArray[3]++;
                }
            }
        }
        return countArray;
        }
            
    private static int[] getPercentageB(int[] aType, int[] bType) {
        // loop through a and b concurrently
        int[] percentageArray = new int[DIMENSIONS];
        for (int i = 0; i < DIMENSIONS; i++) {
        // store the percentage of b in an array
            percentageArray[i] = (int) Math.round(100 * bType[i] / (aType[i] + bType[i]));
        }
        return percentageArray;
           
    }    
    
    public static String personality_type(int[] arr){
        //assigns the letters based on the given array from getPercentageB()
        //which is dependent on %B answers from countAB()
        String personalityResult = "";

        String[] ifSmallerThan50 = {"E", "S", "T", "J"};
        String[] ifBiggerThan50 = {"I", "N", "F", "P"};

        for(int i = 0; i < DIMENSIONS; i++){
        if(arr[i] < 50){
        personalityResult += ifSmallerThan50[i];
        } else if (arr[i] > 50){
        personalityResult += ifBiggerThan50[i];
        } else {
        personalityResult += "X";
        }
        }
        return personalityResult;
            

    }
    
    public static String answersToString(int[] aAnswers, int[] bAnswers) {
        String result = "";
        for (int i = 0; i < DIMENSIONS; i++){
            result += aAnswers[i] + "A-" + bAnswers[i] + "B,";            
        }
    return result;
    }
    
    public static void print_output(String name, String answers, 
            int[] bPercentage, String personality_type){
        System.out.println(name + ":");
        System.out.println("answers: [" + answers + "]");
        System.out.println("percent B: " + Arrays.toString(bPercentage));
        System.out.println("type: " + personality_type);
        System.out.println();
        
    }
}