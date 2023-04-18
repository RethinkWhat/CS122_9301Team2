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
    Sum
    Difference
    Product
    Quotient
    Reduced Number
    Decimal Equivalent of Number

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 */
package prog2.midgroup01;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This is the executable class for the MixedFraction calculator.
 *
 * @author Rizza Montevirgen
 * @author Georcelle Nuarin
 * @author Sean Drei Octavo
 * @author Sebastian Siccuan
 * @author Rithik Tank
 * @author Jan Adrian Tayag
 */
public class FractionTester extends JFrame {
    /**
     * This is a String variable for an error message when an unaccepted format is inputted by user.
     */
    public String invalidInput = "Accepted formats: 4 1/2, 2/4, 3.";

    /**
     * This is a String variable for an error message when division by 0 is attempted.
     */
    public String divisionBy0 = "Division by 0 not allowed.";

    /**
     * The text field which accepts input for fraction 1.
     */
    public JTextField t1 = new JTextField(10);

    /**
     * The text field which accepts input for fraction 2.
     */
    public JTextField t2 = new JTextField(10);

    /**
     * The results which display after the operations are preformed.
     */
    public JLabel results = new JLabel();

    /**
     * Declared these here so that we would not declare different MixedFraction objects in each method.
     */
    MixedFraction fraction1, fraction2;

