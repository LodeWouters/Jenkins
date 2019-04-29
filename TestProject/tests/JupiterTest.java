package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Password;
import model.Username;

class JupiterTest {

	@Test
	public void testCheckUsername() {
		Username username = new Username();
		username.setUsername("test");
		assertEquals("test", username.getUsername());
	}
	
	@Test
	public void testCheckPassword() {
		Password password = new Password();
		password.setPassword("testpwd");
		assertEquals("testpwd", password.getPassword());
	}

}
