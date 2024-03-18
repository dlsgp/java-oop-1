package chapter080;

public class FinalMethod {
    void method(){

    }
    final void method2(){}
}

class SubFinalMethod extends FinalMethod{
    @Override
    void method() {
        System.out.println("method() 재정의");
    }

//    void method2() {
//        System.out.println("finalMethod() 재정의 불가");
//    }
}
