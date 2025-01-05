package splitWise;

import java.util.ArrayList;
import java.util.List;

public abstract class Expense {
	List<Split> splitList;
	List<Transaction> transactionList;
	Integer paidByUserId;
	Integer totalAmount;
	
	public Expense(List<Split> splitList,Integer paidByUserId,Integer totalAmount) {
		this.splitList=splitList;
		transactionList=new ArrayList<>();
		this.paidByUserId=paidByUserId;
		this.totalAmount=totalAmount;
	}
	
	public abstract void processSplits();
	public void printTransactions() {
		for(int i=0;i<transactionList.size();i++)
		{
			System.out.println(transactionList.get(i).toString());
		}
	}
	
	
}
