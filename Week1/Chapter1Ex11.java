
// CS210 Summer 2021 Assignment #1
// Mariia Iureva
// TwoRockets - a program that outputs two rockets standing close to each other,
// using static methods to make it readable

public class Chapter1Ex11 {
    public static void main(String[] args) {
        //main method draws peaks, middle part, "United States", 
        //middle part again and bottom part that looks exactly like peaks
        rocketPeaks();
        middlePart();
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        middlePart();
        rocketPeaks();
        
    }
    public static void rocketPeaks(){
        //this method draws peacks
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void middlePart(){
        //this method draws main section of the rocket that is rectangular
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
}