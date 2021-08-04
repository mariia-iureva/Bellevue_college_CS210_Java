// CS210 Summer 2021 Assignement #6 "baby names"
// Mariia Iureva
// Baby Names - program that promts user for baby name input and search
// names.txt file for that name. If name exists, program creats a new file
// with statistics of this name usage in 1920-2000 

//no graph this time :(((

import java.io.*;     // for File
import java.util.*;   // for Scanner

public class BabyNames {
    public static void main(String[] args) 
            throws FileNotFoundException {
        // TODO fill in your code

        Scanner namesInput = new Scanner(new File("names.txt"));
        Scanner cs = new Scanner(System.in);
        
        String name = AskForName(cs);
        SearchForName(name, namesInput);
    }
               
        
    public static void SearchForName(String name, Scanner namesInput) 
            throws FileNotFoundException{
        String printStreamFile = name + ".txt";
        boolean searchSuccess = false;

        while (namesInput.hasNextLine()) {
            String line = namesInput.nextLine();
            Scanner lineScan = new Scanner(line);
            String nameFromFile = lineScan.next();
            
            
            if (name.equals(nameFromFile)) {
                PrintStream output = new PrintStream(new File(printStreamFile));
                // a match!
                output.println(name + ",");
                int year = 1920;
                int count = 9;
                int yearRank = lineScan.nextInt();
                for (int i = 0; i < count-1; i++) {                                   
                    System.out.println(year + ": " + yearRank);
                    output.println(year + ": " + yearRank + ",");
                    year += 10;
                    yearRank = lineScan.nextInt();
                }
                System.out.println(year + ": " + yearRank);
                output.println(year + ": " + yearRank);
                searchSuccess = true;
            }
   
        }
        if (!searchSuccess){
            System.out.println("name not found.");
        }
        
        
    }
        
    public static String AskForName(Scanner cs){
        
        System.out.println("** Popularity of a baby name since year 1920 **");
        System.out.print("name? ");
        String name = cs.next();
        name = capitalize(name);
        
        return name;
    }    
  
          
    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    
}

