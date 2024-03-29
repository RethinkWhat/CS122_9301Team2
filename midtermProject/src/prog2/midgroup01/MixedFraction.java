package prog2.midgroup01;

import prog2.prelimgroup01.Fraction;
/**
 * This class provides a way to represent mixed fractions and perform various
 * operations on them.
 *
 * @author Rizza Montevirgen
 * @author Georcelle Nuarin
 * @author Sean Drei Octavo
 * @author Sebastian Siccuan
 * @author Rithik Tank
 * @author Jan Adrian Tayag
 */
public class MixedFraction extends Fraction {

    /**
     * This is a variable to hold the whole number of the mixed fraction.
     */
    private int wholeNumber;

    /**
     * This constructor is the default constructor because it has no arguments.
     */
    public MixedFraction() {
        super();
        this.wholeNumber = 0;
    }

    /**
     * This constructor is used to handle passed in whole number and fraction object.
     *
     * @param fraction
     *        {@code Fraction} representation of a fraction
     * @param wholeNumber
     *        Integer representation of the whole number of a mixed fraction
     */
    //        Algorithm:
    //        1. Accept a whole number and fraction object
    //        2. Use super to pass in the numerator and denominator using the get methods of the Fraction object
    //        3. Assign the passed in whole number to the whole number variable declared earlier
    public MixedFraction(int wholeNumber, Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        this.wholeNumber = wholeNumber;
    }

    /**
     * This constructor is used to handle passed in whole number, numerator, and denominator.
     *
     * @param wholeNumber
     *        integer representation of the whole number
     * @param numerator
     *        integer representation of numerator
     * @param denominator
     *        integer representation of denominator
     */
    //      Algorithm:
    //        1. Accept a whole number, numerator, and denominator as parameters
    //        2. Use super to create a fraction using the passed in numerator and denominator
    //        3. Assign the passed in whole number to the whole number variable declared earlier
    public MixedFraction(int wholeNumber, int numerator, int denominator) {
        super(numerator, denominator);
        this.wholeNumber = wholeNumber;
    }

    /**
     * This constructor receives a given fraction.
     *
     * @param fraction
     *        {@code Fraction} representation of a fraction
     */
    //      Algorithm:
    //        1. Accept a fraction as a parameter
    //        2. Call Fraction class using super and pass in the numerator and denominator as parameters
    public MixedFraction(Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
    }

    /**
     * This method sets the value of the whole number.
     *
     * @param whole
     *        integer representation of the whole number
     */
    //      Algorithm:
    //        1. Accept a whole number as a parameter
    //        2. Assign it to whole number
    public void setWholePart(int whole) { this.wholeNumber = whole; }

    /**
     * This method sets the value of the fraction part.
     *
     * @param fraction
     *        {@code Fraction} representation of fraction
     */
    //      Algorithm:
    //        1. Accept a fraction as a parameter
    //        2. Set the numerator and denominator using setters and getters
    public void setFractionPart(Fraction fraction) {
        setNumerator(fraction.getNumerator());
        setDenominator(fraction.getDenominator());
    }

    /**
     * This method gets the whole number of a mixed fraction.
     *
     * @return {@code this wholeNumber}
     */
    //      Algorithm:
    //        1. Return the value assigned to the whole number
    public int getWholeNumber() {
        return this.wholeNumber;
    }

    /**
     * This method gets the fraction part of the mixed fraction.
     *
     * @return new {@code Fraction} object
     */
    //      Algorithm:
    //        1. Get numerator using getNumerator method
    //        2. Get denominator using getDenominator method
    //        3. Create a Fraction object passing numerator and denominator as parameters
    //        4. Return the Fraction object
    public Fraction getFractionPart() {
        int numerator = getNumerator();
        int denominator = getDenominator();
        Fraction obj = new Fraction(numerator,denominator);
        return obj;
    }

    /**
     * This is a method to add fractions.
     *
     * @param other
     *        MixedFraction representation of other
     * @return the sum of {@code this} and {@code other}
     */
    //      Algorithm:
    //        1. Accept a fraction as a parameter
    //        2. Create a Fraction object called sum
    //        3. Convert the 'this' fraction into improper by invoking the mixedFractionToImproper method
    //        4. Convert the passed in fraction by invoking the  mixedFractionToImproper method
    //        5. Call the addFraction method of the fraction class and add the 2 fractions assigning the value to sum
    //        6. Create a MixedFraction object and call it sumInMixed
    //        7. Assign the sum variable value to the MixedFraction object
    //        8. Return sumInMixed
    public MixedFraction add(MixedFraction other){
        Fraction sum = new Fraction();
        sum = this.mixedFractionToImproper().addFraction(other.mixedFractionToImproper());
        MixedFraction sumInMixed = new MixedFraction(sum);
        return sumInMixed;
    }

    /**
     * This is a method to subtract fractions.
     *
     * @param other
     *        MixedFraction representation of other
     * @return the difference of {@code this} and {@code other}
     */
    //      Algorithm:
    //        1. Accept a fraction as a parameter
    //        2. Create a Fraction object called difference
    //        3. Convert the 'this' fraction into improper by invoking the mixedFractionToImproper method
    //        4. Convert the passed in fraction by invoking the  mixedFractionToImproper method
    //        5. Call the subtractFraction method of the fraction class and subtract the 2 fractions assigning the value to difference
    //        6. Create a MixedFraction object and call it differenceInMixed
    //        7. Assign the difference variable value to the MixedFraction object
    //        8. Return differenceInMixed
    public MixedFraction subtract(MixedFraction other){
        Fraction difference = new Fraction();
        difference = this.mixedFractionToImproper().subtractFraction(other.mixedFractionToImproper());
        MixedFraction differenceInMixed = new MixedFraction(difference);
        return differenceInMixed;
    }

