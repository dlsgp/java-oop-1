package chapter090;

public class Computer {
    public static void main(String[] args) {
        GraphicCard gc = new Amd();
        System.out.println("메모리: " + gc.MEMORY);

        gc = new Amd();
        System.out.println(gc);
        gc.process();

        gc= new Nvidia();
        System.out.println(gc);
        gc.process();
    }
}
