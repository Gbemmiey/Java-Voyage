public class ResearchStudent extends Student {
    private final String researchArea;

    public ResearchStudent(String name, int year,
                           String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    public String getDetails() {
        return this.name + " is a year " + this.year + " research student in " + this.researchArea;
    }

    public float computeFees() {
        return Student.annualFees * this.year * 0.9f;
    }


}
