public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Karan", 1);
        Student s2 = new ResearchStudent("Ade", 2, "Mathematics");
        Student s3 = new phdStudent("Kunle", 4, "Mathematics", "Mr. Onobote", "Discrete Mathematics");
        Student[] students = new Student[]{s1, s2, s3};
        PrintDetails(students);
    }

    public static void PrintDetails(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getDetails());
            System.out.println(student.computeFees());
        }
    }
}
