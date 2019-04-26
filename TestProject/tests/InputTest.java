package tests;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runners.BlockJUnit4ClassRunner;

import model.Password;
import model.Username;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



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
