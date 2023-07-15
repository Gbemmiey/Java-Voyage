import Algorithms.Fibonacci.DummyFibonacci;
import Algorithms.Fibonacci.TrialFibonacci;
import OOP_BASICS.Student;

import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

//        List<Student> studentList = new LinkedList<Student>();
//
//        studentList.add(new Student("Karan", 1));

        // Add to ArrayList with Index
//        studentList.add(0, new ResearchStudent("Ade", 2, "Mathematics"));
//
//        studentList.add(new phdStudent("Kunle", 4, "Mathematics", "Mr. Onobote", "Discrete Mathematics"));
//
//        iterateFwdBkwd(studentList);

        System.out.println(TrialFibonacci.getFibonacci(40));
        System.out.println("\n\n");

        System.out.println(DummyFibonacci.getFib(40));

    }

    public static void iterateFwd(List<Student> students) {

        ListIterator it = students.listIterator();

        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getDetails());
        }
    }

    public static void iterateFwdBkwd(List<Student> students) {

        ListIterator it = students.listIterator();

        System.out.println("Printing Forwards");

        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getDetails());
        }
        System.out.println("Printing Backwards");
        while (it.hasPrevious()) {
            Student s = (Student) it.previous();
            System.out.println(s.getDetails());
        }
    }
}
