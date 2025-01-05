package splitWise;


// take the amount from total amount
public class ExactSplit extends Split{
	int amount;
	public ExactSplit(String username,int amount) {
		super(username);
		this.amount=amount;
	}

}
