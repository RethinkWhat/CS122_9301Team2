/**
 *  〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 *  UML Diagram:
 *  +------------------------------------------------------------------+
 *  |                              Fraction                            |
 *  +------------------------------------------------------------------+
 *  | -denominator: int                                                |
 *  | -numerator: int                                                  |
 *  +------------------------------------------------------------------+
 *  | +Fraction()                                                      |
 *  | +Fraction(numerator: int, denominator: int)                      |
 *  | +getNumerator(): int                                             |
 *  | +setNumerator(numerator: int): void                              |
 *  | +getDenominator(): int                                           |
 *  | +setDenominator(denominator: int): void                          |
 *  | +toString(): String                                              |
 *  | +decimalEquivalent(): double                                     |
 *  | +multiplyFraction(otherFraction: Fraction): Fraction             |
 *  | +divideFraction(otherFraction: Fraction): Fraction               |
 *  | +addFraction(otherFraction: Fraction): Fraction                  |
 *  | +subtractFraction(otherFraction: Fraction): Fraction             |
 *  | +reduceFraction(): void                                          |
 *  | +computeGCD(firstNumber: int, secondNumber: int): int            |
 *  | +leastCommonMultiple(firstNumber: int, secondNumber: int): int   |
 *  +------------------------------------------------------------------+
 *  〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 */

package prog2.prelimgroup01;

public class Fraction {
    // Declare the local variables for Fraction class.
    private int numerator;
    private int denominator;

    /**
     * This is the default constructor because it has no arguments.
     */
    public Fraction() {
        this.numerator = 0;
        this.denominator = 0;
    }

    /**
     * This constructor is used to initialize the numerator and denominator instance variables.
     *
     * @param numerator
     *        integer representation of the numerator
     * @param denominator
     *        integer representation of the denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * This is the method to get the numerator value of the fraction.
     *
     * @return numerator
     */
    //      Algorithm:
    //        1. Return the numerator of the fraction.
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * This method is to set the numerator value of the fraction.
     *
     * @param numerator
     *        integer representation of the numerator
     */
    //Algorithm:
    //       1. Accept the numerator as input from the user.
    //       2. Set the numerator of the fraction to the entered value.
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * This is the method to get the denominator value of the fraction.
     *
     * @return denominator
     */
    //Algorithm:
    //       1. Return the denominator of the fraction.
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * This is the method to set the denominator value of the fraction.
     *
     * @param denominator
     *        integer representation of the denominator
     */
    //Algorithm:
    //       1. Accept the denominator as input from the user.
    //       2. Set the denominator of the fraction to the entered value.
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * This is the method to return the fraction as a string.
     *
     * @return {@code this numerator / this denominator}
     */
    //Algorithm:
    //        1. Return the numerator and the denominator as a single string.
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    /**
     * This is the method to get the decimal equivalent of the fraction.
     *
     * @return decimal equivalent of a fraction
     */
    //Algorithm:
    //        1. Convert the numerator and the denominator into a double data type.
    //        2. Divide the numerator to the denominator to get its decimal equivalent.
    public double decimalEquivalent() {
        double decimal = (double)this.numerator / (double)this.denominator;
        return Math.round(decimal*100.0) /100.0;
    }

    /**
     * This method is to multiply the Fraction and the otherFraction.
     *
     * @param otherFraction
     *        {@code Fraction} representation of otherFraction
     * @return product
     */
    //Algorithm:
    //        1. Declare "product" as a Fraction variable with int numerator and int denominator.
    //        2. Multiply the value of Fraction numerator to the otherFraction numerator.
    //        3. Multiply the value of Fraction denominator to the otherFraction denominator.
    //        4. return the "product" variable.
    public Fraction multiplyFraction(Fraction otherFraction) {
        Fraction product = new Fraction();
        product.numerator = this.numerator * otherFraction.numerator;
        product.denominator = this.denominator * otherFraction.denominator;
        return product;
    }

    /**
     * This is the method to divide the Fraction and the otherFraction.
     *
     * @param otherFraction
     *        {@code Fraction} representation of otherFraction
     * @return quotient
     */
    //Algorithm:
    //        1. Declare "quotient" as a Fraction variable with int numerator and int denominator.
    //        2. Multiply the value of Fraction numerator to the otherFraction denominator.
    //        3. Multiply the value of Fraction denominator to the otherFraction numerator.
    //        4. return the "quotient" variable.
    public Fraction divideFraction(Fraction otherFraction) {
        Fraction quotient = new Fraction();
        quotient.numerator = this.numerator * otherFraction.denominator;
        quotient.denominator = this.denominator * otherFraction.numerator;
        return quotient;
    }

