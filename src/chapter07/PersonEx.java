package chapter07;

public class PersonEx {
    public static void main(String[] args) {
        Person father = new Person();
        Person mother = new Person();

        father.name = "홍길동";
        father.age = 50;
        father.height = 180;
        father.weight = 80;

        mother.name= "김길자";
        mother.age= 50;
        mother.height= 160;
        mother.weight= 50;


        System.out.println("아빠 이름: " + father.name + ", 나이: " + father.age + ", 키: " +father.height + ", 몸무게: " + father.weight);
        System.out.println("엄마 이름: " + mother.name + ", 나이: " + mother.age + ", 키: " +mother.height + ", 몸무게: " + mother.weight);

    }
}
