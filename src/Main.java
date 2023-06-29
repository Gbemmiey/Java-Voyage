public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Karan", 2);
        System.out.println(s1.getDetails());

        ResearchStudent s2 = new ResearchStudent("Ade", 2, "Mathematics");
        System.out.println(s2.getDetails());
    }
}

class Student {
    private final int annualFees = 10000;
    private final String name;
    private final int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getDetails() {
        return "Name : " + this.name + '\n' + "Fees : " + computeFees();
    }

    public float computeFees() {
        return this.annualFees * this.year;
    }

}

class ResearchStudent {
    private static final int annualFees = 10000;
    private final String name;
    private final int year;
    private final String researchArea;

    public ResearchStudent(String name, int year, String researchArea) {
        this.name = name;
        this.year = year;
        this.researchArea = researchArea;
    }

    public String getDetails() {
        return "Name : " + this.name + '\n'
                + "Fees : " + computeFees()
                + '\n' + "Area : " + this.researchArea;
    }

    public float computeFees() {
        return annualFees * this.year;
    }

}