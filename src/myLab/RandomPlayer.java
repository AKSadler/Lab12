package myLab;

import java.util.Random;

public class RandomPlayer extends Player {

	/*public RandomPlayer(String Name, String RoshamboValue) {
		setName("Random Player");
		setRoshamboValue("");*/

	

	@Override
	public String generateRoshamboValue() {
		int min = 1;
		int max = 3;
		int range = max - min + 1;
		Random rn = new Random();
		int randomNum = rn.nextInt(range) + min;
		String choice = "";

		switch (randomNum) {

		case 1:
			choice = "rock";
			break;

		case 2:
			choice = "paper";
			break;

		case 3:
			choice = "scissors";

		default:
			break;
		}
		return choice;
	}

}
