package prog2.finalsgroup01;

import java.io.*;
import java.util.*;

public class RunApplication {
    private static Scanner keyboard = new Scanner(System.in);
    private static Scanner inputReader;
    private PrintWriter printerToFile;

    public Course courseObject;

    String[] arrayOfInfo;


    // Main Method
    public static void main(String[] args) {
        RunApplication program = new RunApplication();
        try {
            program.execute();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    // Method to hold executing program
    public void execute() throws IOException{
        boolean accountExists = existingAccount();
        final String user = getDataFile(accountExists);
        RunApplication program;
        do {
            try {
                program = new RunApplication();
                program.run(user);
            } catch (FileNotFoundException e1) {
                e1.toString();
                System.out.println("File Not Found");
            } catch (IOException e2) {
                e2.toString();
            }
        } while(true);
    }

    // Method to ask user whether an account exists
    public boolean existingAccount() {
        System.out.println("");
        System.out.println(" -----------------------------------------------------------------");
        System.out.println("Do you have an existing record? ");
        System.out.println("    <1> Yes, I do.");
        System.out.println("    <2> No, I do not. Please create one for me.");
        System.out.println(" -----------------------------------------------------------------");
        int input = requestInt("    --> ",1,2);
        if (input == 1) {
            return true;
        }
        return false;
    }

    // Method to request SLU ID Number
    public String requestIdNumber(){
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enter your SLU ID number:");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("--> ");
        return keyboard.nextLine();
    }
    // Check whether ID Number exists
//    public boolean IdNumberExists() {

 //   }

    // Create Personal Record File of user if user does not exist
    public Student createPersonalRecordFile(String idNumber, String fileLocation) throws IOException {
        System.out.println("Enter your name: ");
        System.out.println("    Following the format Last name, First Name");
        System.out.println("        ex: Tank, Rithik");
        System.out.print("--> ");
        String input = keyboard.nextLine();
        String inputArray[] = input.split(", ") ;
        String lastName = inputArray[0];
        String firstName = inputArray[1];
        Student studentObject = new Student(idNumber, firstName, lastName);
        printerToFile = new PrintWriter(fileLocation);
        printerToFile.println(studentObject);
        printerToFile.close();

        return  studentObject;
    }

    // Get data file when user file exists
    public String getDataFile(boolean accountExists) throws FileNotFoundException, IOException {
        String idNumber = requestIdNumber();
        String fileLocation = "midtermProject/src/prog2/finalsgroup01/students/" + idNumber;
        if (accountExists) {
            inputReader = new Scanner(new FileReader(fileLocation));
        } else {
            createPersonalRecordFile(idNumber, fileLocation);
        }
        return fileLocation;
    }

    // Method to handle displaying possible menu options to user
    public void myChecklistManagement() {
        System.out.println("");
        System.out.println("My Checklist Management");
        System.out.println("    <1> Show subjects for a school term");
        System.out.println("    <2> Show subjects with grades for each term");
        System.out.println("    <3> Enter grades for subjects recently finished");
        System.out.println("    <4> Edit a course");
        System.out.println("    <5> Quit");
        System.out.println("");
    }

    public void myLimitedCheckListManagement() {
        System.out.println("");
        System.out.println("    My Checklist Management");
        System.out.println("        <1> Show subjects for a school term");
        System.out.println("        <2> Enter grades for subjects recently finished");
        System.out.println("        <3> Quit");
        System.out.println("");
    }


    // Method to handle user choice in main menu
    public void run(String user) throws FileNotFoundException, IOException {
        inputReader = new Scanner(new File(user));
        inputReader.nextLine();
        boolean fileIsNotEmpty = inputReader.hasNextLine();

        int choice;
        String prompt = "Enter a number: ";
        if (fileIsNotEmpty) {
            myChecklistManagement();
            choice = requestInt(prompt, 1, 5);
            switch (choice) {
                case 1: // Display the course
                    requestYearAndTerm(false, user);
                    pressKey("Press enter to return to main menu");
                    break;
                case 2: // Display the user grade and course
                    requestYearAndTerm(true, user);
                    pressKey("Press enter to return to main menu");
                    break;
                case 3: // Enter user grade
                    System.out.println("");
                    System.out.println("Kindly enter the year and term the subject whose grade you would like to edit is offered in.");
                    enterGrade(requestYearAndTerm(true,user), user);
                    pressKey("Grade has been edited, Press enter to return to menu.");
                    break;
                case 4: // Edit course
                    break;
                case 5: //exit
                    System.exit(0);
                    break;
            }
        } else {
            myLimitedCheckListManagement();
            choice = requestInt(prompt,1,3);
            switch (choice) {
                case 1: // Display the course;
                    requestYearAndTerm(false, user);
                    pressKey("Press enter to return to main menu");
                    break;
                case 2: // Enter user grade
                    System.out.println("");
                    System.out.println("Kindly enter the year and term the subject whose grade you would like to edit is offered in.");
                    enterGrade(requestYearAndTerm(true,user), user);
                    break;
                case 3: // exit
                    System.exit(0);
                    break;
            }
        }
    }


    // Method to handle whenever user would like to request an integer
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

    // Method to hold the concatenation of file name of COURSES
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
        return "midtermProject/src/prog2/finalsgroup01/courseList/BSCS/BSCS"+year+"/BSCS"+year+"-"+semester;
    }

    // Method to wait for user to press a key
    public void pressKey(String prompt) {
        System.out.println(prompt);
        keyboard.nextLine();
    }

    // ---------------------------------------------------- CASE 1 & CASE 2 Shared Code ----------------------------------------------------
    // Method for user to request the year and term they'd like to check the course offerings of
    public String requestYearAndTerm(boolean grades, String user) throws FileNotFoundException, IOException{
        int year = requestInt("Year: ", 1,3);
        int term = requestInt("Term: ", 1,3);
        String fileLocation = fileName(year,term);
        displaySubjects(fileLocation, grades, user);
        return fileLocation;
    }

    // Method to handle displaying all the subjects to the user
    public void displaySubjects(String fileLocation, boolean grades, String user) throws FileNotFoundException, IOException{
        String[] yearAndTerm;
        inputReader = new Scanner(new FileReader(fileLocation));
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");

        yearAndTerm = inputReader.nextLine().split(",");
        System.out.printf("%2s%-8s%-8s%8s%-8s%n", "", "Year =", yearAndTerm[0], "Term =", yearAndTerm[1]);
        inputReader.close();
        if (!grades) {
            displayOnlyCourseList(fileLocation);
        }
        else {
            displayCourseListAndStudentGrades(fileLocation, user);
        }
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________");
    }
    // ---------------------------------------------------- END OF CASE 1 & 2 Shared Code ----------------------------------------------------


    // ---------------------------------------------------- CASE 1 ----------------------------------------------------
    // Sub method of display subjects which handles only displaying courses
    public void displayOnlyCourseList(String fileLocation) throws FileNotFoundException{
        ArrayList<Course> courseList = createCourseList(fileLocation);
        System.out.printf("%-30s%-110s%-20s%n", "Course No.", "Descriptive Title", "Units");
        for (Course course: courseList) {
            System.out.printf("%-30s%-110s%-20s%n",
                    course.getCourseNumber(),
                    course.getDescriptiveTitle(),
                    course.getUnits());
        }
    }

    // ---------------------------------------------------- CASE 2 ----------------------------------------------------
   // Sub menu of display subjects which handles displaying courses AND GRADES
    public void displayCourseListAndStudentGrades(String courseFileLocation, String userFileLocation) throws FileNotFoundException, IOException {
        System.out.printf("%-30s%-110s%-20s%-30s%n", "Course No.", "Descriptive Title", "Units", "Grades");
        // Holds all the courses
        ArrayList<Course> courseList = createCourseList(courseFileLocation);

        // Holds all the courses with grades
        ArrayList<CourseGrade> gradeList = createGradeCourseList(courseList, userFileLocation);

        // Holds the combination of grades and all courses
        ArrayList<CourseGrade> courseAndGradeList = combineCourseAndGradeList(courseList, gradeList);

        String grade = "";
        for (int x = 0; x < courseAndGradeList.size(); x++) {
            if (courseAndGradeList.get(x).getGrade() ==-1)
                grade = "Not Taken yet";
            else
                grade = String.valueOf(courseAndGradeList.get(x).getGrade()) ;
            System.out.printf("%-30s%-110s%-20s%-110s%n",
                    courseAndGradeList.get(x).getCourseNumber(),
                    courseAndGradeList.get(x).getDescriptiveTitle(),
                    courseAndGradeList.get(x).getUnits(),
                    grade
                    );
        }
    }

    // Method to handle creating a list of all the courses
    public ArrayList<Course> createCourseList(String courseFileLocation) throws FileNotFoundException {
        inputReader = new Scanner(new FileReader(courseFileLocation));
        ArrayList<Course> courseList = new ArrayList<>();
        Course courseObject;
        int x=0;
        inputReader.nextLine(); // The first line shows the year and term
        while (inputReader.hasNextLine()) {
            courseObject = new Course(inputReader.nextLine().split(","));
            courseList.add(courseObject);
            x++;
        }
        inputReader.close();
        return courseList;
    }

    // Method to handle creating a list of all the courses with grades
    public ArrayList<CourseGrade> createGradeCourseList(ArrayList<Course> courseList, String userFileLocation) throws FileNotFoundException {
        ArrayList<CourseGrade> gradesList = new ArrayList<>();
        CourseGrade courseGradeObject;
        String[] lineRead;
        Course searchIndex;
        int x = 0;
        inputReader = new Scanner(new FileReader(userFileLocation));
        inputReader.nextLine();                                 // Ignore first line in file
        while (inputReader.hasNextLine()) {                     // Reads user file
            lineRead = inputReader.nextLine().split(","); //Read first line in file
            searchIndex = new Course(lineRead[0]);
            courseGradeObject = lookForCourseDetails(searchIndex, courseList); // Look for the course details given the courseNumber
            gradesList.add(courseGradeObject);
            gradesList.get(x).setGrade(Integer.parseInt(lineRead[1]));
            x++;
        }
        inputReader.close();
        return gradesList;
    }

    // Method to look for the details of a course given just the courseNumber.
    public CourseGrade lookForCourseDetails(Course searchIndex, ArrayList<Course> courseList) throws FileNotFoundException{
        Course courseObj;
        for (int x = 0; x < courseList.size(); x++) {
            if(courseList.get(x).getCourseNumber().equalsIgnoreCase(searchIndex.getCourseNumber())) {
                courseObj = new Course(courseList.get(x));;
                return new CourseGrade(courseObj,0);    //Sets grade to 0 but creates a courseGrade object
            }
        }
        return new CourseGrade();
    }

    public ArrayList<CourseGrade> combineCourseAndGradeList(ArrayList<Course> courseList, ArrayList<CourseGrade> gradeList){
        ArrayList<CourseGrade> arrayToBeReturned = new ArrayList<>();
        for(Course course: courseList) {
            boolean isMatch = false;
            for (CourseGrade grade : gradeList) {
                if (Objects.equals(course.getCourseNumber(), grade.getCourseNumber())) {
                    arrayToBeReturned.add(grade);
                    isMatch = true;
                    break;
                }
            }
            if (!isMatch)
                arrayToBeReturned.add(new CourseGrade(course, -1));
        }
        return arrayToBeReturned;
    }

    // ---------------------------------------------------- CASE 3 ----------------------------------------------------
    public void enterGrade(String courseFileLocation, String userFileLocation) throws IOException {
        // Holds all the courses
        ArrayList<Course> courseList = createCourseList(courseFileLocation);
        CourseGrade editedCourse = acceptCourseNumber(courseFileLocation, userFileLocation);  //
        String[] lineRead;
        File temp = new File("midtermProject/src/prog2/finalsgroup01/students/temp.txt");


        inputReader = new Scanner(new FileReader(userFileLocation));            // Reads all the grades in user file
        printerToFile = new PrintWriter(new FileWriter(temp, true));    // Writer to the temporary file

        String user = inputReader.nextLine();                                   // Read details of user from first line
        printerToFile.println(user);
        boolean gradeForCourseExists = false;

        while (inputReader.hasNextLine()) {                                     // While elements exist in the user file
            lineRead = inputReader.nextLine().split(",");

            // For all values where course number not equal the course number of the value entered print to temp file
            if (lineRead[0].equalsIgnoreCase(editedCourse.getCourseNumber())) {
                // don't print to file, since we want to print the new CourseGrade object
                gradeForCourseExists = true; // let the program know that a previous grade was already printed to file with the said course number
                
            } else {
                printerToFile.println(lineRead[0] + "," + lineRead[1]);   //print user file content to temp file
                gradeForCourseExists = false;
            }
        } //end of while loop

        if (gradeForCourseExists) {
            printerToFile.println(editedCourse.getCourseNumber() + "," + editedCourse.getGrade());
            inputReader.close();
            printerToFile.close();

            printerToFile = new PrintWriter(new FileWriter(userFileLocation, false));
            inputReader = new Scanner(new FileReader(temp));
            while (inputReader.hasNextLine()) {
                printerToFile.println(inputReader.nextLine());
            }


        } else {
            printerToFile = new PrintWriter(new FileWriter(userFileLocation, true));
            printerToFile.println(editedCourse.getCourseNumber()+","+editedCourse.getGrade());
            inputReader.close();
            printerToFile.close();
        }


        printerToFile.close();
        inputReader.close();
        temp.delete();

        
    }

    public CourseGrade acceptCourseNumber(String courseFileLocation, String userFileLocation) throws IOException {
        String courseNumber;
        int grade;

        // Holds all the courses
        ArrayList<Course> courseList = createCourseList(courseFileLocation);
        // Holds all the courses with grades
        ArrayList<CourseGrade> gradeList = createGradeCourseList(courseList, userFileLocation);
        // Holds the combination of grades and all courses
        ArrayList<CourseGrade> courseAndGradeList = combineCourseAndGradeList(courseList, gradeList);

        do {
            System.out.println("Enter the course number of the grade you would like to input");
            System.out.print("    --> ");
            courseNumber = keyboard.nextLine().toUpperCase();

            for (CourseGrade course: courseAndGradeList) {
                if (courseNumber.equalsIgnoreCase(course.getCourseNumber())) {
                    System.out.println("Enter the grade of the subject: ");
                    grade =requestInt("--> ", 65,99);
                    course.setGrade(grade);
                    return course;
                }
            }
            System.out.println("Enter an existing course number");
        } while(true);
    }

    // ---------------------------------------------------- CASE 4 ----------------------------------------------------
    public void editCourse() {
        System.out.println("What would you like to edit?");
        System.out.println("    <1> Course No.");
        System.out.println("    <2> Descriptive Title");
        System.out.println("    <3> Units");
        int choice = requestInt("   ->", 1,3);
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }

}
