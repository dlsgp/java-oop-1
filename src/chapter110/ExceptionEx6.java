package chapter110;

public class ExceptionEx6 {
    public static void main(String[] args) {
        try{
            first();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    static void first() throws Exception{
        second();
    }

    private static void second() throws Exception{

    }
}
