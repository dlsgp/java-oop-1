package chapter07.test.test2;

import chapter07.test.ClassA;

public class ClassC {
    public static void main(String[] args) {

        ClassA ca = new ClassA();
        ca.print();

//        ClassB cb = new ClassB();   default는 다른 패키지는 접근이 안된다.
    }
}
