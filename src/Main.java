import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Karan", 1));
        studentList.add(new ResearchStudent("Ade", 2, "Mathematics"));
        studentList.add(new phdStudent("Kunle", 4, "Mathematics", "Mr. Onobote", "Discrete Mathematics"));
        PrintDetails(studentList);
    }

    public static void PrintDetails(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s.getDetails());
            System.out.println(s.computeFees());
        }
    }
}
