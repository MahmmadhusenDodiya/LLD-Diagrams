package splitWise;

import java.util.List;

public class ExpenseFactory {
	public static Expense getExpense(String type,List<Split> splits,int amount,int paidById)
	{
		if(type.equals("Equal"))
		{
			return new EqualExpense(splits, paidById, amount);
		}
		else {
			// Handle Other cases
			return null;
		}
	}
}
