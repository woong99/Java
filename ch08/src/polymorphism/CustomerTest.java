package polymorphism;


import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();

        Customer customer1 = new Customer(10010, "1");
        Customer customer2 = new Customer(10020, "2");
        Customer customer3 = new GoldCustomer(10030, "3");
        Customer customer4 = new GoldCustomer(10040, "4");
        Customer customer5 = new VIPCustomer(10050, "5", 12345);

        customerArrayList.add(customer1);
        customerArrayList.add(customer2);
        customerArrayList.add(customer3);
        customerArrayList.add(customer4);
        customerArrayList.add(customer5);

        System.out.println("==== 고객 정보 출력 ====");

        for (Customer customer : customerArrayList) {
            System.out.println(customer);
        }

        System.out.println("==== 할인율과 보너스 포인트 계산 ====");
        int price = 10000;
        for (Customer customer : customerArrayList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }

    }
}
