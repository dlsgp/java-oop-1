package exercises;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[2];    // 2개를 주문했으니 2개가 되어야함
        orders[0] = createOrder("카레라이스", 8000, 2);  // 0x001
        orders[1] = createOrder("비빔밥", 8000, 2);  // 0x001

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {     // iter을 누른 것
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for(ProductOrder order: orders){
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }


}
