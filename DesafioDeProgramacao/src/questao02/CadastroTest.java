package questao02;


import org.junit.Assert;
import org.junit.Test;

public class CadastroTest {

	Cadastro cadastro = new Cadastro();
	@Test
	public void testVerificarSenha() {
		boolean b;
		
		b = cadastro.verificarSenha("aaaaaa");
		Assert.assertTrue(b);
		
		b = cadastro.verificarSenha("AAAAAAA");
		Assert.assertTrue(b);
		
		b = cadastro.verificarSenha("333333");
		Assert.assertTrue(b);
		
		b = cadastro.verificarSenha("##***)");
		Assert.assertTrue(b);
		
		b = cadastro.verificarSenha("");
		Assert.assertTrue(b);
		
		b = cadastro.verificarSenha("a&b");
		Assert.assertTrue(b);
		
		b = cadastro.verificarSenha("Vf23)e");
		Assert.assertFalse(b);	
	}
	
	

}
