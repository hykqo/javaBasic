package javaBasic.ref.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        // 여러 상품의 주문 정보를 담는 배열 생성
        List<ProductOrder> orderList = new ArrayList<>();
        // createOrdere()를 여러번 사용해서 상품 주문 정보들을 생성하고  배열에 저장
        for (int i = 0; i < n; i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            orderList.add(createOrder(productName, price, quantity));
        }
        // printOrdesrs()를 사용해서 상품 주문 정보 출력
        printOrders(orderList);
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orderList);
        // 총 결제 금액 출력
        System.out.println("총 결제 금액 : "+" "+totalAmount);
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    public static void printOrders(List<ProductOrder> orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : "+order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    public static int getTotalAmount(List<ProductOrder> orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

}
