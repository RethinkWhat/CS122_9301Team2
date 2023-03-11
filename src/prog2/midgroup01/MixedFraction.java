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

    /**
     * Constructor to handle passed in whole number and Fraction object .
     */
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
     * Constructor to handle passed in whole number, numerator, and denominator .
     */
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

    /**
     * Constructor that is receiving a given fraction.
     *
     * @param fraction
     */
    public MixedFraction(Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
    }

    /**
     * Method to return the mixed fraction as a string.
     */
    /*
        Algorithm:
        1. Return the whole number, numerator, and the denominator as a single string.
    */
    public String toString() {
        return this.wholeNumber + " " + this.getNumerator() + "/" + this.getDenominator();
    }

    public int getWholeNumber() {
        return wholeNumber;
    }


    public MixedFraction divideByOne(Fraction other) {
        MixedFraction quotient = new MixedFraction();
        Fraction fraction1 = toFraction();

        quotient.setNumerator(fraction1.getNumerator() * other.getDenominator());
        quotient.setDenominator(fraction1.getDenominator() * other.getNumerator());

        quotient = quotient.toMixedFraction();

        return quotient;
    }
    public MixedFraction divideByTwo(MixedFraction other){
        if (other instanceof Fraction) {
            return divideByOne((Fraction) other);
        }

        MixedFraction quotient = new MixedFraction();
        Fraction fraction1 = toFraction();
        Fraction fraction2 = other.toFraction();

        quotient.setNumerator(fraction1.getNumerator() * fraction2.getDenominator());
        quotient.setDenominator(fraction1.getDenominator() * fraction2.getNumerator());

        quotient = quotient.toMixedFraction();

        return quotient;

    }

    /**
     * Multiplies a mixed fraction to a fraction
     *
     * Algorithm:
     * 1.
     *
     *
     * @param other
     *
     * */
    public MixedFraction multiplyByOne(Fraction other) {
        MixedFraction product = new MixedFraction();
        Fraction fraction1 = toFraction();

        product.setNumerator(fraction1.getNumerator() * other.getNumerator());
        product.setDenominator(fraction1.getDenominator() * other.getDenominator());

        product = product.toMixedFraction();

        return product;
    }

    /**
     * Multiplies two mixed fractions
     *
     * @param other
     * @return a product of this mixed fraction and another mixed fraction
     */
    public MixedFraction multiplyByTwo(MixedFraction other) {
        if (other instanceof Fraction) {
            return multiplyByOne((Fraction) other);
        }

        MixedFraction product = new MixedFraction();
        Fraction fraction1 = toFraction();
        Fraction fraction2 = other.toFraction();

        product.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
        product.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());

        product = product.toMixedFraction();

        return product;
    }


    /**
     * Temporary method for mixed fraction to improper fraction
     * */
    public Fraction toFraction() {
        Fraction result = new Fraction();
        int numerator = getWholeNumber() * getDenominator() + getNumerator();
        int denominator = getDenominator();
        int sign = Integer.signum(numerator) * Integer.signum(denominator);

        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        int wholeNumber = sign * (numerator / denominator);

        numerator = sign * (numerator % denominator);

        result.setNumerator(numerator);
        result.setDenominator(denominator);

        return result;
    }

    /**
     * Temporary method for improper to mixed fraction
     * */
    public MixedFraction toMixedFraction() {
        int numerator = this.getNumerator();
        int denominator = this.getDenominator();
        int wholeNumber = numerator / denominator;
        numerator = numerator % denominator;
        return new MixedFraction(wholeNumber, numerator, denominator);
    }

    /**
     Algorithm:
     1.
     2.
     3.
     4.
     */
    private static Fraction mixedFractionToImproper(int whole, Fraction fraction) {
        int numerator = whole * fraction.getDenominator() + fraction.getNumerator();
        int denominator = fraction.getDenominator();
        return new Fraction(numerator, denominator);
    }
    
// this method is used to compute improper to mixed fraction
/**
Algorithm: 
1. Divide the numerator by the denominator to get the whole part.
2. Calculate the remainder by taking the numerator modulo the denominator.
3. If the remainder is negative and the whole part is positive, adjust the whole part down by one and add the denominator to the remainder.
4. Set the numerator to the remainder and the denominator to the absolute value of the original denominator.
5. Print the whole part, numerator, and denominator in the format "wholePart numerator/denominator".
 */
private void improperToMixedFraction() { // GNuarin(03.09) this is for the improper to mixed
        int wholePart = this.getNumerator()/ this.getDenominator();
        int remainder = this.getNumerator() % this.getDenominator();
        if (remainder < 0 && wholePart > 0) {
            wholePart--; // adjust the whole part if the remainder is negative
            remainder += this.getDenominator();
        }
        int getNumerator = remainder;
        int getDenominator = Math.abs(this.getDenominator());
        System.out.println(wholePart + " " + this.getNumerator() + "/" + this.getDenominator());
    }
}
