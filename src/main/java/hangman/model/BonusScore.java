package hangman.model;

import hangman.exceptions.HangmanException;

public class BonusScore implements GameScore {

	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		 int score = 0 ;
		 
		 if (incorrectCount < 0 || correctCount < 0) { 
			 throw new  HangmanException(HangmanException.INVALIDARGUMENT);
		 }else if (incorrectCount >0) {
			 score = score - (incorrectCount*5);
		 }else if (correctCount > 0 ) {
			 score = score + (correctCount*10);
		 }
		 return score;
		 }
}
