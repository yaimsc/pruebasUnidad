package AssertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void test() {
	Persona yaiza = new Persona(); 
	int supuestaEdad = 10; 
	supuestaEdad = supuestaEdad + 1; 
		assertEquals(supuestaEdad, yaiza.cumplirAños(10));
	}

}
