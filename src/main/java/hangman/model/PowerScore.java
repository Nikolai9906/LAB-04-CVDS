package hangman.model;

import hangman.exceptions.HangmanException;

public class PowerScore implements GameScore {
	 /**
     * @throws hangman.exceptions.HangmanException
     * @pre El puntaje empieza en 0 puntos
     * @param correctCount - Cantidad de aciertos
     * @param incorrectCount - Cantidad de errores
     * @return ans
     */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		if(correctCount<0 || incorrectCount<0) throw new HangmanException(HangmanException.INVALIDARGUMENT);
        int sum = 0;
        for(int x=1;x<=correctCount;x++) sum+= Math.pow(5, x);
        int ans = sum-8*incorrectCount;
        if(ans>500) ans=500; else if(ans<0) ans = 0;
        
        return ans;
	}

}
