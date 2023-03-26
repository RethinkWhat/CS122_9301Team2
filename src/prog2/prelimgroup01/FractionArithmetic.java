/**
 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

 Group Number: 10
 Members:
 Santos, Lourdene Eira C.
 Siccuan, Sebastian
 Tank, Rithik
 Tayag, Jian Adrian A.
 Urbiztondo, Karl Jasper
 Villareal, Carlo Leeon M.

 CLASS CODE & Schedule: 9301 CS 122 7:30 - 8:30 & 9:00 - 10:30 TF
 Date of Programming: February-7-2023
 Activity Name: Prelim Project 1

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

 Problem Description:
 1. Create a project in IntelliJ IDEA with the following naming convention:
 <last names of the members (in alphabetical order)> <class code>PrelimGroupProject
 e.g. AranetaAyalaMontelibanoTan9300PrelimGroupProject
 2. Create a package within the project named “prog2.prelimgroup”. All classes needed for this activity
 should be placed within this package.
 3. Create a class called Fraction. The Fraction class should define a “new data type” such that it will be
 used as the data type for a variable that will hold a typical fraction. A typical fraction is composed of a
 numerator and a denominator.
 4. Create a class called FractionArithmetic. The FractionArithmetic class should be an executable
 program (class having the main method) that will allow the user to compute the sum, difference, product
 and quotient of two fractions. When FractionArithmetic is executed, the user will be asked to enter the
 values of the numerator and denominator of both fractions and then a menu will be shown from which
 he/she can choose to enter value for fraction 1, enter value for fraction 2, add, subtract, multiply, divide
 the fractions, reduce a fraction, and quit from the program. The result (sum, difference, product, quotient,
 or reduce a fraction) should be displayed in the typical fraction form and its equivalent decimal value.

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

 Requirement:
 Complete the codes for Fraction.java and FractionArithmetic.java. The following diagram shows the UML class
 diagrams for the Fraction class and the FractionArithmetic class. The diagram also depicts a “has-a” relationship
 between the FractionArithmetic class and the Fraction class. The arrow in the diagram from the FractionArithmetic
 class diagram to the Fraction class diagram means that the FractionArithmetic class involves at least one variable
 that has Fraction as its data type.

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

 Sample Run: (To be shown in the video presentation)

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

 Inputs:
 integer number for menu choice
 numerator of a fraction
 denominator of a fraction

 Outputs:
 sum of two fractions
 difference of two fractions
 product of two fractions
 quotient of two fractions
 fraction in its lowest terms

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 UML Diagram:
 +----------------------------------------------------------------------+
 |                          FractionArithmetic                          |
 +----------------------------------------------------------------------+
 -keyboard: int                                                         |
 -input1Exists: boolean                                                 |
 -input2Exists: boolean                                                 |
 +----------------------------------------------------------------------+
 | + run(): void                                                        |
 | +showIntroduction(): void                                            |
 | +showChoices(): void                                                 |
 | +enterPick(min: int, max: int): int                                  |
 | +requestFraction()                                                   |
 | +requestFraction1()                                                  |
 | +requestFraction2()                                                  |
 | +addition(fraction1: Fraction, otherFraction: Fraction): void        |
 | +subtraction(fraction1: Fraction, otherFraction: Fraction): void     |
 | +multiplication(fraction1: Fraction, otherFraction: Fraction): void  |
 | +division(fraction1: Fraction, otherFraction: Fraction): void        |
 | +reduce(fractionToBeReduced: Fraction): void                         |
 | +presskey(): void                                                    |
 | +showExit(): void                                                    |
 +----------------------------------------------------------------------+
 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 Algorithm:
 1. Print an introduction statement that displays information about the purpose
 of the program and guidelines for the user.
 2. Implement a do-while statement that displays the available program choices
 to the user for them to pick from.
 3. If the user input for the value of the first fraction and second fraction does not exist. Only print
 limited program choices in a main menu where the user can only choose to input the value of the first
 and second fraction or exit the program before proceeding to other available program choices.
 4. Read the integer through user input that corresponds to the user's choice.
 5. Implement a switch-case statement that provides cases for a specific routine.
 6. If integer equal to 1 is entered, the program will proceed to the menu choice number 1 and does the following:
 - Read an integer through keyboard input from the user for the numerator of the first fraction. Given an
 appropriate statement for invalid inputs.
 - Read an integer through keyboard input from the user for the denominator of the first fraction. The integer
 should not be equal to 0 to avoid an undefined result. Given an appropriate statement for invalid inputs.
 - Convert the decimal equivalent of the fraction.
 - Print the fraction and its decimal equivalent.
 - Let the user press the enter key to proceed back to the main menu of user choices.
 7. If integer equal to 2 is entered, the program will proceed to the menu choice number 2 and does the following:
 - Read an integer through keyboard input from the user for the numerator of the second fraction. Given an
 appropriate statement for invalid inputs.
 - Read an integer through keyboard input from the user for the denominator of the second fraction. The integer
 should not be equal to 0 to avoid an undefined result. Given an appropriate statement for invalid inputs.
 - Convert the decimal equivalent of the fraction.
 - Print the fraction and its decimal equivalent.
 - Let the user press the enter key to proceed back to the main menu of user choices.
 8. If the user input for the value of the first fraction and second fraction does exist. Print
 all the available program choices shown in a main menu.
 9. Read the integer through user input that corresponds to the user's choice.
 10. If integer equal to 3 is entered, the program will proceed to the menu choice number 3 and does the following:
 - Add the value of the first fraction and second fraction.
 - Convert the decimal equivalent of the sum of the two fractions.
 - Print the sum value and its decimal equivalent.
 - Let the user press the enter key to proceed back to the main menu of user choices.
 11. If integer equal to 4 is entered, the program will proceed to the menu choice number 4 and does the following:
 - Subtract the value of the first fraction and second fraction.
 - Convert the decimal equivalent of the difference of the two fractions.
 - Print the difference value and its decimal equivalent.
 - Let the user press the enter key to proceed back to the main menu of user choices.
 12. If integer equal to 5 is entered, the program will proceed to the menu choice number 5 and does the following:
 - Multiply the value of the first fraction and second fraction.
 - Convert the decimal equivalent of the product of the two fractions.
 - Print the product value and its decimal equivalent.
 - Let the user press the enter key to proceed back to the main menu of user choices.
 13. If integer equal to 6 is entered, the program will proceed to the menu choice number 6 and does the following:
 - Divide the value of the first fraction and second fraction.
 - Convert the decimal equivalent of the quotient of the two fractions.
 - Print the quotient value and its decimal equivalent.
 - Let the user press the enter key to proceed back to the main menu of user choices.
 14. If integer equal to 7 is entered, the program will proceed to the menu choice number 7 and does the following:
 - Read an integer through keyboard input from the user for the numerator of the fraction. Given an
 appropriate statement for invalid inputs.
 - Read an integer through keyboard input from the user for the denominator of the fraction. The integer
 should not be equal to 0 to avoid an undefined result. Given an appropriate statement for invalid inputs.
 - Reduce the value of the fraction to the lowest terms.
 - Convert the decimal equivalent of the lowest term value of the fraction.
 - Print the lowest term value and its decimal equivalent.
 - Let the user press the enter key to proceed back to the main menu of user choices.
 15. If integer equal to 8 is entered, the program will proceed to the menu choice number 8 and does the following:
 - Display a closing statement of the program.
 - Exit the program.

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 */
package prog2.prelimgroup01;

