package splitWise;

public class PercentSplit extends Split{
	int percent;
	public PercentSplit(String username,int percent) {
		super(username);
		this.percent=percent;
	}

}