    /**
     * This is the method to add the Fraction and the otherFraction.
     *
     * @param otherFraction
     *        {@code Fraction} representation of otherFraction
     * @return sum
     */
    //Algorithm:
    //        1. Find the commonDenominator of the 2 fractions by declaring the leastCommonMultiple method.
    //        2. Find the numerator of each fraction.
    //          2.1. Multiply the first numerator to the quotient of the commonDenominator and the first denominator.
    //          2.2. Multiply the second numerator to the quotient of the commonDenominator and the second denominator.
    //        3. Find the addedNumerator by adding the 2 new numerators computed.
    //        4. Declare "sum" as a Fraction variable with addedNumerator and commonDenominator as its parameters.
    //        5.Call the reduceFraction method.
    //        6. Return the "sum" variable.
    public Fraction addFraction(Fraction otherFraction) {
        int commonDenominator = this.leastCommonMultiple(this.denominator, otherFraction.denominator);
        int numerator1 = this.numerator * (commonDenominator / this.denominator);
        int numerator2 = otherFraction.numerator * (commonDenominator / otherFraction.denominator);
        int addedNumerator = numerator1 + numerator2;
        Fraction sum = new Fraction(addedNumerator, commonDenominator);
        sum.reduceFraction();
        return sum;
    }

    /**
     * This is the method to subtract the Fraction and the otherFraction.
     *
     * @param otherFraction
     *        {@code Fraction} representation of otherFraction
     * @return difference
     */
    /**
        Algorithm:
        1. Find the commonDenominator of the 2 fractions by declaring the leastCommonMultiple method.
        2. Find the numerator of each fraction.
          2.1. Multiply the first numerator to the quotient of the commonDenominator and the first denominator.
          2.2. Multiply the second numerator to the quotient of the commonDenominator and the second denominator.
        3. Find the subtractedNumerator by subtracting the 2 new numerators computed.
        4. Declare "difference" as a Fraction variable with subtractedNumerator and commonDenominator as its parameters.
        5.Call the reduceFraction method.
        6. Return the "difference" variable.
    */
    public Fraction subtractFraction(Fraction otherFraction) {
        int commonDenominator = this.leastCommonMultiple(this.denominator, otherFraction.denominator);
        int numerator1 = this.numerator * (commonDenominator / this.denominator);
        int numerator2 = otherFraction.numerator * (commonDenominator / otherFraction.denominator);
        int subtractedNumerator = numerator1 - numerator2;
        Fraction difference = new Fraction(subtractedNumerator, commonDenominator);
        difference.reduceFraction();
        return difference;
    }

    /**
     * This is the method to reduce the fraction.
     */
    //Algorithm:
    //        1. Declare "i" as an int variable.
    //        2. Check if the denominator is greater than the numerator.
    //            2.1. If the denominator is greater than the numerator, the variable "i" will be equal to the numerator.
    //            2.2. If the numerator is greater than the denominator, the variable "i" will be equal to the denominator.
    //        3. Make a for loop that will reduce the numerator and the denominator if the numerator and the denominator
    //           modulo the "i" is equal to zero.
    public void reduceFraction() {
        int i;
        if (this.denominator > this.numerator) {
            i = this.numerator;
        } else {
            i = this.denominator;
        }

        for(; i != 1; --i) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                this.numerator /= i;
                this.denominator /= i;
            }
        }

    }

    /**
     * Recursive method for computing the greatestCommonDivisor of the 2 numbers.
     *
     * @param firstNumber
     *        integer representation of the first number
     * @param secondNumber
     *        integer representation of the second number
     * @return the returnGCD of the firstNumber and secondNumber
     */
    //Algorithm:
    //        1. If the firstNumber is equal to 0 return secondNumber.
    //        2. Else make a recursion method by calling the computerGCD method with the following as its parameters:
    //            a. secondNumber modulo '%' by firstNumber
    //            b. firstNumber
    public int computeGCD(int firstNumber, int secondNumber) {
        if (firstNumber == 0)
            return secondNumber;
        return this.computeGCD(secondNumber % firstNumber, firstNumber);
    }

    /**
     * This is the method for computing the leastCommonMultiple of the two numbers.
     *
     * @param firstNumber
     *        integer representation of the first number
     * @param secondNumber
     *        integer representation of the second number
     * @return firstNumber * secondNumber / computeGCD(firstNumber, secondNumber)
     */
    //Algorithm:
    //        1. return the value of the following formula:
    //            firstNumber multiplied by the secondNumber divided by the GCD of the first and second number.
    public int leastCommonMultiple(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber / this.computeGCD(firstNumber, secondNumber);
    }

}
