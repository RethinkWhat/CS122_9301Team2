import java.io.*;
import java.util.Scanner;

public class RunApplication {
    private Scanner keyboard = new Scanner(System.in);
    private Scanner inputReader;


    public static void main(String[] args) {
        RunApplication program;
        do {
            try {
                program = new RunApplication();
                program.run();
            } catch (FileNotFoundException e1) {
                e1.toString();
                System.out.println("File Not Found");
            } catch (IOException e2) {
                e2.toString();
            }
        } while(true);



    }

    public void run() throws FileNotFoundException, IOException {
        myChecklistManagement();
        int choice = requestInt("Enter a number: ", 1,5);
        switch(choice) {
            case 1:
                displaySubjectsSwitchCase(false);
                break;
            case 2:
                displaySubjectsSwitchCase(true);
                break;
            case 3:
                enterGrade();
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    public void myChecklistManagement() {
        System.out.println();
        System.out.println("My Checklist Management");
        System.out.println("<1> Show subjects for each school term");
        System.out.println("<2> Show subjects with grades for each term");
        System.out.println("<3> Enter grades for subjects recently finished");
        System.out.println("<4> Edit a course");
        System.out.println("<5> Quit");
        System.out.println();
    }


    public int requestInt(String prompt, int minValue, int maxValue) {
        int input = 0;
        do {
            try {
                System.out.print(prompt);
                input = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("You entered an invalid integer. Please enter a valid integer.");
            }
            if (input <minValue || input > maxValue) {
                System.out.println("The number must be from " + minValue + " to " + maxValue + ".");
            }
        } while (input < minValue || input > maxValue);
        return input;
    }


/*
    File Format is as follows:
    Year, Term
    Course No., Descriptive title, units
     */

    public void displaySubjects(String file, boolean grades) throws FileNotFoundException, IOException {
        int count = 0;
        String text = "x";
        String[] yearAndTerm;
        inputReader = new Scanner(new FileReader(file));
        String[] arrayOfInfo;

        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");

        yearAndTerm = inputReader.nextLine().split(",");
        System.out.printf("%2s%-8s%-8s%8s%-8s%n", "", "Year = ", yearAndTerm[0], "Term = ", yearAndTerm[1]);
        if (!grades) {
            System.out.printf("%5s%-20s%-110s%-20s%n", "", "Course No.", "Descriptive Title", "Units");
            while (inputReader.hasNextLine()) {
                arrayOfInfo = inputReader.nextLine().split(",");
                System.out.printf("%5s%-20s%-110s%-20s%n", "", arrayOfInfo[0], arrayOfInfo[1], arrayOfInfo[2]);
            }
        } else {
            System.out.printf("%5s%-20s%-110s%-20s%-20s%n", "", "Course No.", "Descriptive Title", "Units", "Grades");
            while (inputReader.hasNextLine()) {
                arrayOfInfo = inputReader.nextLine().split(",");
                if (arrayOfInfo.length !=4)
                    System.out.printf("%5s%-20s%-110s%-20s%-20s%n", "", arrayOfInfo[0], arrayOfInfo[1], arrayOfInfo[2], "Not Taken Yet");
                else
                    System.out.printf("%5s%-20s%-110s%-20s%-20s%n", "", arrayOfInfo[0], arrayOfInfo[1], arrayOfInfo[2], arrayOfInfo[3]);
            }
        }
        inputReader.close();
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");
    }

    public void displaySubjectsSwitchCase(boolean grades) throws FileNotFoundException, IOException {
        String prompt = "Press enter key to see courses for the next term.";
        displaySubjects("courseList/BSCS/BSCS1/BSCS1-firstSem",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS1/BSCS1-secondSem",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS1/BSCS1-shortTerm",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS2/BSCS2-firstSem",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS2/BSCS2-secondSem",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS2/BSCS2-shortTerm",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS3/BSCS3-firstSem",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS3/BSCS3-secondSem",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS3/BSCS3-shortTerm",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS4/BSCS4-firstSem",grades);
        pressKey(prompt);
        displaySubjects("courseList/BSCS/BSCS4/BSCS4-secondSem",grades);
        pressKey("Press enter to return to main menu");

    }
    public void pressKey(String prompt) {
        System.out.println(prompt);
        keyboard.nextLine();
    }

    public void enterGrade() throws FileNotFoundException, IOException {
        int choice;
        String file = "";
        String prompt = "Options: \n  <1> First Semester\n  <2> Second Semester\n  <3> Short Term";
        System.out.println("In what year level is the subject you completed offered");
        System.out.println("Options: \n  <1> First Year\n  <2> Second Year\n  <3> Third Year\n  <4> Fourth Year");
        choice = requestInt("--> ", 1,4);
        System.out.println("What Semester?");
        switch(choice) {
            case 1:
                System.out.println(prompt);
                file = fileName(1,requestInt("--> ",1,3));
                break;
            case 2:
                System.out.println(prompt);
                file = fileName(2,requestInt("--> ",1,3));
                break;
            case 3:
                System.out.println(prompt);
                file = fileName(3,requestInt("--> ",1,3));
                break;
            case 4:
                System.out.println("Options: \n  <1> First Semester\n  <2> Second Semester");
                file = fileName(4,requestInt("<1> First Semester \n<2> Second Semester",1,2));
                break;
        }
        displaySubjects(file,true);
        inputReader = new Scanner(new FileReader(file));
        PrintWriter printerToFile = new PrintWriter(new FileWriter(file));
        int index = requestCourseNo1(getArrayOfCourseNos(file));
        String[] arrayToEdit = new String[4];
        int grade = requestInt("Enter the grade: ", 65,99);
        for(int count = 0; index!=count; count++) {
            inputReader.nextLine();
            if (index==count) {
                arrayToEdit = inputReader.nextLine().split(",");
                arrayToEdit[4] = String.valueOf(grade);
                printerToFile.println(arrayToEdit[0]+","+arrayToEdit[1]+ "," + arrayToEdit[2]+","+arrayToEdit[3]+","+arrayToEdit[4]);
                inputReader.close();
            }
        }
    }

    public int searchArray(String[] arrayOfCourseNos, String input) {
        for (int index = 0; index < arrayOfCourseNos.length-1; index++) {
            if (input.equalsIgnoreCase(arrayOfCourseNos[index])) {
                return index;
            }
        }
        return -1;
    }

    public int requestCourseNo1(String[] arrayOfCourseNos) {
        int arrayIndex =-1;
        String courseNo;
        do {
            System.out.print("Enter course number: ");
            courseNo = keyboard.nextLine();
            arrayIndex = searchArray(arrayOfCourseNos, courseNo);
            if (arrayIndex ==-1)
                System.out.println("Please enter a valid course number.");
        } while(arrayIndex ==-1);
        return arrayIndex;
    }


    public String[] getArrayOfCourseNos(String file) throws FileNotFoundException, IOException {
        String temp[];
        int length=0;
        inputReader = new Scanner(new FileReader(file));
        System.out.println();
        System.out.println("Here is a full list of the course offerings in this year and semester.");
        System.out.println("Kindly input the Course Number of the subject whose grade you would like to input");
        displaySubjects(file, true);

        while (inputReader.hasNext()) length++;
        String[] arrayOfCourses = new String[length];

        for(int count =0;inputReader.hasNext();count++){
            temp = inputReader.nextLine().split(",");
            arrayOfCourses[count] = temp[0];
        }
        inputReader.close();
        return arrayOfCourses;
    }

    public String fileName(int year, int choiceOfSemester) {
        String file = "courseList/BSCS/";
        switch (year) {
            case 1:
                file += "BSCS1/BSCS1";
                break;
            case 2:
                file += "BSCS2/BSCS2";
                break;
            case 3:
                file += "BSCS3/BSCS3";
                break;
            case 4:
                file += "BSCS4/BSCS4";
                break;
        }
        switch (choiceOfSemester) {
            case 1:
                file += "-firstSem";
                break;
            case 2:
                file += "-secondSem";
                break;
            case 3:
                file += "-shortTerm";
                break;
        }
        System.out.println(file);
        return file;
    }




}
