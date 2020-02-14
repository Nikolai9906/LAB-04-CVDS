import hangman.exceptions.*;
import hangman.model.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

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
 *|3		 | 0 <= Correct <= 10                                       |Valor igual a 0                         |
 *
 * *PowerBonus
 *|  Número  |Clase de equivalencia (en lenguaje natural o matemático)  |Resultado                               |
 *|----------|----------------------------------------------------------|----------------------------------------|
 *|1		 | Incorrect <0 o Correct<0                                 |Arroja una Excepcion (HangManException) |
 *|2		 | SUM(5^N)<8 Incorrect   con N de 1 a Correct	            |Valor igual a 0                         |
 *|3		 |0<= SUM(5^N)-8 Incorrect<=500   con N de 1 a Correct      |Valor entre 500 y 0                     |
 *|4		 |500< SUM(5^N)-8Incorrect   con N de 1 a Correct           |Valor igual a 500                       |
 */

public class GameScoreTest {

		@Test
		public void originalScoreTestLimit10() throws HangmanException {
			OriginalScore score = new OriginalScore();
		try {
			assertEquals(0, score.calculateScore(5, 10));
			assertEquals(90,score.calculateScore(0, 1));
			assertEquals(10,score.calculateScore(0, 9));
			assertEquals(0,score.calculateScore(0, 10));
	    
	    } catch (HangmanException e) {
	        assertEquals(e.getMessage(),(HangmanException.INVALIDARGUMENT));
	    }
	}
		
		
		@Test
		public void originalScoreTestLimitMax() throws HangmanException {
			GameScore score2 = new OriginalScore();
		try {
            assertEquals(0,score2.calculateScore(0, 21));            
            assertEquals(0,score2.calculateScore(0, 172));            
            assertEquals(0,score2.calculateScore(0, 4562158));
	        
	    } catch (HangmanException e) {
	        assertEquals(e.getMessage(),(HangmanException.INVALIDARGUMENT));
	    }
	}
		
		@Test
	    public void ScoreLimiteMenor0() { 
	        try{
	            GameScore score3 = new OriginalScore();
	            score3.calculateScore(0, -1);
	            score3.calculateScore(-1, 0);
	            score3.calculateScore(-1, -1);
	            
	            score3 = new PowerScore();
	            score3.calculateScore(0, -1);
	            score3.calculateScore(-1, 0);
	            score3.calculateScore(-1, -1);
	            
	            score3 = new BonusScore();
	            score3.calculateScore(0, -1);
	            score3.calculateScore(-1, 0);
	            score3.calculateScore(-1, -1);
	            
	            
	            fail("Debe enviar excepcion");
	        }catch(HangmanException e){
	            assertEquals(e.getMessage(),(HangmanException.INVALIDARGUMENT));
	        }
	    }
		
		
		
		@Test
		public void bonusScoreTestLimitMax() throws HangmanException {
			BonusScore score4 = new BonusScore();
			assertEquals(50, score4.calculateScore(5, 0));
			
		try {
            assertEquals(0,score4.calculateScore(1, 3));
            assertEquals(0,score4.calculateScore(3, 6));
            assertEquals(0,score4.calculateScore(0, 0));
            assertEquals(20,score4.calculateScore(3,2));            
            assertEquals(10,score4.calculateScore(2,2));
			
		}catch ( HangmanException e) {
			fail("No debe enviar excepcion");

		}
		}
		@Test
		public void bonusScoreTestLimit2C() throws HangmanException {
			BonusScore score5 = new BonusScore();
			
		try {
			assertEquals(20,score5.calculateScore(3, 2));
            assertEquals(0,score5.calculateScore(3, 6));
            assertEquals(0,score5.calculateScore(0, 0));
            assertEquals(10,score5.calculateScore(1, 0));
            assertEquals(0,score5.calculateScore(0, 1));
            assertEquals(30,score5.calculateScore(3,0)); 
			
		}catch ( HangmanException e) {
			fail("No debe enviar excepcion");

		}
		}
		@Test
	    public void powerScoreTest() {
	        try {
	            GameScore score6 = new PowerScore();
	            assertEquals(0,score6.calculateScore(2, 4));
	            assertEquals(500,score6.calculateScore(7, 4));
	            assertEquals(139,score6.calculateScore(3, 2));
	            
	        } catch (HangmanException e) {
	            fail("No debe enviar excepcion");
	        }
	    }
		
	
}
