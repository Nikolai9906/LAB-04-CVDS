package hangman.model;

import hangman.exceptions.HangmanException;

public class OriginalScore implements GameScore{

	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		int score = 100;
		
		if (correctCount < 0 || incorrectCount < 0) {
			throw new HangmanException(HangmanException.INVALIDARGUMENT);
		}else if ( incorrectCount >= 0 && incorrectCount <= 10){
			score = 100- (incorrectCount*10);
		}else if(incorrectCount >= 10) {
			score = 0;
		}
		return score;
	}

}
