import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Student> studentList = new LinkedList<Student>();

        studentList.add(new Student("Karan", 1));

        // Add to ArrayList with Index
        studentList.add(0, new ResearchStudent("Ade", 2, "Mathematics"));

        studentList.add(new phdStudent("Kunle", 4, "Mathematics", "Mr. Onobote", "Discrete Mathematics"));
        PrintDetails(studentList);

        studentList.removeLast();


    }

    public static void PrintDetails(LinkedList<Student> students) {
        for (Student s : students) {
            System.out.println(s.getDetails());
            System.out.println(s.computeFees());
        }
    }
}
