package exercises.poly.ex5;

public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;   // 업 캐스팅
        Parent parent1 = /*(Parent) 이거 생략한 거랑 똑같은데 이렇게 사용 잘 안한다.*/ child;   // 자연스럽게 업 캐스팅 하므로 생략한다.

        parent.parentMethod();
        parent1.parentMethod();


    }
}
