import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hangman.exceptions.HangmanException;
import hangman.model.BonusScore;
import hangman.model.OriginalScore;

/*
 * Clases de Equivalencia:
 * 
 * *OriginalScore
 *|  Número  |Clase de equivalencia (en lenguaje natural o matemático)  |Resultado                               |
 *|----------|----------------------------------------------------------|----------------------------------------|
 *|1		 | Incorrect <0 o Correct<0                                 |Arroja una Excepcion (HangManException) |
 *|2		 | 0<= Incorrect <= 10	                                    |Valor entre 100 y 0                     |
 *|3		 | Incorrect => 10	                                        |Valor igual a 0                         |
 *
 * *BonusScore
 *|  Número  |Clase de equivalencia (en lenguaje natural o matemático)  |Resultado                               |
 *|----------|----------------------------------------------------------|----------------------------------------|
 *|1		 | Incorrect <0 o Correct<0                                 |Arroja una Excepcion (HangManException) |
 *|2		 | 0<= Incorrect <= 5	                                    |Valor entre 100 y 0                     |
 *|3		 | 0 <= Correct <= 10                                         |Valor igual a 0                       |
 *
 * *PowerBonus
 *|  Número  |Clase de equivalencia (en lenguaje natural o matemático)  |Resultado                               |
 *|----------|----------------------------------------------------------|----------------------------------------|
 *|1		 | Incorrect <0 o Correct<0                                 |Arroja una Excepcion (HangManException) |
 *|2		 | 0<= Incorrect <= 5	                                    |Valor entre 100 y 0                     |
 *|3		 | 0 <= Correct <= 10                                         |Valor igual a 0                       |
 */

class GameScoreTest {

		@Test
		public void originalScoreTest() throws HangmanException {
			OriginalScore score = new OriginalScore();
			assertEquals(0, score.calculateScore(5, 10));
		try {
	        score.calculateScore(-5, -5);
	    } catch (HangmanException e) {
	        assertEquals(e.getMessage(),(HangmanException.INVALIDARGUMENT));
	    }
	}
		@Test
		public void bonusScoreTest() throws HangmanException {
			BonusScore score = new BonusScore();
			assertEquals(50, score.calculateScore(5, 0));
			
		try {
			score.calculateScore(-1, -1);
			
		}catch ( HangmanException e) {
			assertEquals(e.getMessage(), HangmanException.INVALIDARGUMENT);

		}
		}
	
}
