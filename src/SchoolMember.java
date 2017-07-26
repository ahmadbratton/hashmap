public abstract class SchoolMember {
   protected String firstname;
    protected String lastname;
   protected static int id = 1;
    protected int grade;

    public SchoolMember() {
    }

    public SchoolMember(String firstname, String lastname, int grade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.grade = grade;
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


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
