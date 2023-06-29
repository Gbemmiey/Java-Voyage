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
        }
    }
}

class Student {
    private static final int annualFees = 10000;
    protected String name;
    protected int year;


    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getDetails() {
        return "Name : " + this.name + '\n' + "Fees : " + computeFees();
    }

    public float computeFees() {
        return annualFees * this.year;
    }

    public float computeFees(int ratio) {
        return annualFees * this.year * ratio;
    }

}

class ResearchStudent extends Student {
    private final String researchArea;

    public ResearchStudent(String name, int year,
                           String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    public String getDetails() {
        return this.name + " is a year " + this.year + " research student in " + this.researchArea;
    }

}

class phdStudent extends ResearchStudent {
    private final String supervisor;
    private final String thesisTitle;

    public phdStudent(String name, int year, String researchArea,

                      String supervisor, String thesisTitle) {
        super(name, year, researchArea);
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
    }
}

class BankAccount {
    public float accountBalance;
    public long accountNumber;
    public String bankName;

    public BankAccount(float accountBalance, long accountNumber, String bankName) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

}