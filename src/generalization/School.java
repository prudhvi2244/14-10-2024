package generalization;


public class School extends Person {
    private String schoolName;
    private String grade;


    public School(String name,double age,String city, String email, String schoolName, String grade) {
        super(name,age,city,email);
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public void displaySchoolDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Grade: " + grade);
    }

    public School(){

    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}