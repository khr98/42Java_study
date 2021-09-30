package week4.ex03;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        GOLDCustomer customerTest = new GOLDCustomer(10030, "테스트");
        customerTest.bonusPoint = 10000;
        System.out.println(customerTest.showCustomerInfo());

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);
        int priceTest = customerTest.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다");
        System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다");
        System.out.println(customerTest.showCustomerInfo() + "지불금액은 " + priceTest + "원 입니다");
    }
}