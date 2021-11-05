package com.GuessingGame;


public class GuessingGame {

	public static void main(String[] args) {
		GameControl playAGame = new GameControl();
		playAGame.setRandNum();
		
		for (int i = 0; i < 5; i++) {
			if(playAGame.winner) {
				i = 9000;
			} else if (!playAGame.winner) {
				playAGame.playRound();
			}
		}
		
		playAGame.didYahWinSon();
	}
}
