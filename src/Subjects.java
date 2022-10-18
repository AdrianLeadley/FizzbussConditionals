public class Subjects {

    private int pysics;
    private int biology;
    private int chemistry;
    private int percent;
    private int total;

    public int getPysics() {
        return pysics;
    }

    public int getBiology() {
        return biology;
    }

    public int getChemistry() {
        return chemistry;
    }


    public int getPercent() {
        return percent;
    }


    public Subjects(int pysics, int chemistry, int biology) {
    this.pysics = pysics;
    this.chemistry = chemistry;
    this.biology = biology;

    }

    public static void main(String[] args) {
        Subjects student1 = new Subjects (99, 91, 92);
        student1.total = ((student1.getBiology() + student1.getChemistry() + student1.getPysics()) * 100);
        System.out.println(student1.total);

        int result = student1.total / 450 ;
        System.out.println(result);
    }
}






