public class Student{
    String studentName;
    CourseGrade courseGrade;
    int idNumber;


    public Student(String studentName, CourseGrade courseAndGrades, int idNumber) {
        this.idNumber = idNumber;
        this.studentName = studentName;
        this.courseGrade = courseAndGrades;
    }

/*    @Override
    public String toString() {
        String stringToBeDisplayed = "";
        for (int index =0; this.getCourseArray() > index; index++)
            stringToBeDisplayed += this;
        return stringToBeDisplayed;
    }*/

}