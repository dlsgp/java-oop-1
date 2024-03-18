package dependencyon.inheritance;

public class ABMain {
    public static void main(String[] args) {
        B b = new B("bClass");
        System.out.println(b.bField);
        System.out.println(b.bMethod);

        System.out.println(b.aField);
        System.out.println(b.aMethod());
    }
}
