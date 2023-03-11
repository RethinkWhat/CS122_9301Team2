package prog2.midgroup01;

import prog2.pregroup01.Fraction;
public class MixedFraction extends Fraction {

    // Variable to hold the whole number of the mixed fraction
    private int wholeNumber;

    /**
     * This will become the default constructor because it has no arguments.
     */
    public MixedFraction() {
        super();
        this.wholeNumber = 0;
    }

    /** Constructor to handle passed in whole number and Fraction object */
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

    /** Constructor to handle passed in whole number, numerator, and denominator . */
    /*
        Algorithm:
            1. Accept a whole number, numerator, and denominator as parameters
            2. Use super to create a fraction using the passed in numerator and denominator
            3. Assign the passed in whole number to the whole number variable declared earlier
    */
    public MixedFraction(int wholeNumber, int numerator, int denominator) {
        super(numerator, denominator);
        this.wholeNumber = wholeNumber;
    }

    /** Constructor that receives a given fraction. */
    /*
        Algorithm:
            1. Accept a fraction as a parameter
            2. Call Fraction class using super and pass in the numerator and denominator as parameters
     */
    public MixedFraction(Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
    }

    /** Method to set the value of the whole number */
    /*
        Algorithm:
            1. Accept a whole number as a parameter
            2. Assign it to whole number
     */
    public void setWholePart(int whole) { this.wholeNumber = whole; }

    /** Method to set the value of the fraction part */
    /*
            Algorithm:
            1. Accept a fraction as a parameter
            2. Set the numerator and denominator using setters and getters
     */
    public void setFractionPart(Fraction fraction) {
        setNumerator(fraction.getNumerator());
        setDenominator(fraction.getDenominator());
    }

    /** Method to get the whole number of a mixed fraction */
    /*
        Algorithm:
            1. Return the value assigned to the whole number
     */
    public int getWholeNumber() {
        return this.wholeNumber;
    }

    /** Method to get the fraction part of the mixed fraction */
    /*
        Algorithm:
            1. Get numerator using getNumerator method
            2. Get denominator using getDenominator method
            3. Create a Fraction object passing numerator and denominator as parameters
            1. Return the Fraction object
     */
    public Fraction getFractionPart() {
        int numerator = getNumerator();
        int denominator = getDenominator();
        Fraction obj = new Fraction(numerator,denominator);
        return obj;
    }


    /**
     * Algorithm:
     * 1.
     * 2.
     * 3.
     * 4.
     */
    private static Fraction mixedFractionToImproper(int whole, Fraction fraction) {
        int numerator = whole * fraction.getDenominator() + fraction.getNumerator();
        int denominator = fraction.getDenominator();
        return new Fraction(numerator, denominator);
    }// this method is used to compute improper to mixed fraction

    /**
     * Algorithm:
     * 1. Divide the numerator by the denominator to get the whole part.
     * 2. Calculate the remainder by taking the numerator modulo the denominator.
     * 3. If the remainder is negative and the whole part is positive, adjust the whole part down by one and add the denominator to the remainder.
     * 4. Set the numerator to the remainder and the denominator to the absolute value of the original denominator.
     * 5. Print the whole part, numerator, and denominator in the format "wholePart numerator/denominator".
     */
    private void improperToMixedFraction() { // GNuarin(03.09) this is for the improper to mixed
        int wholePart = this.getNumerator() / this.getDenominator();
        int remainder = this.getNumerator() % this.getDenominator();
        if (remainder < 0 && wholePart > 0) {
            wholePart--; // adjust the whole part if the remainder is negative
            remainder += this.getDenominator();
        }
        int getNumerator = remainder;
        int getDenominator = Math.abs(this.getDenominator());
        System.out.println(wholePart + " " + this.getNumerator() + "/" + this.getDenominator());
    }

    /** Method to return the mixed fraction as a string. */
    /*
        Algorithm:
        1. Return the whole number, numerator, and the denominator as a single string.
    */
    public String toString() {
        return this.wholeNumber + " " + this.getNumerator() + "/" + this.getDenominator();
    }
}
