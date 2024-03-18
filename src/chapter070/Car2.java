package chapter070;

public class Car2 {

    String color;
    String company;
    String type;

    Car2(){
        this("white", "kia", "경차");
    }

    Car2(String color, String company, String type){
        this.color = color;
        this.company = company;
        this.type = type;
    }

    Car2(String t){
        this("white", "기아", t);
    }

    // Car2 클래스는 toString() 메서드를 오버라이딩(overriding)하여 객체의 차의 색상과 제조사와 유형정보를 포함하여 문자열을 반환합니다.
    public String toString(){
        return color + "-" + company + "-" + type;
    }
}
