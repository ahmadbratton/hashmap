import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            Student firstGrader = new Student("clone" + i,"lastname" + i,1);
            students.add(firstGrader);

        }


        ArrayList<Teacher> teachers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Teacher newTeacher = new Teacher("teacher" + i , "teachname"+i, 1);
            teachers.add(newTeacher);

        }



        Map<Teacher, Set<Student>> classRoom = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            Set<Student> classsMates = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                classsMates.add(students.get((i*5)+j));
            }
            classRoom.put(teachers.get(i), classsMates);

        }

        System.out.println("key set");
        for (Teacher teacher : classRoom.keySet()) {
            System.out.println(teacher);
        }

        System.out.println();


        System.out.println("values");

        for (Set studentSet: classRoom.values()) {
            System.out.println(studentSet);
        }

        System.out.println();

        System.out.println("keys & values!!");

        for (Map.Entry<Teacher, Set<Student>> schoolClasses: classRoom.entrySet() ) {
            System.out.println(schoolClasses);

        }












    }
}
