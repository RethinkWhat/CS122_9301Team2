package prog2.midgroup01;

import prog2.pregroup01.Fraction;

public class MixedFraction extends Fraction {

    // Variable to hold the whole number of the mixed fraction
    private int wholeNumber;

    // Default constructor
    public MixedFraction() {}

    /**
     * Constructor to handle passed in whole number and Fraction object .*/
    /*
        Algorithm:
        1. Accept a whole number and fraction object
        2. Use super to pass in the numerator and denominator using the get methods of the Fraction object
        3. Assign the passed in whole number to the whole number variable declared earlier
    */
    public MixedFraction(int wholeNumber, Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        this.wholeNumber = wholeNumber;
    }

    /**
     * Constructor to handle passed in whole number, numerator, and denominator .*/
    /*
        Algorithm:
        1. Accept a whole number, numerator, and denominator as parameters
        2. Use super to create a fraction using the passed in numerator and denominator
        3. Assign the passed in whole number to the whole number variable declared earlier
    */
    public MixedFraction(int wholeNumber, int numerator, int denominator) {
        super(numerator,denominator);
        this.wholeNumber = wholeNumber;
    }

    public MixedFraction(Fraction fraction) {
    }


    /**
     * Method to return the mixed fraction as a string.*/
    /*
        Algorithm:
        1. Return the whole number, numerator, and the denominator as a single string.
    */
    public String toString() {
        return this.wholeNumber + " " + this.getNumerator() + "/" + this.getDenominator();
    }



}
