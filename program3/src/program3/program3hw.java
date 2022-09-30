package program3;

import java.util.Scanner;

public class program3hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// collect input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello, what is your name?");
		String name  = keyboard.nextLine();
		
		System.out.println("Hello " + name);
		
		System.out.println(name + ", Give me an integer between 0-100");
		int number = keyboard.nextInt();

		while(number<0 || number>100)
		{
			
			System.out.println("this is incorrect, your integer is not between 0-100, please enter another integer");
			number = keyboard.nextInt();
		
		}
		
		//thank the user
		System.out.println("Thank you " + name + " this is your integer " + number);
		System.out.println("this is how many years are left of the earth");
		
		//count down
		
		for(int x = number; x>=0; x--)
		{
			System.out.println("The earth has " +x+  "years left)");
		}
		
		System.out.println("the earth has no life left on it");
	}
}
	


