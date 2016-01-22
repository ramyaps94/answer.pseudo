import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = scanner.nextLine();
		if (name == null) // if user does not enters anything
			System.out.println("Sorry you have not entered any name");
		else
			displayNameAndGeneratedNumber(name);
	}

	// Function to generate a random number between 6 and 15 inclusive which
	// takes name as parameter
	// and prints name followed by a number
	private static void displayNameAndGeneratedNumber(String name) {
		int Min = 6, Max = 15;
		int rn = Min + (int) (Math.random() * ((Max - Min) + 1));
		System.out.println(name + rn);

	}

}
