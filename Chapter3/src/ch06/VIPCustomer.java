package ch06;

public class VIPCustomer extends Customer{

	double salesRatio;
	private String agentId;
	
//	public VIPCustomer() {
//		
//		super(0, "no-name");
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP";
//		
//		System.out.println("VIPCustomer() call");
//	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		salesRatio = 0.1;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)price * salesRatio;
		return price;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
}
