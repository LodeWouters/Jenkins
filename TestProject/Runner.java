import java.util.ArrayList;
import java.util.List;
import model.Pair;
import model.Password;
import model.Username;

public class Runner {
	public static void main(String[] args) {
		List<String> TODOs = new ArrayList<>();
		List<Pair<Username, Password>> passwords = new ArrayList<Pair<Username,Password>>();
		
		TODOs.add("testItem1");
		System.out.println(TODOs.get(0));
		passwords.add(new Pair("testnaam","testpwd"));
		System.out.println("Username: " + passwords.get(0).getUsername());
		System.out.println("Password: " + passwords.get(0).getPassword());
		
		System.out.println("Enter a new username: ");
		Username enteredName = new Username("testnaam");
		passwords.get(0).setUsername(enteredName);
		System.out.println("Your new username is: " + enteredName.getUsername());
	}
}
