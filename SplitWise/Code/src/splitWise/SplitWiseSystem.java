package splitWise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SplitWiseSystem {
	private static final SplitWiseSystem INSTANCE=new SplitWiseSystem();
	
	private List<User> userlistList;
	private List<Expense> expenseList;
	private Map<String,User> userMap;
	
	Map<String,Map<String,Double>> balanceSheet;
	
	
	
	private SplitWiseSystem() {
		userlistList=new ArrayList<>();
		balanceSheet=new TreeMap<>();
		expenseList=new ArrayList<Expense>();
		userMap=new TreeMap<>();
	}
	public static SplitWiseSystem getInstance() {
		return INSTANCE;
	}
	
	public void addUser(User u) {
		userlistList.add(u);		
		userMap.put(u.getUserName(), u);
	}
	
	public Integer getUserId(String user)
	{
		return userMap.get(user).getUserId();
	}
	
	
	public void addExpense(String type,List<Split> splits,int paidById,int amount)
	{
		Expense expense=ExpenseFactory.getExpense(type, splits, amount, paidById);
		expense.processSplits();
		expenseList.add(expense);
		expense.printTransactions();
	}
	
	
	
}
