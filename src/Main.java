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

        iterateFwd(studentList);
        iterateBkwd(studentList);

    }

    public static void iterateFwd(List<Student> students) {

        ListIterator it = students.listIterator();

        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getDetails());
        }
    }

    public static void iterateBkwd(List<Student> students) {

        ListIterator it = students.listIterator(students.size());

        while (it.hasPrevious()) {
            Student s = (Student) it.previous();
            System.out.println(s.getDetails());
        }
    }
}