import java.util.Scanner;

public class FractionArithmetic {

    // Declare the local variables for FractionArithmetic class.
    static Scanner keyboard;
    static boolean input1Exists;
    static boolean input2Exists;

    public FractionArithmetic() {
    }

    /**
     * Main method to invoke a method to run the application program.*/
    /**
       Algorithm:
       1. Invoke the run method.
     */
    public static void main(String[] args) {
        run();
    }// end of main method

    /**
     * Method to execute the application program.*/
    /**
       Algorithm:
       1. Declare local variables
       2. Invoke the showIntroduction method
       3. Implement a do-while statement that shows and reads the menu choice of the user
          input where the entered number should not be invalid and exceed the available
          choices.
       4. Invoke the showChoices method.
       5. If the user input for the value of the first fraction and second fraction does not exist. Only let
          the user choose limited program choices in a main menu where the user can only choose to do an input
          of the first and second fraction or exit the program before proceeding to other available program choices.
       6. Reassign the value of integer variable "choiceUpperLimit" to 3.
       7. Read the integer through user input that corresponds to the user's choice. Give an appropriate statement
          if the input is invalid.
       8. Implement a switch-case statement that provides cases for a specific routine.
       9. If integer equal to 1 is entered, the program will request the value of the first fraction.
       10. Invoke the requestFraction1 method.
       11. If integer equal to 2 is entered, the program will proceed request the value of the first fraction.
       12. Invoke the requestFraction2 method.
       13. If the user input for the value of the first fraction and second fraction does exist. Let the user
           be able to choose from all the available program choices shown in a main menu.
       14. Reassign the value of integer variable "choiceUpperLimit" to 8.
       15. Read the integer through user input that corresponds to the user's choice. Give an appropriate statement
           if the input is invalid.
       16. If integer equal to 3 is entered, the program will proceed to the addition of two fractions.
       17. Invoke the addition method while passing the fraction1 and fraction2 Fraction variables.
       18. Invoke the pressKey method.
       19. If integer equal to 4 is entered, the program will proceed to the subtraction of two fractions.
       20. Invoke the subtraction method while passing the fraction1 and fraction2 Fraction variables.
       21. Invoke the pressKey method.
       22. If integer equal to 5 is entered, the program will proceed to the multiplication of two fractions.
       23. Invoke the multiplication method while passing the fraction1 and fraction2 Fraction variables.
       24. Invoke the pressKey method.
       25. If integer equal to 6 is entered, the program will proceed to the division of two fractions.
       26. Invoke the division method while passing the fraction1 and fraction2 Fraction variables.
       27. Invoke the pressKey method.
       28. If integer equal to 7 is entered, the program will proceed to the reduction
           of a fraction to the lowest terms.
       29. Invoke the reduce method while passing the value of a fraction from invoking the requestFraction method.
       30. Invoke the pressKey method.
       31. If integer equal to 8 is entered, the program will proceed to display a closing statement of the program
           and exit the program.
     */
    public static void run() {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        int choiceLowerLimit = 1;
        showIntroduction();

        int myPick;
        byte choiceUpperLimit;
        do {
            showChoices();
            if (input1Exists && input2Exists) {
                choiceUpperLimit = 8;
                myPick = enterPick(choiceLowerLimit, choiceUpperLimit);
                switch (myPick) {
                    case 1:
                        fraction1 = requestFraction1();
                        break;
                    case 2:
                        fraction2 = requestFraction2();
                        break;
                    case 3:
                        addition(fraction1, fraction2);
                        pressKey();
                        break;
                    case 4:
                        subtraction(fraction1, fraction2);
                        pressKey();
                        break;
                    case 5:
                        multiplication(fraction1, fraction2);
                        pressKey();
                        break;
                    case 6:
                        division(fraction1, fraction2);
                        pressKey();
                        break;
                    case 7:
                        reduce(requestFraction());
                        pressKey();
                        break;
                    case 8:
                        showExit();
                        break;
                }
            } else {
                choiceUpperLimit = 4;
                myPick = enterPick(choiceLowerLimit, choiceUpperLimit);
                switch (myPick) {
                    case 1:
                        fraction1 = requestFraction1();
                        break;
                    case 2:
                        fraction2 = requestFraction2();
                        break;
                    case 3:
                        reduce(requestFraction());
                        pressKey();
                        break;
                    case 4:
                        showExit();
                        break;
                }
            }
        } while(myPick != choiceUpperLimit);
    } // end of run method

