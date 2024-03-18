package chapter070;

public class StudentMain {
    public static void main(String[] args) {
        Student stu = new Student("홍길동", 4, "소프트웨어공학");
        System.out.println(stu.name + ", " + stu.grade + "학년, " + stu.department + " 학과");

        Student stu2 = new Student("이순신", 3, "디자인");
        System.out.println(stu2.name + ", " + stu2.grade + "학년, " + stu2.department + " 학과");

        // 기본 생성자로 객체 생성
        Student stu0 = new Student();   // 에러 발생->생성자가 선언되어 있으면 자바는 기본생성자를 만들어 주지 않는다.
        Student stu1 = new Student("kim");
        Student stu3 = new Student("kim", 3 );
        Student stu4 = new Student("kim", 4, "computer");
        // 각각의 참조변수로 멤버변수의 값을 출력하는 코드를 작성하세요.

    }
}
