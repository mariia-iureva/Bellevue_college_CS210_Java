// CS210 Summer 2021 Assignment #1
// Mariia Iureva
// Greetings - a program that prompts user for an input asking
// their first and last name and the year of birth and then producing
// nice and warm greeting with age calculated

import java.util.*;

public class Greetings {

    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        System.out.println(getGreetings(s));
    }

    private static String getGreetings(Scanner s) { 
        // method that collects info from user and returns greeting message
        System.out.print("Please enter your first name: ");
        String name = s.next();
        String n = name.toUpperCase().substring(0, 1);

        System.out.print("Please enter your last name: ");
        String lastName = s.next();
        String lastNameCapitalized = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        
        System.out.print("Please enter your year of birth: ");
        int year = s.nextInt();
        int currentYear = getCurrentYear();
        
        String greetings = "Greetings, " + n + ". " + lastNameCapitalized 
                + "! You are about " + (currentYear - year) + " years old.";
        return greetings;
    }
    
    // Get the current year
    //   you may find this method useful when calculating the age -- feel free to use it
    private static int getCurrentYear(){
      
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