    /**
     * Method to print an introduction statement that displays information about the purpose
     * of the program and guidelines for the user.*/
    /**
       Algorithm:
       1. Print an introduction statement of the program.
     */
    public static void showIntroduction() {
        System.out.print("""
                
                Welcome! This program shows the computation result of the addition, subtraction,\s
                multiplication, division, and the simplification of a fraction.\s""");
        System.out.println("""
                You will be asked\s
                to enter the values of the numerator and denominator of both fractions and then\s
                a menu will be shown from which you can choose to enter value for fraction 1,\s
                enter value for fraction 2, add, subtract, multiply, divide the fractions, reduce\s
                a fraction, and quit from the program.""");
        System.out.println("==================================================================================");
        System.out.println("Please enter the correct inputs for the following:");
    } // end of showIntroduction method

    /**
     * Method to display the available choices for the user to pick from.*/
     /**
       Algorithm:
       1. Declare local variable
       2. If the user input for the value of the first fraction and second fraction does not exist.
          Only print the 1st, 2nd, and 3rd choices of the program in a main menu.
       3. If the user input for the value of the first fraction and second fraction does exist. Print
          all the available program choices shown in a main menu.
     */
    public static void showChoices() {
        int i = 4, x=3;

        System.out.println("\nAvailable Program Choices: ");
        System.out.println("+------------------------------------------+");
        System.out.println("| What do you want to do?                  |");
        System.out.println("|     1. Enter the value of fraction 1     |");
        System.out.println("|     2. Enter the value of fraction 2     |");
        if (input1Exists && input2Exists) {
            i = 8;
            x = 7;
            System.out.println("|     3. Add the fractions                 |");
            System.out.println("|     4. Subtract the fractions            |");
            System.out.println("|     5. Multiply the fractions            |");
            System.out.println("|     6. Divide the fractions              |");
        }
        System.out.println("|     " + x + ". Reduce a fraction                 |");
        System.out.println("|     " + i + ". Exit                              |");
        System.out.println("+------------------------------------------+");
    } // end of showChoices method

