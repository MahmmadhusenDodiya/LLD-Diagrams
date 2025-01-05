package splitWise;

import java.util.List;

public class EqualExpense extends Expense {

	public EqualExpense(List<Split> splitList,int paidByUserId,int amount) {
		super(splitList, paidByUserId,amount);
	}

	@Override    // processSplits and broke into transactions
	public void processSplits() {
		int totalUsers=splitList.size();
		for(int i=0;i<totalUsers;i++)
		{
			EqualSplit s=(EqualSplit) splitList.get(i);
			double amount=totalAmount/(double)totalUsers;
			if(paidByUserId!=SplitWiseSystem.getInstance().getUserId(s.username))
			transactionList.add(new Transaction(SplitWiseSystem.getInstance().getUserId(s.username) ,paidByUserId, amount));
		}
		
	}

}
