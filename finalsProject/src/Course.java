public class Course {
    private String courseNumber;
    private String descriptiveTitle;
    private int units;

    public Course() {
        this.courseNumber = "AAA 111";
        this.descriptiveTitle = "Default Title";
        this.units = 0;
    }

    public Course(String courseNumber, String descriptiveTitle, int units) {
        this.courseNumber = courseNumber;
        this.descriptiveTitle = descriptiveTitle;
        this.units = units;
    }

    public Course (String[] courseList) {
        this.courseNumber = courseList[0];
        this.descriptiveTitle = courseList[1];
        this.units= Integer.valueOf(courseList[2]);
    }

    public Course(Course courseObject) {
        this.courseNumber = courseObject.getCourseNumber();
        this.descriptiveTitle = courseObject.getDescriptiveTitle();
        this.units = courseObject.getUnits();
    }


    public String getCourseNumber() {
        return courseNumber;
    }

    public String getDescriptiveTitle() {
        return descriptiveTitle;
    }
    public int getUnits() {
        return units;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setDescriptiveTitle(String descriptiveTitle) {
        this.descriptiveTitle = descriptiveTitle;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String toString() {
        return getCourseNumber() + "," + getDescriptiveTitle() + ","+ getUnits();
    }
}
