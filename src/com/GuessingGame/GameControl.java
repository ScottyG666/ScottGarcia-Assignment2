package com.GuessingGame;

import java.util.Scanner;

public class GameControl {

	static Scanner scanner = new Scanner(System.in);
	static int userGuess;
	static void setGuess() {
		System.out.println("Pick a number between 1 and 100:");
		double userNumber = scanner.nextDouble();
		while (userNumber < 1 || userNumber > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			System.out.println("Pick a number between 1 and 100:");
			userNumber = scanner.nextDouble();
		}
		userGuess = GameControl.convertedGuess(userNumber);
	}
	
	static int convertedGuess(double userNumber) {
		return (int) Math.round(userNumber);
	}
	
	int randomlyGeneratedNumber;
	boolean winner;

	void setRandNum() {
		this.randomlyGeneratedNumber = (int) Math.round((Math.random()* 100) + 1);
	}
	
	void playRound() {
		GameControl.setGuess();
		if (userGuess < randomlyGeneratedNumber) {
			System.out.println("Please pick a higher number :");
		} else if(userGuess > randomlyGeneratedNumber) {
			System.out.println("Please pick a lower number: ");
		}else if (userGuess == randomlyGeneratedNumber) {
			this.winner = true;
		}
	}
	
	void didYahWinSon() {
		if (this.winner) {
			System.out.println("You Win!");
		} else if (!this.winner) {
			System.out.println("You Lose!");
		}
		System.out.println("The number to guess was: " + this.randomlyGeneratedNumber);
	}
}
