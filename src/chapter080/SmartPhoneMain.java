package chapter080;

public class SmartPhoneMain {
    public static void main(String[] args) {

       Phone p = new Phone();
        p.name = "전화기";
        p.color = "화이트";
        p.company = "현대";

        System.out.println("Phone 출력");
        System.out.println(p.name);
        System.out.println(p.company);
        System.out.println(p.color);

        SmartPhone sp = new SmartPhone();
        sp.name = "갤럭시";
        sp.color = "black";
        sp.company = "samsung";

        System.out.println("SmartPhone 출력");
        System.out.println(sp.name);
        System.out.println(sp.company);
        System.out.println(sp.color);
        sp.call();
        sp.receive();
        sp.installApp();

    }
}
