package hangman.model;

import hangman.exceptions.HangmanException;

public class BonusScore implements GameScore {

	@Override 
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        
        if(correctCount < 0 || incorrectCount < 0){
            throw new HangmanException(HangmanException.INVALIDARGUMENT);
        }else if(incorrectCount < correctCount * 2){            
            return (correctCount*10) - (incorrectCount*5);
        }else if(incorrectCount >= correctCount *2){
            return 0;
        }
        return 0;
             
    }
}
