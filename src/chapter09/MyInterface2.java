package chapter09;

public interface MyInterface2 {
    default void defaultMethod(){
        System.out.println("MyInterface2의 default 메서드");
    }
    static void statictMethod(){
        System.out.println("MyInterface2의 static 메서드");
    }
}
