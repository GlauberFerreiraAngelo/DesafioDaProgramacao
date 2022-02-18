package questao01;

import org.junit.Assert;
import org.junit.Test;

public class EscadaTest {

	Escada escada = new Escada();
	
	@Test
	public void testEscada() {
		
		boolean b;
		
		b = escada.criandoUmaEscada("er");
		Assert.assertFalse(b);
		
		b = escada.criandoUmaEscada("6");
		Assert.assertTrue(b);
		
		b = escada.criandoUmaEscada("34r6t");
		Assert.assertFalse(b);
		
		b = escada.criandoUmaEscada("");
		Assert.assertFalse(b);
		
		b = escada.criandoUmaEscada("#*");
		Assert.assertFalse(b);
		
	}

}
