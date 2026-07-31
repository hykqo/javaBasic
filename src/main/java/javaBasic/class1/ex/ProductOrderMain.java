package javaBasic.class1.ex;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderMain {
    public static void main(String[] args) {
        List<ProductOrder> orderList = new ArrayList<>();

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);

        int totPrice = 0;
        for(ProductOrder order : orderList){
            System.out.println("상품명 : "+order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
            totPrice += order.price * order.quantity;
        }
        System.out.println("총 결제 금액 : "+" "+totPrice);
    }
}
