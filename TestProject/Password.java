
public class Password {
	private String password;
	private int length;

	public Password(String password) {
		this.password = password;
		this.length = password.length();
	}
	
	public Password() {
	
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLength() {
		return length;
	}
}
