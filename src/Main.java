import Algorithms.DivideAndConquer.Sorting.QuickSort;
import OOP_BASICS.Student;

import java.util.Arrays;
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

//        System.out.println(TrialFibonacci.getFibonacci(40));
//        System.out.println("\n\n");
//
//        System.out.println(DummyFibonacci.getFib(40));


//        System.out.println(BinarySearch.getSearch(input, 3));
        int[] input = {1, 20, 31, 4, 50, 6, 7, 81, 9, 10, 2000, 102, 11, 12, 13, 142, 15, 163, 17, 108, 19, 20};
        // int[] input = {1, 0, 21, 34, 4, 2, 100, 24, 67, 1, 0};
//        System.out.println(Arrays.toString(MergeSort.sort(input)));

        System.out.println(Arrays.toString(QuickSort.sort(input)));


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
