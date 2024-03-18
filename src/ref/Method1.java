package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();   // 0x001
        initStudent(student1, "kim", 10, 3);

        Student student2 = new Student();
        initStudent(student2, "lee", 15, 2);

        printStudent(student1);
        printStudent(student2);
    }
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student student){
        System.out.println("name: " + student.name + ", age: " + student.age + ", grade: "+student.grade);
    }
}
