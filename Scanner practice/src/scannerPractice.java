import java.util.Scanner;

public class scannerPractice
	{
	
	static String name, choice;
	static int number;

	public static void main(String[] args)
		{
		System.out.println("Hey there whats our name?");
		
		Scanner userInput = new Scanner(System.in);
		name = userInput.nextLine();
		
		System.out.println("nice to meet you " + name);
		
		System.out.println("what is your favorite number?");
		Scanner userInput2 = new Scanner (System.in);
		
		number = userInput2.nextInt();
		
		System.out.println("Hmmmm " + number + " huh? I cant say I agree with that");
		
		System.out.println("So " + name + " do you like summer or winter better?");
		Scanner userInput3 = new Scanner (System.in);
		choice = userInput3.nextLine();
		
		if ("summer" .equals(choice))
			{
			System.out.println("I agree!! Summer is the best");
			}
		else
			{
			System.out.println("I dont think I like winter quite as much as summer but I do like to ski!");
			}

		}

	}
