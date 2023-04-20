import java.io.*;
import java.util.Scanner;

public class RunApplicationNew {
    private Scanner keyboard = new Scanner(System.in);
    private Scanner inputReader;
    private PrintWriter printerToFile;

    public Course courseObject;

    String[] arrayOfInfo;
    //public String userFile = (String) getDataFile();

    public static void main(String[] args) {
        RunApplicationNew program = new RunApplicationNew();
        program.execute();
    }

    public void execute() {
        final String user = getDataFile();
        RunApplicationNew program;
        do {
            try {
                program = new RunApplicationNew();
                program.run(user);
            } catch (FileNotFoundException e1) {
                e1.toString();
                System.out.println("File Not Found");
            } catch (IOException e2) {
                e2.toString();
            }
        } while(true);
    }

    public String getDataFile() {
        System.out.println();
        System.out.println("Enter student's name: ");
        System.out.println("    Following the format Last name, First Name");
        System.out.println("    ex. ex: Tank, Rithik");
        System.out.print("--> ");
        String input = keyboard.nextLine();
        String inputArray[] = input.split(", ") ;
        String lastName = inputArray[0];
        String firstName = inputArray[1];
        boolean error =false;
        while(!error){
        try{
            System.out.println("Enter your SLU ID Number");
            System.out.print("--> ");
            String iDnumber = String.valueOf(Integer.parseInt(keyboard.nextLine()));
            error = true;
        }catch (NumberFormatException e1){
            e1.printStackTrace();
            System.out.println("You must enter an ID Number: ");
        }
        }
//        System.out.println("Enter your SLU ID number");
//        System.out.print("--> ");
//        String idNumber =String.valueOf(Integer.parseInt(keyboard.nextLine()));
        String fileLocation = "finalsProject/students/" + lastName+firstName;
        try {
            inputReader = new Scanner(new FileReader(fileLocation));
        } catch(FileNotFoundException e1) {
            try {
                printerToFile = new PrintWriter(fileLocation);
            } catch(IOException e2) {
                System.out.println("IO EXCEPTION");
            }
        }
        return fileLocation;
    }

    public void run(String user) throws FileNotFoundException, IOException {
        myChecklistManagement();
        int choice = requestInt("Enter a number: ", 1,5);
        switch(choice) {
            case 1:
                requestYearAndTerm(false, user);
                break;
            case 2:
                requestYearAndTerm(true, user);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    public void myChecklistManagement() {
        System.out.println("");
        System.out.println("My Checklist Management");
        System.out.println("<1> Show subjects for a school term");
        System.out.println("<2> Show subjects with grades for each term");
        System.out.println("<3> Enter grades for subjects recently finished");
        System.out.println("<4> Edit a course");
        System.out.println("<5> Quit");
        System.out.println("");
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

    public String fileName(int year, int choiceOfSemester) {
        String semester = "";
        switch (choiceOfSemester){
            case 1:
                semester = "firstSem";
                break;
            case 2:
                semester = "secondSem";
                break;
            case 3:
                semester = "shortTerm";
                break;
        }
        return "finalsProject/courseList/BSCS/BSCS"+year+"/BSCS"+year+"-"+semester;
    }

    public void pressKey(String prompt) {
        System.out.println(prompt);
        keyboard.nextLine();
    }

    // ---------------------------------------------------- CASE 1 & CASE 2 Shared Code ----------------------------------------------------
    public void requestYearAndTerm(boolean grades, String user) throws FileNotFoundException{
        int year = requestInt("Year: ", 1,3);
        int term = requestInt("Term: ", 1,3);
        String fileLocation = fileName(year,term);
        displaySubjects(fileLocation, grades, user);
    }

    public void displaySubjects(String fileLocation, boolean grades, String user) throws FileNotFoundException{
        String[] yearAndTerm;
        inputReader = new Scanner(new FileReader(fileLocation));
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");

        yearAndTerm = inputReader.nextLine().split(",");
        System.out.printf("%2s%-8s%-8s%8s%-8s%n", "", "Year =", yearAndTerm[0], "Term =", yearAndTerm[1]);
        inputReader.close();
        if (!grades) {
            displayOnlyCourseList(fileLocation);
        }
        else {
            displayCourseListAndStudentGrades(fileLocation, user);
        }
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");
        pressKey("Press enter to return to main menu");
    }
    // ---------------------------------------------------- END OF CASE 1 & 2 Shared Code ----------------------------------------------------


    // ---------------------------------------------------- CASE 1 ----------------------------------------------------
    public void displayOnlyCourseList(String fileLocation) throws FileNotFoundException{
        inputReader = new Scanner(new FileReader(fileLocation));
        System.out.printf("%5s%-30s%-110s%-20s%n", "", "Course No.", "Descriptive Title", "Units");
        inputReader.nextLine();
        while (inputReader.hasNextLine()) {
            arrayOfInfo = inputReader.nextLine().split(",");
            courseObject = new Course(arrayOfInfo);
            System.out.printf("%5s%-30s%-110s%-20s%n", "",
                    courseObject.getCourseNumber(),
                    courseObject.getDescriptiveTitle(),
                    courseObject.getUnits());
        }
    }

    // ---------------------------------------------------- CASE 2 ----------------------------------------------------
    public void displayCourseListAndStudentGrades(String courseFileLocation, String user) throws FileNotFoundException {
        CourseGrade courseGradeObject;
        String grade;
        int count=0;
        int x =0;

        System.out.printf("%5s%-30s%-110s%-20s%-50s%n", "", "Course No.", "Descriptive Title", "Units", "Grades");

        // To pass in array to array[][]
        inputReader = new Scanner(new FileReader(user));
        while(inputReader.hasNextLine()) {
            count++;
            inputReader.next();
        }
        String[][] arrayOfGrades = new String[count][1];
        inputReader.close();

        inputReader = new Scanner(new FileReader(user));
        while(inputReader.hasNextLine()) { /** This is where it's messing up */
            System.out.println(x);
            arrayOfGrades[x] = inputReader.nextLine().split(",");
            x++;
        }
        inputReader.close();

        inputReader = new Scanner(new FileReader(courseFileLocation));
        inputReader.nextLine();
        while (inputReader.hasNextLine()) {
            arrayOfInfo = inputReader.nextLine().split(",");
            courseObject = new Course(arrayOfInfo);
            grade = checkIfGradeExistsForSubject(courseObject.getCourseNumber(), arrayOfGrades);
            System.out.printf("%5s%-30s%-110s%-20s%-110s%n", "",
                    courseObject.getCourseNumber(),
                    courseObject.getDescriptiveTitle(),
                    courseObject.getUnits(),
                    grade);
        }
        inputReader.close();
    }

    public String checkIfGradeExistsForSubject(String courseNumber, String[][] arrayOfGrades) {
        for(int count =0; arrayOfGrades[0].length >=count-1;count++) {
            if (courseNumber.equalsIgnoreCase(arrayOfGrades[count][0])) {
                return arrayOfGrades[count][1];
            }
        }
        return "Not Taken Yet";
    }
}
