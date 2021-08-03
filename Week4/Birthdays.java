
import java.util.Scanner;

// CS210 Summer 2021 Assignment #4 "Birthdays"
// Mariia Iureva
// Birthdays - prompts for two people’s birthdays (month and day), 
// along with today’s month and day. The program should figure out 
// how many days remain until each user’s birthday and which birthday is sooner.

public class Birthdays {
    // constant for the number of days in a year
    public static final int DAYSINYEAR = 365;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        promptInputAndPrintStatements(sc);
    }
    
    public static void promptInputAndPrintStatements(Scanner sc) { 
        // actually this is the main method that does everything:
        // - prompt user for input
        // - calls the function to calculate absolute day of the year
        // - prints statments with this absolute day
        // - calls function to calculate days till next birthday
        // - calls function to compare whose birthday is sooner
        
        // working on current date
        System.out.print("Please enter today’s date (month day): ");
        int currentMonth = sc.nextInt(); 
        int currentDay = sc.nextInt();
        int currentDayNumber = absoluteDayOfTheYear(currentMonth, currentDay);
        System.out.println("Today is " + currentMonth + "/" + currentDay 
                + "/2021, day " + currentDayNumber + " of the year.\n");
     
        // working on Person 1's birthday
        System.out.print("Please enter person #1’s birthday (month day): ");
        int person1bdMonth = sc.nextInt(); 
        int person1bDay = sc.nextInt(); 
        int person1DayNumber = absoluteDayOfTheYear(person1bdMonth, person1bDay);
        System.out.println(person1bdMonth + "/" + person1bDay 
                + "/2021 falls on day " + person1DayNumber + " of 365.");
        calculateDaysTillNextBirthday(currentDayNumber, person1DayNumber);
        
        
        // working on Person 2's birthday
        System.out.print("Please enter person #2’s birthday (month day): ");
        int person2bdMonth = sc.nextInt(); 
        int person2bDay = sc.nextInt(); 
        int person2DayNumber = absoluteDayOfTheYear(person2bdMonth, person2bDay);
        System.out.println(person2bdMonth + "/" + person2bDay 
                + "/2021 falls on day " + person2DayNumber + " of 365.");
        calculateDaysTillNextBirthday(currentDayNumber, person2DayNumber);
        
        //determine whose birthday is sooner
        whoseBirthdayIsSooner(currentDayNumber, person1DayNumber, person2DayNumber);
        
        //printing (not so much) fun fact
        System.out.println("Did you know that on 05/26/1987 " 
                + "the Gothic horror classic Dracula was published? ");
 
    }
         
    
    /**
     *
     * @param currentDayNumber
     * @param birthdayNumber
     */
    public static void calculateDaysTillNextBirthday(int currentDayNumber, int birthdayNumber){
        //calculating days till next birthday using bithday, current date and 
        // days in a year constant
        
        if (currentDayNumber == birthdayNumber){
            System.out.println("Happy Birthday! :) \n");
        } else if (currentDayNumber < birthdayNumber){
            int daysLeft = birthdayNumber - currentDayNumber;
            System.out.println("Your next birthday is in " + daysLeft + " day(s)\n");
        } else { //if currentDayNumber > birthdayNumber and birthday is next year
            int daysLeft = DAYSINYEAR - currentDayNumber + birthdayNumber;
            System.out.println("Your next birthday is in " + daysLeft + " day(s)\n");
        }
    }
    
    public static void whoseBirthdayIsSooner(int currentDayNumber, int person1DayNumber, int person2DayNumber){
    // Method compares absolute day values, using 2 people birthdays and current day 
    // to find the soonest birthday
    
    // I realised that another option was to compare "days till next birthday left"
    // for both people, I'd probably use less lines of code
    
        if (person1DayNumber == person2DayNumber){
            System.out.println("Wow, you share the same birthday! ^_^");
        }
        if (person1DayNumber < person2DayNumber){
            // if both birthdays already passed, the smallest number wins
            if (person1DayNumber < currentDayNumber && person2DayNumber < currentDayNumber){
                System.out.println("Person #1’s birthday is sooner.");

            // if the birthday 1 is smaller than current date, 
            //the next Birthday 1 is the next year           
            } else if (person1DayNumber < currentDayNumber){
                System.out.println("Person #2’s birthday is sooner.");
                            
            } else { // if birthday 1 equals or greated than current date
                System.out.println("Person #1’s birthday is sooner.");
            }
        }
        
        if (person1DayNumber > person2DayNumber){
            // if both birthdays already passed, the smallest number wins
            if (person1DayNumber < currentDayNumber && person2DayNumber < currentDayNumber){
                System.out.println("Person #2’s birthday is sooner.");

            // if the birthday 2 is smaller than current date, 
            // the next Birthday 2 is the next year           
            } else if (person2DayNumber < currentDayNumber){
                System.out.println("Person #1’s birthday is sooner.");
                
            } else { // if birthday 2 equals or greated than current date
                System.out.println("Person #2’s birthday is sooner.");
            }
        }
        System.out.println();
    }
    
    /**
     *
     * @param month
     * @param day
     * @return finalResult which absolute day of the year value
     */
    public static int absoluteDayOfTheYear(int month, int day) {
        
    // we use cummulative sum and consecutive if statements to calculate
    // absolute day of the year value
        
        int absDay = 0;
        
        if (month > 1) { // add January
            absDay += 31;
        }

        if (month > 2) { // add February
            absDay += 28;
        }

        if (month > 3) { // add March
            absDay += 31;
        }

        if (month > 4) { // add April
            absDay += 30;
        }

        if (month > 5) { // add May
            absDay += 31;
        }

        if (month > 6) { // add June
            absDay += 30;
        }

        if (month > 7) { // add July
            absDay += 31;
        }

        if (month > 8) { // add August
            absDay += 31;
        }

        if (month > 9) { // add September
            absDay += 30;
        }

        if (month > 10) { // add October
            absDay += 31;
        }

        if (month > 11) { // add November
            absDay += 30 ;
        }
        // add our day variable to our cumulative days in months number
        int finalResult = absDay + day;
        
        return finalResult;
    }   
}
