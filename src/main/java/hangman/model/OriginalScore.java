package hangman.model;

import hangman.exceptions.HangmanException;

public class OriginalScore implements GameScore{
	/**
     * @throws hangman.exceptions.HangmanException
     * @pre El puntaje empieza en 100 puntos
     * @pos El puntaje esta en un rango entre [0,100]
     * @param correctCount - Cantidad de aciertos
     * @param incorrectCount - Cantidad de errores
     * @return puntaja total
     */

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
	
	@Override
	public int getPuntajeInicial() {
		return 100;
	}

}
