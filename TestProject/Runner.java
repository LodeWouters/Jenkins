
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		List<String> TODOs = new ArrayList<>();
		List<Pair<Username, Password>> passwords = new ArrayList<Pair<Username,Password>>();
		Scanner sc = new Scanner(System.in);
		
		TODOs.add("testItem1");
		System.out.println(TODOs.get(0));
		passwords.add(new Pair("testnaam","testpwd"));
		System.out.println("Username: " + passwords.get(0).getUsername());
		System.out.println("Password: " + passwords.get(0).getPassword());
		
		System.out.println("Enter a new username: ");
		String username = sc.nextLine();
		Username enteredName = new Username(username);
		passwords.get(0).setUsername(enteredName);
		System.out.println("Your new username is: " + enteredName.getUsername());
	}
}
