import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new LinkedList<Student>();

        studentList.add(new Student("Karan", 1));

        // Add to ArrayList with Index
        studentList.add(0, new ResearchStudent("Ade", 2, "Mathematics"));

        studentList.add(new phdStudent("Kunle", 4, "Mathematics", "Mr. Onobote", "Discrete Mathematics"));
        PrintDetails(studentList);

    }

    public static void PrintDetails(List<Student> students) {

        ListIterator it = students.listIterator();
        
        for (Student s : students) {
            System.out.println(s.getDetails());
            System.out.println(s.computeFees());
        }
    }
}
