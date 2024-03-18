package chapter070;

public class InitEx2 {

    // static 변수
    static int sVar;
    // static 메서드
    static void sMethod(){

    }

    // 인스턴스 변수
    int var;
    // 인스턴스 메서드
    void method(){

    }
    static {
        sVar = 0;   // static 변수
        sMethod();  // static 메서드
    }

//    //static 메서드
//    static void sMethod2(){
//        // 에러 (static 메서드에서 this 키워드 사용불가)
//        this.sVar = 0;  // static 변수
//        this.sMethod(); // static 메서드
//    }
}
