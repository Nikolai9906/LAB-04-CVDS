package hangman.model;
import hangman.exceptions.*;
	/**
	*
	* @throws HangmanException
	* @param correctCount
	* @param incorrectCount
	* @return
	*/
public interface GameScore {
	public int calculateScore(int correctCount,int incorrectCount)throws HangmanException;
	public default int getPuntajeInicial() {
		return 0;
	}
	
}
