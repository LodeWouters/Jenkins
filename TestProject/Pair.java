
public class Pair<Username, Password> {
	private Username username;
	private Password password;
	
	public Pair(Username username, Password password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Username getUsername() {
		return username;
	}

	public void setUsername(Username username) {
		this.username = username;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}
	
	
	
}
