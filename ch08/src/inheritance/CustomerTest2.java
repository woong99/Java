package inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "Lee");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.toString());

        VIPCustomer customerKim = new VIPCustomer(10020, "Kim", 20000);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.toString());
    }
}
