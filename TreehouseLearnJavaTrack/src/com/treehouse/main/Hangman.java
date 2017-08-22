package com.treehouse.main;

import java.util.*;




public class Hangman {

		public static void main(String[] args) {

		Game game = new Game("claimAcademy");
		Prompter prompter = new Prompter(game);

		while (game.getRemainingTries() > 0 && !game.isWon()) {
			
			prompter.displayProgress();
			prompter.promptForGuess();
		}
/*		boolean isHit = prompter.promptForGuess();
		if (isHit) {
			System.out.println("We've got a correct guess!!");
		} else {
			System.out.println("Oops incorrect!");
		}
		prompter.displayProgress();
*/		prompter.displayOutcome();
	}		
		
}
