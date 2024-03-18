package chapter080.poly;

public class PolyEx {
    public static void main(String[] args) {

        Child c = new Child();
        c.run();

        Parent p = new Child(); // 부모형으로 선언된다(자동형 변환)
        p.run();

//        p.eat();  // 에러
    }
}
