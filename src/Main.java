public class Main {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(2000.50f, 220202, "Optimus Bank");
        BankAccount b2 = new BankAccount(1050.00f, 110101, "Access Bank");
        BankAccount b3 = new BankAccount(20000.00f, 440404, "Jaiz Bank");

        Student s1 = new Student("Karan", 1, b1);
        System.out.println(s1.getDetails());

        ResearchStudent s2 = new ResearchStudent("Ade", 2, b2, "Mathematics");
        System.out.println(s2.getDetails());

        phdStudent s3 = new phdStudent("Kunle", 4, "Mathematics", b3, "Mr. Onobote", "Discrete Mathematics");
        System.out.println(s3.getDetails());
    }
}

class Student {
    private static final int annualFees = 10000;
    private final String name;
    private final int year;

    private final BankAccount bankAccount;

    public Student(String name, int year, BankAccount bankAccount) {
        this.name = name;
        this.year = year;
        this.bankAccount = bankAccount;
    }

    public String getDetails() {
        return "Name : " + this.name + '\n' + "Fees : " + computeFees();
    }

    public float computeFees() {
        return annualFees * this.year;
    }

}

class ResearchStudent extends Student {
    private final String researchArea;

    public ResearchStudent(String name, int year, BankAccount bankAccount,
                           String researchArea) {
        super(name, year, bankAccount);
        this.researchArea = researchArea;
    }
}

class phdStudent extends ResearchStudent {
    private final String supervisor;
    private final String thesisTitle;

    public phdStudent(String name, int year, String researchArea,
                      BankAccount bankAccount,
                      String supervisor, String thesisTitle) {
        super(name, year, bankAccount, researchArea);
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