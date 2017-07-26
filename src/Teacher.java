public class Teacher extends SchoolMember {
    private int id;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Teacher(String firstname, String lastname, int grade) {
        super(firstname, lastname, grade);
        this.id = SchoolMember.id++;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher teacher = (Teacher) o;

        return id == teacher.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
