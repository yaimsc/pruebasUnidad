package AssertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void test() {
		
		String supuestoNombre ="Lore"; 
		assertEquals(supuestoNombre, Persona.sacarNombre());
	}

}
