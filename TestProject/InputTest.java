import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class InputTest {

	@Test
	public void checkUsername() {
		Username username = new Username();
		username.setUsername("test");
		assertEquals("test", username.getUsername());
	}
	
	@Test
	public void checkPassword() {
		Password password = new Password();
		password.setPassword("testpwd");
		assertEquals("testpwd", password.getPassword());
	}
}