    /**
     * Process:
     * This is a method to get the user's input. To get the input from the textField in the
     * GUI we call getText() and assign it to the variable input. Then we create a String array object
     * called fractionString with length 3 to hold the whole number, numerator, and denominator that would be
     * inputted by the user in the JTextField. We make use of three different try and catch statements to handle
     * the 3 possible inputs by a user: a whole number, a fraction, and a mixed fraction. The first try and catch splits
     * the input of the user such that it will be split after a space and a slash -> input.split(" |/").
     * After the separation is done, it assigns the value to fractionString with [0] being the index for wholeNumber,
     * [1] numerator, and [2] denominator respectively. Using these indexes are assigned to the variables wholeNumber,
     * numerator, and denominator declared earlier. We make use of the Integer.valueOf because the values are still in
     * String format after the split was done earlier. Next we move on to the second try and catch which makes use of
     * input.split("/"). This means there will only be one split, and it will be exactly where the slash is placed. The
     * remaining processes are the same in this try and catch except that wholeNumber will be assigned the value of 0.
     * Last is the possibility that a whole number was entered. In this possibility we do not need to split anything.
     * All we do is assign the value to wholeNumber, set denominator to 1 and numerator to 0. After which we create a
     * MixedFraction object assign it the appropriate values and return it.
     *
     * @param inputChoice
     *        the JTextField object representing the input from the user
     * @return a {@code MixedFraction} object with the values of the input
     */
    //          Algorithm:
    //            1. Accept a JTextField variable as a parameter
    //            2. Create a String object and assign its value to the getText() method of the passed in JTextField variable
    //            3. Create a String array object called fractionString and set its length to 3
    //            4. Create wholeNumber, numerator, denominator, MixedFraction variables
    //            5. Create a try and catch which catches an ArrayIndexOutOfBoundsException
    //                Try:
    //                    5.1. Set fractionString value to input.split(" |/")
    //                    5.2. Set the value of the denominator to the last element of the fractionString array
    //                    5.3. Set the value of the numerator to the second element of the fractionString array
    //                    5.4. Set the value of the wholeNumber to the first element of the fractionString array
    //            6. Create a try and catch which catches another ArrayIndexOutOfBoundsException
    //                Try:
    //                    6.1. Set fractionString value to input.split("/")
    //                    6.2. Set the value of the denominator to the second element of the fractionString array
    //                    6.3. Set the value of the numerator to the first element of the fractionString array
    //            7. Create a try and catch which catches another ArrayIndexOutOfBoundsException
    //                Try:
    //                    6.1. Set wholeNumber value to the integer value of input
    //                    6.2. Set the value of the denominator to 1
    //                    6.3. Set the value of the numerator to 0
    public MixedFraction getUserInput(JTextField inputChoice) {
        String input = inputChoice.getText();
        String[] fractionString = new String[3];
        int wholeNumber = 0;
        int numerator, denominator;
        MixedFraction fraction;
        try {                                                   // This handles the mixed fraction input
            fractionString = input.split(" |/");          // This splits according to a space and to a slash
            denominator = Integer.valueOf(fractionString[2]);
            numerator = Integer.valueOf(fractionString[1]);
            wholeNumber = Integer.valueOf(fractionString[0]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            try {                                               // This handles the fraction input
                fractionString = input.split("/");        // This splits according to a slash
                numerator = Integer.valueOf(fractionString[0]);
                denominator = Integer.valueOf(fractionString[1]);
            }catch (ArrayIndexOutOfBoundsException x) {         // This handles the whole number input
                wholeNumber = Integer.valueOf(input);
                numerator = 0;
                denominator = 1;
            }
        }
        fraction = new MixedFraction(wholeNumber, numerator, denominator);
        return (fraction);
    }


    /**
     * This is the main method to invoke a method to run the application program.
     */
    //      Algorithm:
    //        1. Call FractionTester
    public static void main(String[] args) {
        new FractionTester();
    }// end of main method


    /**
     * This handles the placement of the GUI components.
     */
    //      Algorithm:
    //        1. Set the appropriate specifications of the GUI including, dimension, layout option, visibility, and the
    //           default close operation
    //        2. Create a JLabel object and display 'Fraction Calculator' to user
    //        3. Set the object to bold, increase font size, and set its bounds
    //        4. Add it to the GUI
    //        5. Create 2 JLabel objects which will act as a prompt for the user to enter fraction 1 and 2
    //        6. Create 2 JTextField objects for both JLabel objects so the user can input a fraction
    //        7. Set the bounds of all four objects and add them to the GUI
    //        8. Create 4 JButton objects for addition, subtraction, multiplication, and division
    //        9. Set the bounds and add these objects to the GUI
    //        10. Add the results declared earlier to the GUI
    //        11. Create a JLabel object and display 'Reduce a Fraction' to user
    //        12. Set the object to bold, increase font size, and set its bounds
    //        13. Add the label to the GUI
    //        14. Create a JTextField object to accept the fraction to be reduced
    //        15. Create a JButton object for the number the user would like reduced
    public FractionTester() {
        setBounds(10, 10, 300, 400); // set the dimensions of the actual GUI
        setLayout(null);
        // There are different layout options, we opted for null which made setting the x-axis and y-axis of the
        // components easier. Sir chose to go for a gridLayout in his demonstration
        setVisible(true); // This is so that the GUI would show. By default setVisible is set to false
        setDefaultCloseOperation(EXIT_ON_CLOSE); // This is so that exit button works on the GUI
        setResizable(false); // Makes it so that the user cannot resize the GUI

        // Title
        JLabel l1 = new JLabel(" Fraction Calculator");         // JLabel is string you would like displayed
        l1.setFont(new Font("Arial", Font.BOLD, 20));     // Set the font type, font weight and font size
        l1.setBounds(48, 10, 200, 20);            // where the text would appear
                                                                     // Set the x-axis, y-axis, width, and height of the text
        add(l1);                                                     // add the object to the GUI
        // To make an object appear in the GUI you use the add(nameOfObject)


        // Fraction 1
        JLabel f1 = new JLabel("Enter fraction 1: ");
        add(f1);
        add(t1);
        // t1 is a JTextField object and this is where the user inputs the fraction
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
        // add is a JButton object and this is a button a user can press
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
        add(results); // This is the text that displays after each computation on the calculator
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


        /**
         * This is the event handler for addition. If an exception occurs during any of the above operations,
         * the method catches the exception and sets the foreground color of the results JLabel object to red,
         * and sets the text of the results JLabel object to display an error message.
         *
         * @param ae
         *        An ActionEvent object that represents the action that occurred
         * @throws NumberFormatException
         *         Thrown when an invalid input is detected
         * @throws ArithmeticException
         *         Thrown when division by 0 is attempted
         */
        //      Algorithm:
        //        1. Create add.addActionListener
        //        2. Create the actionPerformed method and pass in ActionEvent
        //        3. Create a try and catch which catches NumberFormationException and ArithmeticException
        //             Try:
        //                 3.1. Call the getUserInput method and pass in the JTextField t1 assign it to fraction1
        //                 3.2. Call the getUserInput method and pass in the JTextField t2 assign it to fraction2
        //                 3.3. Create a MixedFraction object called sum and call the add method on fraction1 and fraction2
        //                 3.4. Create a sumDecimal variable and call the decimalEquivalent method on the sum computed for earlier
        //                 3.5  Set the value of results to the sum in mixedFraction and display it and the sum in decimal to user
        //                 3.6. Set the foreground of the results to black
        //                    Catch NumberFormationException:
        //                 3.7. Set foreground of results to red and set results to the value of invalidInput
        //                    Catch ArithmeticException:
        //                 3.8. Set foreground of results to red and set results to the value of divisionBy0
        add.addActionListener(new ActionListener() {
            // An actionListener is an object listening for an action to occur, such as something being clicked.
            public void actionPerformed(ActionEvent ae) {
                // An ActionEvent is the event that occurred.

                try {
                    fraction1 = getUserInput(t1);
                    // t1 and t2 are the text boxes for enter fraction 1 and enter fraction 2
                    // We are passing two into getUserInput so that the method knows which text box to get user input from
                    fraction2 = getUserInput(t2);
                    MixedFraction sum = fraction1.add(fraction2); // Call the add method
                    double sumDecimal = sum.decimalEquivalent(); // call the decimalEquivalent method
                    results.setText("Sum = " + sum.toMixedFraction() + " ≈ " + sumDecimal);
                    // Set the value of the results JLabel object declared earlier to the sum
                    results.setForeground(Color.black);
                    // We set foreground to black here because after each error the color is set to red
                } catch (NumberFormatException except) {
                    // In case a string is passed into the text box or a format that we cannot handle is passed into
                    // the text box
                    results.setForeground(Color.RED);
                    results.setText(invalidInput);
                } catch (ArithmeticException arithExcept) {
                    // In case the denominator is set to 0 -> Something that cannot b e
                    results.setForeground(Color.RED);
                    results.setText(divisionBy0);
                }
            }
        });

        /**
         *
         * This is the event handler for subtraction. If an exception occurs during any of the above operations,
         * the method catches the exception and sets the foreground color of the results JLabel object to red,
         * and sets the text of the results JLabel object to display an error message.
         *
         * @param ae
         *        An ActionEvent object that represents the action that occurred
         * @throws NumberFormatException
         *         Thrown when an invalid input is detected
         * @throws ArithmeticException
         *         Thrown when division by 0 is attempted
         *
         */
        //      Algorithm:
        //        1. Create subtract.addActionListener
        //        2. Create the actionPerformed method and pass in ActionEvent
        //        3. Create a try and catch which catches NumberFormationException and ArithmeticException
        //           Try:
        //             3.1. Call the getUserInput method and pass in the JTextField t1 assign it to fraction1
        //             3.2. Call the getUserInput method and pass in the JTextField t2 assign it to fraction2
        //             3.3. Create a MixedFraction object called difference and call the add method on fraction1 and fraction2
        //             3.4. Create a differenceDecimal variable and call the decimalEquivalent method on the difference computed for earlier
        //             3.5  Set the value of results to the difference in mixedFraction and display it and the difference in decimal to user
        //             3.6. Set the foreground of the results to black
        //                  Catch NumberFormationException:
        //             3.7. Set foreground of results to red and set results to the value of invalidInput
        //                  Catch ArithmeticException:
        //             3.8. Set foreground of results to red and set results to the value of divisionBy0
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

        /**
         * This is the event handler for multiplication. If an exception occurs during any of the above operations,
         * the method catches the exception and sets the foreground color of the results JLabel object to red,
         * and sets the text of the results JLabel object to display an error message.
         *
         * @param ae
         *        An ActionEvent object that represents the action that occurred
         * @throws NumberFormatException
         *         Thrown when an invalid input is detected
         * @throws ArithmeticException
         *         Thrown when division by 0 is attempted
         */
        //      Algorithm:
        //        1. Create an addActionListener
        //        2. Create the actionPerformed method and pass in ActionEvent
        //        3. Create a try and catch which catches NumberFormationException and ArithmeticException
        //           Try:
        //              3.1. Call the getUserInput method and pass in the JTextField t1 assign it to fraction1
        //              3.2. Call the getUserInput method and pass in the JTextField t2 assign it to fraction2
        //              3.3. Create a MixedFraction object called sum and call the product method on fraction1 and fraction2
        //              3.4. Create a productDecimal variable and call the decimalEquivalent method on the product computed for earlier
        //              3.5  Set the value of results to the product in mixedFraction and display it and the product in decimal to user
        //              3.6. Set the foreground of the results to black
        //                   Catch NumberFormationException:
        //              3.7. Set foreground of results to red and set results to the value of invalidInput
        //                   Catch ArithmeticException:
        //              3.8  Set foreground of results to red and set results to the value of divisionBy0
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

        /**
         * This is the event handler for division. If an exception occurs during any of the above operations,
         * the method catches the exception and sets the foreground color of the results JLabel object to red,
         * and sets the text of the results JLabel object to display an error message.
         *
         * @param ae
         *        An ActionEvent object that represents the action that occurred
         * @throws NumberFormatException
         *         Thrown when an invalid input is detected
         * @throws ArithmeticException
         *         Thrown when division by 0 is attempted
         */
        //      Algorithm:
        //        1. Create an addActionListener
        //        2. Create the actionPerformed method and pass in ActionEvent
        //        3. Create a try and catch which catches NumberFormationException and ArithmeticException
        //           Try:
        //              3.1. Call the getUserInput method and pass in the JTextField t1 assign it to fraction1
        //              3.2. Call the getUserInput method and pass in the JTextField t2 assign it to fraction2
        //              3.3. Create a MixedFraction object called sum and call the quotient method on fraction1 and fraction2
        //              3.4. Create a quotientDecimal variable and call the decimalEquivalent method on the quotient computed for earlier
        //              3.5  Set the value of results to the quotient in mixedFraction and display it and the quotient in decimal to user
        //              3.6. Set the foreground of the results to black
        //                   Catch NumberFormationException:
        //              3.7. Set foreground of results to red and set results to the value of invalidInput
        //                   Catch ArithmeticException:
        //              3.8. Set foreground of results to red and set results to the value of divisionBy0
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    fraction1 = getUserInput(t1);
                    fraction2 = getUserInput(t2);
                    MixedFraction quotient = fraction1.divide(fraction2);
                    double quotientDecimal = quotient.decimalEquivalent();
                    results.setForeground(Color.black);
                    results.setText("Quotient = " + quotient.toMixedFraction() + " ≈ " + quotientDecimal);
                } catch (NumberFormatException except) {
                    results.setText(invalidInput);
                    results.setForeground(Color.RED);
                } catch (ArithmeticException arithExcept) {
                    results.setText(divisionBy0);
                    results.setForeground(Color.RED);
                }
            }
        });

        /**
         * This is the event handler for reduce fraction. If an exception occurs during any of the above operations,
         * the method catches the exception and sets the foreground color of the results JLabel object to red,
         * and sets the text of the results JLabel object to display an error message.
         *
         * @param ae
         *         An ActionEvent object that represents the action that occurred
         * @throws NumberFormatException
         *         Thrown when an invalid input is detected
         * @throws ArithmeticException
         *         Thrown when division by 0 is attempted
         */
        //      Algorithm:
        //        1. Create an addActionListener
        //        2. Create the actionPerformed method and pass in ActionEvent
        //        3. Create a try and catch which catches NumberFormationException and ArithmeticException
        //           Try:
        //              3.1. Call the getUserInput method and pass in the JTextField t1 assign it to the MixedFraction object fraction
        //              3.2. Call the mixedFractionToImproper method on the fraction
        //              3.3. call the decimalEquivalent method on the fraction and assign its value to a double variable
        //              3.4  Display the reduced fraction and the reduced fraction in decimal to user
        //                  Catch NumberFormationException:
        //              3.7. Set foreground of results to red and set results to the value of invalidInput
        //                   Catch ArithmeticException:
        //              3.8 3.7. Set foreground of results to red and set results to the value of divisionBy0
        reduce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    MixedFraction fraction = getUserInput(t3);
                    double reducedFraction = fraction.mixedFractionToImproper().decimalEquivalent();
                    resultsForReduce.setText("Reduced = " + fraction.reduce() + " ≈ " + reducedFraction);
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