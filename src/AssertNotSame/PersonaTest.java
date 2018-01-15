package AssertNotSame;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void test() {
		
		Persona p1 = new Persona("Lorea", 12); 
		
		
		Persona p2 = new Persona("Laia", 15); 
	
		
		assertNotSame(p1.getNombre(), p2.getNombre());
	}

}
