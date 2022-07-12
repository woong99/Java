package inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer(int, String, int) 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public double getSaleRatio() {
        return saleRatio;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }

    @Override
    public String toString() {
        return "VIPCustomer{" +
                "agentID=" + agentID +
                ", saleRatio=" + saleRatio +
                ", customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusRatio=" + bonusRatio +
                '}';
    }
}
