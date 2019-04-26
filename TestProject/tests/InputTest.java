package tests;
import static org.junit.Assert.*;


import org.junit.Test;

import model.Password;
import model.Username;


public class InputTest {

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
