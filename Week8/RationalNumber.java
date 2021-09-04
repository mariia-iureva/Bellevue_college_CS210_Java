// CS210 Summer 2021 Assignment #8 "Rational Number"
// Mariia Iureva

public class RationalNumber {

	// TODO: implement the following methods
    int numerator;
    int denominator;

    public RationalNumber(int numerator, int denominator) {

       this.numerator = numerator;
       this.denominator = denominator;
    }
    
    public RationalNumber() {
        numerator = 0;
        denominator = 1;
    }
    
	
    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {	
        return numerator;
    }
	

    public String toString() {
        String result;
        
        // solving the problem of negative denominator 
        // and at the same time the problem when numerator and denominator
        // are negative at the same time
        if (denominator < 0) {
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
        
        
        if (numerator == 0){
            result = "0";
        } else if (denominator == 1){
            result = numerator + "";
        } else {               
            return numerator + "/" + denominator;
        }
        return result;
    }
	
    public RationalNumber add(RationalNumber other) {
        int commonDenominator = denominator * other.getDenominator();
        int numerator1 = numerator * other.getDenominator();
        int numerator2 = other.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

       return new RationalNumber(sum, commonDenominator);
        
    }

    public RationalNumber subtract(RationalNumber other) {
        int commonDenominator = denominator * other.getDenominator();
        int numerator1 = numerator * other.getDenominator();
        int numerator2 = other.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

       return new RationalNumber(difference, commonDenominator);
        
    }

    public RationalNumber multiply(RationalNumber other) {
        int commonDenominator = denominator * other.getDenominator();
        int commonNumerator = numerator + other.getNumerator();

       return new RationalNumber(commonNumerator, commonDenominator);
    }

    public RationalNumber divide(RationalNumber other) {
        int commonDenominator = denominator * other.getNumerator();
        int commonNumerator = numerator * other.getDenominator();
        
       return new RationalNumber(commonNumerator, commonDenominator);
    }
	
}