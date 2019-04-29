package TestMavenProject.TestMavenProject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testCheckUsername() {
		Username username = new Username();
		username.setUsername("test");
		assertEquals("test", username.getUsername());
	}
    
	public void testCheckPassword() {
		Password password = new Password();
		password.setPassword("testpwd");
		assertEquals("testpwd", password.getPassword());
	}
}
