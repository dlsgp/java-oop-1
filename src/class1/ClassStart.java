package class1;

public class ClassStart {
    public static void main(String[] args) {
        // int 형 배열 score를 10개 생성합니다.
//        int[] scores = new int[10];
        // 학생이름 배열 생성
        String[] studentNames = {"kim", "lee", "park"}; // studentNames.length = 3
        int[] scores = {100, 90, 80, 70}; // scores.length = 3
        int[] age = {10, 20, 30, 40}; // ages.length = 3

        for(int i = 0; i <studentNames.length; i++){
            System.out.println("name: "+studentNames[i]+" scores: "+scores[i]+" age: " + age[i]);
        }
    }
}
