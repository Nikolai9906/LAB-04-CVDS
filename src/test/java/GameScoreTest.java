import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Clases de Equivalencia:
 * 
 * *OriginalScore
 *|  Número  |Clase de equivalencia (en lenguaje natural o matemático)  |Resultado                               |
 *|----------|----------------------------------------------------------|----------------------------------------|
 *|1		 | Incorrect <0 o Correct<0                                 |Arroja una Excepcion (HangManException) |
 *|2		 | 0<= Incorrect <= 10	                                    |Valor entre 100 y 0                     |
 *|3		 | Incorrect > 10	                                        |Valor igual a 0                         |
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
	void test() {
		fail("Not yet implemented");
	}

}
