package chapter080;

public class Eagle extends Animal {
    public Eagle(String type, String name) {
        super(type, name);
    }

    void sleep(){
        System.out.println(this.name+"은(는) 하늘에서 잠을 잔다.");
    }
}