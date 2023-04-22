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
        final String user = getDataFile();
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
        System.out.println("        Do you have an existing record? ");
        System.out.println("                <1> Yes, I do.");
        System.out.println("                <2> No, I do not. Please create one for me.");
        System.out.println(" -----------------------------------------------------------------");
        int input = requestInt("        --> ",1,2);
        if (input == 1) {
            return true;
        }
        return false;
    }

    // Method to request SLU ID Number
    public String requestIdNumber(){
        System.out.println();
        System.out.println("Enter your SLU ID number");
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
    public String getDataFile() throws FileNotFoundException, IOException {
        boolean accountExists = existingAccount();
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
        System.out.println("<1> Show subjects for a school term");
        System.out.println("<2> Show subjects with grades for each term");
        System.out.println("<3> Enter grades for subjects recently finished");
        System.out.println("<4> Edit a course");
        System.out.println("<5> Quit");
        System.out.println("");
    }

    // Method to handle user choice in main menu
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
    public void requestYearAndTerm(boolean grades, String user) throws FileNotFoundException, IOException{
        int year = requestInt("Year: ", 1,3);
        int term = requestInt("Term: ", 1,3);
        String fileLocation = fileName(year,term);
        displaySubjects(fileLocation, grades, user);
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
        pressKey("Press enter to return to main menu");
    }
    // ---------------------------------------------------- END OF CASE 1 & 2 Shared Code ----------------------------------------------------


    // ---------------------------------------------------- CASE 1 ----------------------------------------------------
    // Sub method of display subjects which handles only displaying courses
    public void displayOnlyCourseList(String fileLocation) throws FileNotFoundException{
        inputReader = new Scanner(new FileReader(fileLocation));
        System.out.printf("%5s%-30s%-110s%-20s%n", "", "Course No.", "Descriptive Title", "Units");
        inputReader.nextLine();
        while (inputReader.hasNextLine()) {
            arrayOfInfo = inputReader.nextLine().split(",");
            courseObject = new Course(arrayOfInfo);
            System.out.printf("%5s%-30s%-110s%-20s%-110s%n", "",
                    courseObject.getCourseNumber(),
                    courseObject.getDescriptiveTitle(),
                    courseObject.getUnits());
        }
    }

    // ---------------------------------------------------- CASE 2 ----------------------------------------------------
   // Sub menu of display subjects which handles displaying courses AND GRADES
    public void displayCourseListAndStudentGrades(String courseFileLocation, String userFileLocation) throws FileNotFoundException, IOException {
        System.out.printf("%5s%-30s%-110s%-20s%-30s%n", "", "Course No.", "Descriptive Title", "Units", "Grades");
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
            System.out.printf("%5s%-30s%-110s%-20s%-110s%n", "",
                    courseAndGradeList.get(x).getCourseNumber(),
                    courseAndGradeList.get(x).getDescriptiveTitle(),
                    courseAndGradeList.get(x).getUnits(),
                    grade
                    );
        }


    }

    //Method to get the number of courses in a specific file
    public int getNumberOfCourseInFile(String courseFileLocation) throws FileNotFoundException {
        inputReader = new Scanner(new FileReader(courseFileLocation));
        int x = 0;
        while(inputReader.hasNextLine()) {
            x++;
            inputReader.nextLine();
        }
        inputReader.close();
        return x;
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
        for (int x = 0; x < courseList.size()-1; x++) {
            if(courseList.get(x).getCourseNumber().equalsIgnoreCase(searchIndex.getCourseNumber())) {
                courseObj = new Course(courseList.get(x));;
                return new CourseGrade(courseObj,0);    //Sets grade to 0 but creates a courseGrade object
            }

        }
        return new CourseGrade();
    }

    public ArrayList<CourseGrade> combineCourseAndGradeList(ArrayList<Course> courseList, ArrayList<CourseGrade> gradeList){
        ArrayList<CourseGrade> arrayToBeReturned = new ArrayList<>();
        CourseGrade courseGradeObject;
        ArrayList<String> listOfCourses = new ArrayList<>();

        for(Course course: courseList){
            boolean isMatch = false;
            for(CourseGrade grade: gradeList){
                if(Objects.equals(course.getCourseNumber(), grade.getCourseNumber())) {
                    arrayToBeReturned.add(grade);
                    isMatch = true;
                    break;
                }
            }
                            if(!isMatch){
                                arrayToBeReturned.add(new CourseGrade(course, -1));
                            }
        }

   /*     for(Iterator<Course> c = courseList.iterator(); c.hasNext();) {
            Course course = c.next();
                        for(Iterator<CourseGrade> cg = gradeList.iterator(); cg.hasNext();) {
                            CourseGrade grade = cg.next();
                            if(Objects.equals(grade.getCourseNumber(), course.getCourseNumber())){
                               arrayToBeReturned.add(grade);
                               temp.remove(course);
                               break;
                            }
                        }
        }
        for(Course course: temp){
            arrayToBeReturned.add(new CourseGrade(course, -1));
        }  */

        return arrayToBeReturned;
    }

}
