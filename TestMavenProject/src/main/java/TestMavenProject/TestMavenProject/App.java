package TestMavenProject.TestMavenProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App 
{
		public static void main(String[] args) {
			List<Pair<Username, Password>> pairs = new ArrayList<Pair<Username,Password>>();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter username: ");
			Username username = new Username();
			username.setUsername(scanner.nextLine());
			System.out.println("Enter password: ");
			Password password = new Password();
			password.setPassword(scanner.nextLine());
			
			pairs.add(new Pair(username, password));

			System.out.println("Username: " + pairs.get(0).getUsername().getUsername());
			System.out.println("Password: " + pairs.get(0).getPassword().getPassword());
			
			pairs.add(new Pair(new Username("username2"), new Password("password2")));
			
			System.out.println("\nUsername 2: " + pairs.get(1).getUsername().getUsername() + "\nPassword 2: " + pairs.get(1).getPassword().getPassword());
			
			
			/*
			System.out.println("\nList of pairs: ");
			for(int i = 0; i < pairs.size(); i++) {
				
			System.out.println(pairs.get(i) + " ");
			}
			*/
	}
}
