package prog2.finalsgroup01;

public class Student{
    String firstName;
    String lastName;
    CourseGrade courseGrade[];
    String idNumber;


    public Student( String idNumber, String firstName, String lastName, CourseGrade[] courseAndGrades) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseGrade = courseAndGrades;
    }

    public Student(String idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        Course defaultCourse = new Course();
        this.courseGrade = new CourseGrade[0];
    }

/*    @Override
    public String toString() {
        String stringToBeDisplayed = "";
        for (int index =0; this.getCourseArray() > index; index++)
            stringToBeDisplayed += this;
        return stringToBeDisplayed;
    }*/

}