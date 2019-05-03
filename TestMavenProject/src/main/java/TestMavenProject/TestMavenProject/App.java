package TestMavenProject.TestMavenProject;

import java.util.ArrayList;
import java.util.List;


public class App 
{
		public static void main(String[] args) {
			List<Pair<Username, Password>> passwords = new ArrayList<Pair<Username,Password>>();

			passwords.add(new Pair("Testname","testpwd"));
			System.out.println("Username: " + passwords.get(0).getUsername());
			System.out.println("Password: " + passwords.get(0).getPassword());
			
			Username enteredName = new Username("Newname");
			passwords.get(0).setUsername(enteredName);
			System.out.println("Your new username is: " + enteredName.getUsername());
	}	
}
