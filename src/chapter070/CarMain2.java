package chapter070;

public class CarMain2 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        // Car 객체 생성
        Car tico = new Car();

        tico.color = "화이트";
        tico.company = "대우";
        tico.type = "경차";

        // 모든 인덱스에 tico 객체 저장
        for(int i=0; i<cars.length; i++) {
            cars[i] = tico;
        }

        System.out.println("2번 인덱스 color: " + cars[2].color); // 모든 인덱스에 동일한 색상이라 다 화이트가 나올것이다.
        cars[1].color = "블랙"; // 1번 인덱스 객체의 color 필드에 "블랙" 대입
        System.out.println("2번 인덱스 color: " + cars[2].color);
    }
}
