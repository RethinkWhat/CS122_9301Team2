package prog2.finalsgroup01;

public class CourseGrade extends Course {
    private int grade;
    private String remarks;

    public String getRemarks() {return remarks;}

    public void setRemarks(String remarks) {this.remarks = remarks;}



    public CourseGrade(Course courseObject, int grade) {
        super(courseObject);
        this.grade = grade;
    }

    public CourseGrade() {
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.getGrade();
    }
}
