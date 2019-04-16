import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class InputTest {

	@Test
	void checkUsername() {
		Username username = new Username();
		username.setUsername("test");
		Assert.assertEquals("test", username.getUsername());
	}
	
	@Test
	void checkPassword() {
		Password password = new Password();
		password.setPassword("testpwd");
		Assert.assertEquals("testpwd", password.getPassword());
	}
}
