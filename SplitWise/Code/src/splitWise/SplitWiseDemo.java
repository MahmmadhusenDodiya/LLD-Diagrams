package splitWise;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SplitWiseDemo {
	public static void main(String args[])
	{
		User raju=new User("Raju","Raju123@gmail.com",1);
		User tahu=new User("tahu","tahu123@gmail.com",2);
		User vishal=new User("vishal","vishal@gmail.com",3);
		
		SplitWiseSystem system=SplitWiseSystem.getInstance();
		
		system.addUser(tahu);
		system.addUser(raju);
		system.addUser(vishal);
		
		List<Split> splits=new ArrayList<>();
		splits.add(new EqualSplit(raju.getUserName()));
		splits.add(new EqualSplit(tahu.getUserName()));
		splits.add(new EqualSplit(vishal.getUserName()));
		
		
		SplitWiseSystem.getInstance().addExpense("Equal",splits,raju.getUserId(),600);
		
	}
}
