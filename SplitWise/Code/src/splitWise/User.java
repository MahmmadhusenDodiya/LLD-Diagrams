package splitWise;

public class User {
	private String userName;
	private String email;
	private Integer userId;
	
	public User(String userName,String email,Integer userId) {
		this.userName=userName;
		this.email=email;
		this.setUserId(userId);
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
