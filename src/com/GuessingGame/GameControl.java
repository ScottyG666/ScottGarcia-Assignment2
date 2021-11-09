package com.GuessingGame;

import java.util.Scanner;

public class GameControl {
	//instantiating a scanner to assign a variable to each of the users guess
	static Scanner scanner = new Scanner(System.in);
	//variable holding the value of the users guess per round
	static int userGuess;
	
	//this is to set the index during the game, and as a condition when telling the player to pick higher or lower
	//this is purely because i don't want to see the phrase "Please pick a higher number"/"Please pick a lower number" after the final guess. it annoys me. The game is over they can't pick a higher or lower number. it makes no sense.
	private int index;

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

	//variable that determines an early loop termination condition
	boolean winner;
	// The magic variable of which users will be trying to guess
	private static int randNumber =  (int) Math.floor((Math.random()* 100) + 1);
	
	public static int getRandNumber() {
		return randNumber;
	}


	static int convertedGuess(double userNumber) {
		return (int) Math.round(userNumber);
	}
	
	

	
	
	
	//method called to set the value of userGuess each round, to compare against the number trying to be guessed
	static void setGuess() {
		System.out.println("Pick a number between 1 and 100:");
		double userNumber = scanner.nextDouble();
		//validation that the user guessed a number between 1 and 100, even if it has a decimal, then 
		//its converted to a standard int for comparison against the random number
		while (userNumber < 1 || userNumber > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			System.out.println("Pick a number between 1 and 100:");
			userNumber = scanner.nextDouble();
		}
		//the variable userGuess for this particular instantiation is set to an integer through
		//the public convertedGuess method
		userGuess = GameControl.convertedGuess(userNumber);
	}
	
	//these strings only print to the console when the user has another guess, otherwise this whole thing is 
	//skipped all-together
	void playRound() {
		GameControl.setGuess();
		if (userGuess < getRandNumber() && this.getIndex() < 4) {
			System.out.println("Please pick a higher number :");
		} else if(userGuess > getRandNumber() && this.getIndex() < 4) {
			System.out.println("Please pick a lower number: ");
		}else if (userGuess == getRandNumber()) {
			this.winner = true;
		}
	}
	
	//the last part of the requirements, where fates are judged and dunce caps are distributed, names after a meme
	void areYahWinningSon() {
		if (this.winner) {
			System.out.println("You Win!");
		} else if (!this.winner) {
			System.out.println("You Lose!");
		}
		System.out.println("The number to guess was: " + getRandNumber());
	}


}
