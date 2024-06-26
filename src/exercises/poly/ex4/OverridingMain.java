package exercises.poly.ex4;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> child");
        System.out.println("value = " + child.name);
        child.method();
        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.name);
        child.method();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent p = new Child(); // 0x001
        System.out.println("Parent -> Child");
        System.out.println("name = " + p.name); // 변수는 오버라이딩 안됨.
        p.method(); // 메소드 오버라이딩 됩니다.

//        Child c = new Parent(); // 자식은 부모를 담을 수 없다.
        // 다운 캐스팅(부모 타입 -> 자식 타입)
        Child child1 = (Child) p;

    }
}
