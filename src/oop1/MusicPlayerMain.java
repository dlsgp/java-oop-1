package oop1;

public class MusicPlayerMain {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        // mp 켜기 > 볼륨 증가 > 볼륨 감소 > mp 현상태 출력
        mp.isOn = true;
        System.out.println("mp start");
        mp.volumn++;
        System.out.println("mp volumn ++: " + mp.volumn);
        mp.volumn++;
        System.out.println("mp volumn ++: " + mp.volumn);
        mp.volumn--;
        System.out.println("mp volumn --: " + mp.volumn);

        System.out.println("mp의 현재상태 확인");
        if (mp.isOn){
            System.out.println("mp는 ON 상태이고, 볼륨: " + mp.volumn);
        }else{
            System.out.println("mp는 OFF 상태이다.");
        }



    }
}
