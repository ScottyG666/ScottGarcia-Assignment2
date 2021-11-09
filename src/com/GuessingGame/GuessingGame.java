package com.GuessingGame;


public class GuessingGame {

	public static void main(String[] args) {
		
		
		GameControl playAGame = new GameControl();
				
		//too see why the for loop is based on a variable inside GameControl, see the comment above $private int index inside the class GameControl
		for (playAGame.getIndex() ; playAGame.getIndex() < 5; playAGame.setIndex(playAGame.getIndex() + 1)) {
			//winner is a boolean that sets an early termination condition through a setter
			if(playAGame.winner) {
				playAGame.setIndex(9000);
			} else if (!playAGame.winner) {
				playAGame.playRound();
			}
		}
		//method that outputs whether the user was successful or must wear the dunce cap
		playAGame.areYahWinningSon();
		
		//I've worn the dunce cap many times
	}
}
