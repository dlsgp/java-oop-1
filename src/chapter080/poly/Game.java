package chapter080.poly;

public class Game {
    void display(GraphicCard gc){
        gc.process();
    }
    void display(Amd gc){
        gc.process();
    }
    void display(Nvidia gc){
        gc.process();
    }


    public static void main(String[] args) {
        Game g = new Game();
        GraphicCard gc = new GraphicCard();
        g.display(gc);

        Amd a = new Amd();
        g.display(a);

        Nvidia n = new Nvidia();
        g.display(n);

        //
        allObject(new GraphicCard());
        allObject(new Nvidia());
        allObject(new Amd());

    }

    // 모든 클래스를 매개변수로 받고 싶으면, 메서드 정의시 매개변수 자료형을 최상위클래스인 Object로 선언
    public static void allObject(Object obj){
        System.out.println(obj.toString());
    }
}

