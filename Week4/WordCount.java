// CS210 Summer 2021 Assignment #4 "Word Count"
// Mariia Iureva
// WordCount accepts a String as its parameter and returns the number 
// of words in the String.

public class WordCount{
    public static void main(String[] args) { 
        System.out.println(wordCount("  Night   coding  is   fun ! "));
        System.out.println(wordCount("hello"));
        System.out.println(wordCount("how are you?"));
        System.out.println(wordCount("    how are you?"));
        System.out.println(wordCount("    how are you?  "));
        System.out.println(wordCount("      "));
        System.out.println(wordCount("3 x 4 = 12"));
        System.out.println(wordCount("I am 3 years old"));
        System.out.println(wordCount("How are you ?"));
    }
    public static int wordCount(String inputString) {
        // method takes a string as an input and then counts words
        
        // first we evaluate extreme cases (if the string is empty and 
        // if a string has only one character which is space (then wordCount is 0)
        // or if the caracter is a letter/symbol (then 1)
        if (inputString.length() == 0) return 0;
        if (inputString.length() == 1 && inputString.charAt(0) == ' ') return 0;
        else if (inputString.length() == 1 && inputString.charAt(0) != ' ') return 1;
        
        int wordCount = 0;
        
        // main part where we check if a character i is a space and has a letter
        // in the i-1 place.
        
        for (int i = 1; i < inputString.length(); i++){
            if (!Character.isSpaceChar(inputString.charAt(i-1)) &&
                    Character.isSpaceChar(inputString.charAt(i))) {
                wordCount += 1;
            }
        }

        return wordCount;
    }      
    
}
