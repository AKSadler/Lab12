package myLab;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);

		String playAgain = "y";

		System.out.println("Welcome to Rock Paper Scissors!");

		System.out.println("what is your name?");
		String name = scan1.nextLine();
		while (playAgain.equalsIgnoreCase("y")) {
			System.out.println("The Jets or The Sharks(j/s)?: ");
			String choice = scan1.nextLine();
			String compAnswer = "";
			// System.out.println(choice);

			System.out.println("Rock, Paper, Scissors?");
			String userChoice = scan1.next();

			//HumanPlayer h1 = new HumanPlayer();
			RockPlayer rp = new RockPlayer();
			RandomPlayer rand = new RandomPlayer();

			if (choice.equalsIgnoreCase("j")) {
				compAnswer = rp.generateRoshamboValue();
				System.out.println("The Jets: " + compAnswer);
			}

			if (choice.equals("s")) {
				compAnswer = rand.generateRoshamboValue();
				System.out.println("The Sharks: " + compAnswer);
			}

			System.out.println(name + ": " + userChoice);

			if (userChoice.equalsIgnoreCase(compAnswer)) {
				System.out.println("it's a tie!");
			}
			if (userChoice.equalsIgnoreCase("rock") && compAnswer.equalsIgnoreCase("paper")) {
				System.out.println("you lose!");
			}
			if (userChoice.equalsIgnoreCase("paper") && compAnswer.equals("scissors")) {
				System.out.println("you lose!");
			}
			if (userChoice.equalsIgnoreCase("paper") && compAnswer.equals("rock")) {
				System.out.println("you win!");

			}
			if (userChoice.equalsIgnoreCase("rock") && compAnswer.equals("scissors")) {
				System.out.println("you win!");
			}
			if (userChoice.equalsIgnoreCase("scissors") && compAnswer.equals("rock")) {
				System.out.println("you lose!");

			}
			scan1.nextLine();

			System.out.println("Continue? (y/n): ");
			playAgain = scan1.nextLine();

		}
		if (playAgain.equalsIgnoreCase("n")) {
			System.out.println("Goodbye!");

		}
		scan1.close();
	}
}
