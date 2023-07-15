package OOP_BASICS;

public class Student implements Person {
    protected static final int annualFees = 10000;
    protected String name;
    protected int year;


    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getDetails() {
        return "Name : " + this.name + '\n' + "Fees : " + computeFees();
    }

    @Override
    public float computeSalary() {
        return annualFees;
    }

    protected float computeFees() {
        return annualFees * this.year;
    }

}
