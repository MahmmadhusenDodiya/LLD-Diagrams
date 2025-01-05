package splitWise;

public class Transaction {
	int fromId;
	int toId;
	double amount;
	public Transaction(int fromId, int toId, double amount) {
		this.fromId = fromId;
		this.toId = toId;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [fromId=" + fromId + ", toId=" + toId + ", amount=" + amount + "]";
	}
	
	
	
}