    /**
     * This is a method that divides two fractions.
     *
     * @param other
     *        MixedFraction representation of other
     * @return the quotient of {@code this} and {@code other}
     */
    //      Algorithm:
    //        1. Accept a MixedFraction as a parameter
    //        2. Create a new object named reciprocal
    //        3. Convert the passed in MixedFraction object to a mixedFraction
    //        4. Pass in the numerator as the denominator and denominator as numerator
    //        5. Create a new object named quotient that multiplies the 'this' fraction and the converted reciprocal
    //        6. Return the quotient of the MixedFraction
    public MixedFraction divide(MixedFraction other) {
        MixedFraction reciprocal = new MixedFraction(0,other.mixedFractionToImproper().getDenominator(),
                other.mixedFractionToImproper().getNumerator());
        MixedFraction quotient = new MixedFraction(this.multiply(reciprocal));
        return quotient;
    }

    /**
     * This is a method that multiplies two fractions together.
     *
     * @param other
     *        MixedFraction representation of other
     * @return product of {@code this} and {@code other}
     */
    //      Algorithm:
    //        1. Create a new MixedFraction object called product to hold Mixed Fraction object
    //        2. Invoke the setNumerator method to set the value of the product of the numerator equal to 'this' numerator multiplied by passed in numerator
    //        3. Invoke the setDenominator method to set the value of the product of the denominator  equal to 'this' denominator multiplied by passed in denominator
    //        4. Assign the values to the product variable
    //        5. Invoke reduceFraction to reduce the fraction to the lowest terms possible.
    //        6. Return the product of the Fraction.
    public MixedFraction multiply(MixedFraction other) {
        MixedFraction product = new MixedFraction();
        product.setNumerator(this.mixedFractionToImproper().getNumerator() * other.mixedFractionToImproper().getNumerator());
        product.setDenominator(this.getDenominator() * other.getDenominator());
        product.reduceFraction();
        return product;
    }

    /**
     * This is a temporary method for improper to mixed fraction.
     *
     * @return new {@code MixedFraction} object
     */
    //      Algorithm:
    //        1. Get the numerator and denominator of 'this' fraction.
    //        2. Calculate the whole number by dividing the numerator by
    //           the denominator and rounding down to the nearest integer.
    //        3. Calculate the remainder by taking the numerator modulo the denominator.
    //        4. Create a new MixedFraction object with the calculated whole number, remainder,
    //           and denominator as its parameters.
    //        5. Return the new MixedFraction object.
    public MixedFraction toMixedFraction() {
        int numerator = this.getNumerator();
        int denominator = this.getDenominator();
        int wholeNumber = numerator / denominator;
        numerator = numerator % denominator;
        return new MixedFraction(wholeNumber, numerator, denominator);
    }


    /**
     * This method is to convert mixed fraction to improper fraction.
     *
     * @return new {@code Fraction} object
     */
    //      Algorithm:
    //        1. Use the getNumerator method to get the numerator of 'this' fraction
    //        2. If the whole number of 'this' fraction is not equal to 0
    //        3. Multiply the whole number by the denominator of the fraction.
    //        4. Add the numerator of the fraction to the result of step 3 to get the total numerator of the improper fraction.
    //        5. Set The denominator of the improper fraction as the denominator of either fraction.
    //        6. Create a new Fraction object with the numerator and denominator calculated in steps 3 and 4.
    public Fraction mixedFractionToImproper() {
        int numerator = this.getNumerator();
        if (this.wholeNumber != 0) {
            numerator = this.wholeNumber * this.getDenominator() + this.getNumerator();
        }
        return new Fraction(numerator, this.getDenominator());
    }// this method is used to compute improper to mixed fraction

    /**
     * This method is to reduce a MixedFraction.
     *
     * @return obj2 which is a new {@code MixedFraction} object
     */
    //      Algorithm:
    //        1. Create a Fraction object called obj
    //        2. Call the mixedFractionToImproper method on the 'this' fraction
    //        3. Assign the value of 'this' MixedFraction to the Fraction object
    //        4. Create a MixedFraction object called obj2 and assign the value of obj to this
    //        5. Call the reduceFraction() method of the Fraction class on this object
    //        6. Return obj2
    public MixedFraction reduce() {
        Fraction obj = new Fraction();
        obj = this.mixedFractionToImproper();
        MixedFraction obj2 = new MixedFraction(0,obj);
        obj2.reduceFraction();
        return obj2.toMixedFraction();
    }

    /**
     * This is a method to return the mixed fraction as a string. If the wholeNumber is not equal to 0,
     * append wholeNumber to returnStatement. And if the numerator is not equal to 0, append the numerator and
     * denominator to returnStatement.
     *
     * @return the string returnStatement
     */
    //      Algorithm:
    //        1. Create a string called returnStatement
    //        2. Create an if statement to check whether the wholeNumber variable value is 0
    //           2.1 If it is not then append its value to returnStatement
    //        3. Create an if statement to check whether numerator is equal to 0
    //           3.1 If it is not then call the getNumerator() and getDenominator() to get the values of the
    //               numerator and denominator and append it to returnStatement
    //        4. Return the returnStatement
    public String toString() {
        String returnStatement = "";
        if (this.wholeNumber != 0)
            returnStatement += this.wholeNumber + " ";

        if (getNumerator() != 0)
            returnStatement += getNumerator() + "/" + getDenominator();

        return returnStatement;
    }
}
