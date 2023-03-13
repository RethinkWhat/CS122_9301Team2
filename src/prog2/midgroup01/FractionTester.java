/**
 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

 Group Number: 2
 Members:
 1. Tank, Rithik                    - 2233293@slu.edu.ph
 2. Montevirgen, Rizza M.           - 2234110@slu.edu.ph
 3. Nuarin Georcelle Leisley U.     - 2234664@slu.edu.ph
 4. Octavo, Sean Drei A.            - 2220360@slu.edu.ph
 5. Siccuan, Sebastian A            - 2233205@slu.edu.ph
 6. Tayag, Jan Adrian A.            - 2234554@slu.edu.ph

 CLASS CODE & Schedule: 9301 CS 122 7:30 - 8:30 & 9:00 - 10:30 TF
 Date of Programming: March-7-2023
 Activity Name: Midterm Group Project 2

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
package prog2.midgroup01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FractionTester extends JFrame {

    public MixedFraction getUserInput(JTextField inputChoice) {
        String input = inputChoice.getText();
        String[] fractionString = new String[3];
        int wholeNumber = 0;
        int numerator, denominator;
        MixedFraction fraction;

        try {
            fractionString = input.split(" |/");
            denominator = Integer.valueOf(fractionString[2]);
            numerator = Integer.valueOf(fractionString[1]);
            wholeNumber = Integer.valueOf(fractionString[0]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            try {
                fractionString = input.split("/");
                numerator = Integer.valueOf(fractionString[0]);
                denominator = Integer.valueOf(fractionString[1]);
            }catch (ArrayIndexOutOfBoundsException x) {
                wholeNumber = Integer.valueOf(input);
                numerator = 0;
                denominator = 1;
            }
        }
        fraction = new MixedFraction(wholeNumber, numerator, denominator);
        return (fraction);

    }

    public String invalidInput = "Invalid input. Accepted formats: 4 1/2, 2/4, 3.";
    public String divisionBy0 = "Division by 0 not allowed.";
    public JTextField t1 = new JTextField(10);
    public JTextField t2 = new JTextField(10);

    public JLabel errorForReduce = new JLabel();
    public JLabel errorForCalculator = new JLabel();

    MixedFraction fraction1, fraction2;

    /** Main method to invoke a method to run the application program.*/
    /*
       Algorithm:
       1. Call the FractionTester
     */
    public static void main(String[] args) {
        new FractionTester();
    }// end of main method


    public FractionTester() {
        setBounds(210,210,280,400);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Title
        JLabel l1 = new JLabel(" Fraction Calculator");
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        add(l1);


        // Fraction 1
        JLabel f1 = new JLabel("Enter fraction 1: ");
        add(f1);
        add(t1);

        // Fraction 2
        JLabel f2 = new JLabel("Enter fraction 2: ");
        add(f2);
        add(t2);

        // Addition
        JButton add = new JButton("+");
        add(add);

        // Subtract
        JButton subtract = new JButton("-");
        add(subtract);

        // Multiply
        JButton multiply = new JButton("x");
        add(multiply);

        // Divide
        JButton divide = new JButton("/");
        add(divide);


        // Results for Calculator
        JLabel results = new JLabel();
        add(results);

        // Error for Calculator
        add(errorForCalculator);
        errorForCalculator.setForeground(Color.RED);

        // Reduce
        JLabel f3 = new JLabel("Reduce a Fraction");
        f3.setFont(new Font("Arial", Font.BOLD, 20));
        add(f3);

        // TextBox for input
        JTextField t3 = new JTextField(10);
        JButton reduce = new JButton("reduce");
        add(t3);
        add(reduce);

        //Results for reduce
        JLabel resultsForReduce = new JLabel();
        add(resultsForReduce);

        //Error for reduce
        add(errorForReduce);
        errorForReduce.setForeground(Color.RED);

        /** Event handler for addition */
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                try {
                    fraction1 = getUserInput(t1);
                    fraction2 = getUserInput(t2);
                    MixedFraction sum = fraction1.add(fraction2);
                    double sumDecimal = sum.decimalEquivalent();
                    results.setText("Sum = " + sum.toMixedFraction() + " ≈ " + sumDecimal);
                } catch(NumberFormatException except) {
                    errorForCalculator.setText(invalidInput);
                } catch (ArithmeticException arithExcept) {
                    errorForCalculator.setText(divisionBy0);
                }
            }
        });

        /** Event handler for subtraction */
        subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    fraction1 = getUserInput(t1);
                    fraction2 = getUserInput(t2);
                    MixedFraction difference = fraction1.subtract(fraction2);
                    double differenceDecimal = difference.decimalEquivalent();
                    results.setText("Difference = " + difference.toMixedFraction() + " ≈ " + differenceDecimal);
                } catch (NumberFormatException except) {
                    errorForCalculator.setText(invalidInput);
                } catch (ArithmeticException arithExcept) {
                    errorForCalculator.setText(divisionBy0);
                }
            }
        });

        /** Event handler for multiplication */
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    fraction1 = getUserInput(t1);
                    fraction2 = getUserInput(t2);
                    MixedFraction product = fraction1.multiply(fraction2);
                    double productDecimal = product.decimalEquivalent();
                    results.setText("Product = " + product.toMixedFraction() + " ≈ " + productDecimal);
                } catch(NumberFormatException except) {
                    errorForCalculator.setText(invalidInput);
                } catch (ArithmeticException arithExcept) {
                    errorForCalculator.setText(divisionBy0);
                }
            }
        });

        /** Event handler for division */
        divide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                try {
                    fraction1 = getUserInput(t1);
                    fraction2 = getUserInput(t2);
                    MixedFraction quotient = fraction1.divide(fraction2);
                    double quotientDecimal = quotient.decimalEquivalent();
                    results.setText("Quotient = " + quotient.toMixedFraction() + " ≈ " + quotientDecimal);
                } catch(NumberFormatException except) {
                    errorForCalculator.setText(invalidInput);
                } catch (ArithmeticException arithExcept) {
                    errorForCalculator.setText(divisionBy0);
                }
            }

        });

        /** Event handler for reduce fraction */
        reduce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    MixedFraction fraction = getUserInput(t3);
                    double quotientFraction = fraction.mixedFractionToImproper().decimalEquivalent();
                    resultsForReduce.setText("Reduced = " + fraction.reduce() + " ≈ " + quotientFraction);
                } catch(NumberFormatException except) {
                    errorForReduce.setText(invalidInput);
                } catch(ArithmeticException arithExcept) {
                    errorForReduce.setText(divisionBy0);
                }
            }
        });
    }
} // end of FractionArithmetic class