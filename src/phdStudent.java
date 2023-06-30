public class phdStudent extends ResearchStudent {
    private final String supervisor;
    private final String thesisTitle;

    public phdStudent(String name, int year, String researchArea,

                      String supervisor, String thesisTitle) {
        super(name, year, researchArea);
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
    }
}