    /**
     * Method that reads the user input of a chosen number that corresponds to a specific choice.*/
     /**
       Algorithm:
       1. Declare the local variables.
       2. Implement a do-while statement that reads the menu choice of the user input
          where the entered number should not be invalid and exceed the available
          choices.
       3. Implement a try-catch statement to prevent user without input and determine if
          the input has the appropriate format.
       4. Give an appropriate statement if the input is invalid.
       5. Return the integer variable "pick".
     */
    public static int enterPick(int min, int max) {
        int pick = 0;
        boolean flag;

        do {
            try {
                flag = false;
                System.out.print("Input the number corresponding to your choice: ");
                pick = Integer.parseInt(keyboard.nextLine());
                if (pick < min || pick > max)
                    System.out.println("Invalid input! Please ensure that you enter a number from " + min +
                            " to " + max + ".");
            } catch (NumberFormatException var5) {
                flag = true;
                System.out.println("Invalid input! Please enter a valid number.");
            }
        } while(pick < min || pick > max || flag);

        return pick;
    } // end of enterPick method

    /**
     * Method that reads the user input of the numerator and denominator of a fraction.*/
     /**
       Algorithm:
       1. Declare local variables.
       2. Implement a do-while statement that reads the numerator of a fraction through user input.
       3. Implement a try-catch statement to prevent user without input and determine if
          the input has the appropriate format.
       4. Give an appropriate statement if the input is invalid.
       5. Implement a do-while statement that reads the denominator of a fraction through user input where
          the denominator should not be equal to 0 to avoid an undefined result.
       6. Implement a try-catch statement to prevent user without input and determine if
          the input has the appropriate format.
       7. Give an appropriate statement if the input is invalid.
       8. Declare "fraction" as a new Fraction variable with int numerator and int denominator.
       9. Return the Fraction variable "fraction".
     */
    public static Fraction requestFraction() {
        int numerator = 0;
        int denominator = 0;

        boolean pFlag;
        do {
            try {
                pFlag = false;
                System.out.print("Enter the numerator for the fraction: ");
                numerator = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException var5) {
                pFlag = true;
                System.out.println("Please enter a valid number.");
            }
        } while(pFlag);

        do {
            try {
                pFlag = false;
                System.out.print("Enter the denominator for the fraction: ");
                denominator = Integer.parseInt(keyboard.nextLine());
                if (denominator == 0)
                    System.out.println("Invalid input! Any number divided by zero is undefined.");
            } catch (NumberFormatException var4) {
                pFlag = true;
                System.out.println("Please enter a valid number.");
            }
        } while(pFlag || denominator == 0);

        Fraction fraction = new Fraction(numerator, denominator);
        return fraction;
    } // end of requestFraction method

