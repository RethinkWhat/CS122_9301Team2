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

    public MixedFraction add(MixedFraction other){
        Fraction sum = new Fraction();
        sum = this.mixedFractionToImproper().addFraction(other.mixedFractionToImproper());
        MixedFraction sumInMixed = new MixedFraction(sum);
        return sumInMixed;
    }

    public MixedFraction subtract(MixedFraction other){
        Fraction difference = new Fraction();
        difference = this.mixedFractionToImproper().subtractFraction(other.mixedFractionToImproper());
        MixedFraction differenceInMixed = new MixedFraction(difference);
        return differenceInMixed;
    }

    /**
     * Divides a mixed fraction to a fraction
     * @param other
     * */
    /*
     * Algorithm:
     *      1. Create a new MixedFraction object called quotient.
     *      2. Convert the current MixedFraction to an improper fraction called fraction1.
     *      3. Get the numerator and denominator of the other Fraction.
     *      4. Calculate the numerator and denominator of the quotient as follows:
     *              quotient numerator = fraction1 numerator * other denominator
     *              quotient denominator = fraction1 denominator * other numerator
     *      5. Convert quotient to a mixed fraction using the toMixedFraction method.
     *      6. Return the quotient mixed fraction.
    */
    public MixedFraction divide(MixedFraction other) {
        MixedFraction reciprocal = new MixedFraction(0,other.mixedFractionToImproper().getDenominator(),
                other.mixedFractionToImproper().getNumerator());
        MixedFraction quotient = new MixedFraction(this.multiply(reciprocal));
        return quotient;
    }

    /**
     * Multiplies a mixed fraction to a fraction
     * @param other
     * @return the {@code product} of the mixed fraction and a fraction
     * */
    /*
     * Algorithm:
     *      1. Convert the mixed fraction to an improper fraction using the toFraction method
     *      2. Multiply the numerator of the improper fraction by the numerator of the given fraction to get the new numerator
     *      3. Multiply the denominator of the improper fraction by the denominator of the given fraction to get the new denominator
     *      4. Create a new MixedFraction object using the toMixedFraction method
     *      5. Return the new MixedFraction object as the product
    * */
    public MixedFraction multiply(MixedFraction other) {
        MixedFraction product = new MixedFraction();
        //Fraction fraction1 = this.mixedFractionToImproper();
        product.setNumerator(this.mixedFractionToImproper().getNumerator() * other.mixedFractionToImproper().getNumerator());
        product.setDenominator(this.getDenominator() * other.getDenominator());
        product = product.toMixedFraction();
        return product;
    }

    /**
     * Temporary method for improper to mixed fraction
     * */
    /*
    * Algorithm:
    *       1. Get the numerator and denominator of the fraction.
    *       2. Calculate the whole number by dividing the numerator by
    *          the denominator and rounding down to the nearest integer.
    *       3. Calculate the remainder by taking the numerator modulo the denominator.
    *       4. Create a new MixedFraction object with the calculated whole number, remainder,
    *          and denominator as its parameters.
    *       5. Return the new MixedFraction object.
    * */
    public MixedFraction toMixedFraction() {
        int numerator = this.getNumerator();
        int denominator = this.getDenominator();
        int wholeNumber = numerator / denominator;
        numerator = numerator % denominator;
        return new MixedFraction(wholeNumber, numerator, denominator);
    }

    /**
     * Algorithm:
     * 1.Multiply the whole number by the denominator of the fraction.
     * 2.Add the numerator of the fraction to the result of step 1 to get the total numerator of the improper fraction.
     * 3.The denominator of the improper fraction is simply the same as the denominator of the original fraction.
     * 4.Create a new Fraction object with the numerator and denominator calculated in steps 2 and 3.
     */
    public Fraction mixedFractionToImproper() {
        int numerator = this.getNumerator();
        if (this.wholeNumber != 0) {
            numerator = this.wholeNumber * this.getDenominator() + this.getNumerator();
        }
        return new Fraction(numerator, this.getDenominator());
    }// this method is used to compute improper to mixed fraction

    /** Method to return the mixed fraction as a string. */
    /*
        Algorithm:
        1. Return the whole number, numerator, and the denominator as a single string.
    */
    public String toString() {
        return this.wholeNumber + " " + this.getNumerator() + "/" + this.getDenominator();
    }
}
