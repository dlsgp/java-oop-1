package chapter110;

public class Excepion3 {

    public static void main(String[] args) {
        try{
            int [] arr = {1,2,3};
            System.out.println(arr[3]);
//            System.out.println(3/0);
            Integer.parseInt("hello");
        } catch(ArithmeticException e){
            System.out.println("0으로 나눌  수 없음");
        } catch (ArrayIndexOutOfBoundsException e1){
//            e1.printStackTrace();
            e1.getMessage();
            System.out.println("인덱스 범위 초과");
        } catch (Exception e){
            System.out.println("예외 발생");
        }

    }
}