    /**
     * Method to read the user input of the numerator and denominator of the first fraction.*/
     /**
       Algorithm:
       1. Print an appropriate statement to indicate that the user is entering a value of the first fraction.
       2. Declare "fraction1" as a Fraction variable with int numerator and int denominator.
       3. Invoke the requestFraction method to read the value of the first fraction through user input.
       4. Declare "decimalEq1" as a double variable with the decimal equivalent value of fraction1.
       5. Print the value of the first fraction and its decimal equivalent.
       6. Let the boolean variable "input1Exists" equal to true value.
       7. Invoke the pressKey method.
       8. Return the Fraction variable "fraction1".
     */
    public static Fraction requestFraction1() {
        System.out.println("\nYou are now entering the value of Fraction 1.");
        Fraction fraction1 = requestFraction();
        double decimalEq1 = fraction1.decimalEquivalent();
        System.out.println("Value of Fraction 1: " + fraction1 + " or " + decimalEq1 + ".");
        input1Exists = true;
        pressKey();
        return fraction1;
    } // end of requestFraction1 method

    /**
     * Method to read the user input of the numerator and denominator of the second fraction.*/
     /**
       Algorithm:
       1. Print an appropriate statement to indicate that the user is entering a value of the second fraction.
       2. Declare "fraction2" as a Fraction variable with int numerator and int denominator.
       3. Invoke the requestFraction method to read the value of the first fraction through user input.
       4. Declare "decimalEq2" as a double variable with the decimal equivalent value of fraction1.
       5. Print the value of the first fraction and its decimal equivalent.
       6. Let the boolean variable "input2Exists" equal to true value.
       7. Invoke the pressKey method.
       8. Return the Fraction variable "fraction2".
     */
    public static Fraction requestFraction2() {
        System.out.println("\nYou are now entering the value of Fraction 2.");
        Fraction fraction2 = requestFraction();
        double decimalEq2 = fraction2.decimalEquivalent();
        System.out.println("Value of Fraction 2: " + fraction2 + " or " + decimalEq2 +".");
        input2Exists = true;
        pressKey();
        return fraction2;
    } // end of requestFraction2 method

    /**
     * Method to add two fractions (fraction1 and otherFraction)*/
    /**
       Algorithm:
       1. Declare "sum" as a Fraction variable with int numerator and int denominator.
       2. Add the value of the first fraction to the other fraction.
       3. Declare "sumDecimal" as a double variable with the decimal equivalent value
          of the sum of the two fractions.
       4. Print the sum value of the two fractions and its decimal equivalent.
     */
    public static void addition(Fraction fraction1, Fraction otherFraction) {
        Fraction sum = fraction1.addFraction(otherFraction);
        double sumDecimal = sum.decimalEquivalent();
        System.out.println("" + fraction1 + " plus " + otherFraction + " = " + sum + " ≈ " + sumDecimal + ".");
    } // end of addition method

