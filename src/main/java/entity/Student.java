package entity;

public class Student {
    private String EnrolID;

    public Student() {
    }

    public Student(String enrolID, String firstname, String lastname, int age) {
        EnrolID = enrolID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    private String firstname;

    public String getEnrolID() {
        return EnrolID;
    }

    public void setEnrolID(String enrolID) {
        EnrolID = enrolID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String lastname;
    private int age;
}
