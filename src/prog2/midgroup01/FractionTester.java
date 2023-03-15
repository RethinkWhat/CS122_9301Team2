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
    Create a program that facilitates addition, subtraction, multiplication and division of mixed
 numbers (similar with the first activity) but this time all of the inputs/outputs may involve fractions, mixed
 fractions or combination.
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

 Outputs:

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 Algorithm:

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 */
package prog2.midgroup01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;


public class FractionTester extends JFrame {

    /** Method to get user input */
    // All the operations listeners below call this in order to accept input from user
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

    public String invalidInput = "Accepted formats: 4 1/2, 2/4, 3.";
    public String divisionBy0 = "Division by 0 not allowed.";
    public JTextField t1 = new JTextField(10);
    public JTextField t2 = new JTextField(10);
    public JLabel results = new JLabel();

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
        setBounds(10, 10, 300, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Title
        JLabel l1 = new JLabel(" Fraction Calculator");
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setBounds(48, 10, 200, 20);
        add(l1);


        // Fraction 1
        JLabel f1 = new JLabel("Enter fraction 1: ");
        add(f1);
        add(t1);
        f1.setBounds(20, 50, 200, 20);
        t1.setBounds(120, 50, 140, 20);

        // Fraction 2
        JLabel f2 = new JLabel("Enter fraction 2: ");
        add(f2);
        add(t2);
        f2.setBounds(20, 80, 200, 20);
        t2.setBounds(120, 80, 140, 20);

        // Addition
        JButton add = new JButton("+");
        add(add);
        add.setBounds(20, 120, 50, 20);

        // Subtract
        JButton subtract = new JButton("-");
        add(subtract);
        subtract.setBounds(85, 120, 50, 20);

        // Multiply
        JButton multiply = new JButton("x");
        add(multiply);
        multiply.setBounds(150, 120, 50, 20);

        // Divide
        JButton divide = new JButton("/");
        add(divide);
        divide.setBounds(215, 120, 50, 20);


        // Results for Calculator
        add(results);
        results.setBounds(20, 160, 300, 20);

        // line
        JLabel line = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - -");
        add(line);
        line.setBounds(0, 175, 500, 50);
        line.setFont(new Font("Arial", Font.BOLD, 20));


        // Reduce
        JLabel f3 = new JLabel("Reduce a Fraction");
        f3.setFont(new Font("Arial", Font.BOLD, 20));
        add(f3);
        f3.setBounds(55, 200, 200, 50);

        // TextBox for input
        JTextField t3 = new JTextField(10);
        JButton reduce = new JButton("reduce");
        add(t3);
        add(reduce);
        t3.setBounds(17, 250, 140, 20);
        reduce.setBounds(165, 250, 75, 20);

        //Results for reduce
        JLabel resultsForReduce = new JLabel();
        resultsForReduce.setBounds(20,280, 300, 20);
        add(resultsForReduce);


        /** Event handler for addition */

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    fraction1 = getUserInput(t1);
                    fraction2 = getUserInput(t2);
                    MixedFraction sum = fraction1.add(fraction2);
                    double sumDecimal = sum.decimalEquivalent();
                    results.setText("Sum = " + sum.toMixedFraction() + " ≈ " + sumDecimal);
                    results.setForeground(Color.black);
                } catch (NumberFormatException except) {
                    results.setForeground(Color.RED);
                    results.setText(invalidInput);
                } catch (ArithmeticException arithExcept) {
                    results.setForeground(Color.RED);
                    results.setText(divisionBy0);
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
                    results.setForeground(Color.black);
                } catch (NumberFormatException except) {
                    results.setForeground(Color.RED);
                    results.setText(invalidInput);
                } catch (ArithmeticException arithExcept) {
                    results.setText(divisionBy0);
                    results.setForeground(Color.RED);
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
                    results.setForeground(Color.black);
                } catch (NumberFormatException except) {
                    results.setText(invalidInput);
                    results.setForeground(Color.RED);
                } catch (ArithmeticException arithExcept) {
                    results.setText(divisionBy0);
                    results.setForeground(Color.RED);
                }
            }
        });

        /** Event handler for division */
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    fraction1 = getUserInput(t1);
                    fraction2 = getUserInput(t2);
                    MixedFraction quotient = fraction1.divide(fraction2);
                    double quotientDecimal = quotient.decimalEquivalent();
                    results.setText("Quotient = " + quotient.toMixedFraction() + " ≈ " + quotientDecimal);
                    results.setForeground(Color.black);
                } catch (NumberFormatException except) {
                    results.setText(invalidInput);
                    results.setForeground(Color.RED);
                } catch (ArithmeticException arithExcept) {
                    results.setText(divisionBy0);
                    results.setForeground(Color.RED);
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
                    resultsForReduce.setForeground(Color.black);
                } catch (NumberFormatException except) {
                    resultsForReduce.setText(invalidInput);
                    resultsForReduce.setForeground(Color.RED);
                } catch (ArithmeticException arithExcept) {
                    resultsForReduce.setText(divisionBy0);
                    resultsForReduce.setForeground(Color.RED);
                }
            }
        });
    }
} // end of FractionArithmetic class