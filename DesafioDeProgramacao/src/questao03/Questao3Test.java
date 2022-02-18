package questao03;

import org.junit.Assert;
import org.junit.Test;

public class Questao3Test {

	Questao3 questao3 = new Questao3();
	@Test
	public void test() {
				
		Assert.assertTrue(questao3.anagrama("ovo") >= 0);
		Assert.assertTrue(questao3.anagrama("") >= 0);
		Assert.assertFalse(questao3.anagrama("ifailuhkqq") < 0);
		
	}

}
