package inheritance;

public class OverridingTest2 {
    public static void main(String[] args) {

        Customer customerPark = new VIPCustomer(10030, "Park", 20000);
        customerPark.bonusPoint = 1000;

        int price = 10000;
        System.out.println(customerPark.getCustomerName() + " 님이 지불해야 할 금액은 " + customerPark.calcPrice(price));
    }
}
