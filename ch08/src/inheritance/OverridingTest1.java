package inheritance;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "Lee");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer(10020, "Kim", 20000);
        customerKim.bonusPoint = 10000;

        int price = 10000;
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야 할 금액은 " + customerLee.calcPrice(price));
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야 할 금액은 " + customerKim.calcPrice(price));
    }
}
