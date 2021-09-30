package week4.ex04;

public class VIPCustomer extends Customer{
    private int agentNumber;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentNumber) {
        super(customerID, customerName);
        this.customerGrade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        this.agentNumber = agentNumber;
    }

    public int calcPrice (int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price*saleRatio);
    }

    @Override
    public String showCustomerInfo() {
        return String.format("%s님의 등급은 %s이며, 보너스 포인트는 %d입니다. 담당 상담원 번호는 %d 입니다",
                this.customerName, this.customerGrade, this.bonusPoint, this.agentNumber);
    }
}
