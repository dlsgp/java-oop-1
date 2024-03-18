package chapter080;

public class ChildEx extends ParentEx{
    public ChildEx() {
        this(1);
        System.out.println("(3)");
    }

    ChildEx(int x){
        System.out.println("(4)");
    }

}