    /**
     * Method to subtract the fractions (fraction1 and otherFraction)*/
    /**
       Algorithm:
       1. Declare "difference" as a Fraction variable with int numerator and int denominator.
       2. Subtract the value of the first fraction to the other fraction.
       3. Declare "differenceDecimal" as a double variable with the decimal equivalent value
          of the difference of the two fractions.
       4. Print the difference value of the two fractions and its decimal equivalent.
     */
    public static void subtraction(Fraction fraction1, Fraction otherFraction) {
        Fraction difference = fraction1.subtractFraction(otherFraction);
        double differenceDecimal = difference.decimalEquivalent();
        System.out.println("" + fraction1 + " minus " + otherFraction + " = " + difference +
                " ≈ " + differenceDecimal +".");
    } // end of subtraction method

    /**
     * Method to multiply two fractions (fraction1 and otherFraction)*/
    /**
       Algorithm:
       1. Declare "product" as a Fraction variable with int numerator and int denominator.
       2. Multiply the value of the first fraction to the other fraction.
       3. Declare "productDecimal" as a double variable with the decimal equivalent value
          of the product of the two fractions.
       4. Print the product value of the two fractions and its decimal equivalent.
     */
    public static void multiplication(Fraction fraction1, Fraction otherFraction) {
        Fraction product = fraction1.multiplyFraction(otherFraction);
        double productDecimal = product.decimalEquivalent();
        System.out.println("" + fraction1 + " multiplied by " + otherFraction + " = " + product +
                " ≈ " + productDecimal + ".");
    } // end of multiplication method

    /**
     * Method to divide two fractions (fraction1 and otherFraction)*/
    /**
       Algorithm:
       1. Declare "quotient" as a Fraction variable with int numerator and int denominator.
       2. Divide the value of the first fraction to the other fraction.
       3. Declare "quotientDecimal" as a double variable with the decimal equivalent value
          of the quotient of the two fractions.
       4. Print the quotient value of the two fractions and its decimal equivalent.
     */
    public static void division(Fraction fraction1, Fraction otherFraction) {
        Fraction quotient = fraction1.divideFraction(otherFraction);
        double quotientDecimal = quotient.decimalEquivalent();
        System.out.println("" + fraction1 + " divided by " + otherFraction + " = " + quotient +
                " ≈ " + quotientDecimal + ".");
    } // end of division method

    /**
     * Method to reduce a fraction to the lowest terms.*/
    /**
       Algorithm:
       1. Print the original value of the fraction to be reduced with an appropriate statement.
       2. Reduce the original value of the fraction to the lowest terms.
       3. Declare "decimal" as a double variable with the decimal equivalent value
          of the lowest term of the fraction.
       4. Print the lowest term value of the fraction and its decimal equivalent.
     */
    public static void reduce(Fraction fractionToBeReduced) {
        System.out.print("\n" + fractionToBeReduced + " in lowest terms is ");
        fractionToBeReduced.reduceFraction();
        double decimal = fractionToBeReduced.decimalEquivalent();
        System.out.println(fractionToBeReduced + " or " + decimal + ".");
    } // end of reduce method

    /**
     * Method to read the user input of the enter key.*/
    /**
       Algorithm:
       1. Read the user input of the enter key
       2. Advance the scanner to the next line.
     */
    public static void pressKey() {
        System.out.println();
        System.out.println("Press the enter key to return to menu.");
        keyboard.nextLine();
    } // end of pressKey method

    /**
     * Method to display the program closing statement.*/
    /**
       Algorithm:
       1. Print the program closing statement.
       2. Exit by terminating the program.
     */
    public static void showExit() {
        System.out.println(" ");
        System.out.println("+------------------------------------------+");
        System.out.println("|                                          |");
        System.out.println("|     THANK YOU for using the program!     |");
        System.out.println("|                                          |");
        System.out.println("+------------------------------------------+");
        System.exit(0);
    } // end of showExit method

    /**
       Algorithm:
       1. Declare "keyboard" as a new scanner for FractionArithmetic class.
       2. Declare "input1Exists" as a boolean variable with value "false".
       3. Declare "input2Exists" as a boolean variable with value "false".
     */
    static {
        keyboard = new Scanner(System.in);
        input1Exists = false;
        input2Exists = false;
    }
} // end of FractionArithmetic class