package servicios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CadenaTest {

	@Test
	public void verdadero() {
		Cadena cadena = new Cadena();
		
		assertTrue(cadena.contienePalabra("La patata esta negra", "patata"));
		
	}
	
	@Test
	public void falso() {
		Cadena cadena = new Cadena();
		
		assertFalse(cadena.contienePalabra("patata", "xmixta"));
	}
}
