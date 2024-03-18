public class Train {
    private String company;
    private String grade;

    public Train() {
    }

    public Train(String company, String type) {
        this.company = company;
        this.grade = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "company='" + company + '\'' +
                ", type='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Train train = new Train("로템", "SRT");
        System.out.println(train);

    }
}
