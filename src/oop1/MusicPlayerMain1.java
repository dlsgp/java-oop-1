package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        /*
        oop
         */
        MusicPlayer mp = new MusicPlayer();
        // mp 켜기 > 볼륨 증가 > 볼륨 증가 > 볼륨 감소 > mp 현 상태 > mp 끄기
        mp.on();
        mp.volumnUp();
        mp.volumnUp();
        mp.volumnDown();
        mp.showStatus();
        mp.off();
    }
}
