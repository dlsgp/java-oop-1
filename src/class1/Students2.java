package class1;

public class Students2 {
    public static void main(String[] args) {
        // int a;
        Student student1;
        student1 = new Student();
        System.out.println(student1);
        // scanner.nextInt()
        student1.name = "Kim";
        student1.age = 10;
        student1.grade = 100;
        System.out.println(student1);

        Student student2 = new Student();
        student2.name = "Lee";
        student2.age = 20;
        student2.grade = 90;
        System.out.println(student2);

        Student student3 = new Student();
        student3.name = "Park";
        student3.age = 30;
        student3.grade = 80;
        System.out.println(student3);

        Student [] students = new Student[]{student1, student2, student3};

        for(int i=0; i<students.length; i++){
            System.out.println("name: " + students[i].name + ", age: "+students[i].age + ", grade: " + students[i].grade);
        }

    }
}
