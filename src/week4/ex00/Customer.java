package week4.ex00;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
    }

    public String showCustomerInfo() {
        return String.format("%s님의 등급은 %s이며, 보너스 포인트는 %d입니다.",
                this.customerName, this.customerGrade, this.bonusPoint);
    }
}

class VIPCustomer extends Customer {
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        this.customerGrade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
    }
}
